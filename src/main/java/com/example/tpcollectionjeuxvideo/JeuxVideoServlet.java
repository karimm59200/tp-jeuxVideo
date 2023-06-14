package com.example.tpcollectionjeuxvideo;

import com.entities.JeuxVideo;
import com.services.JeuxVideoService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name = "jeuxvideoservlet", value = "/jeuxvideo")
public class JeuxVideoServlet extends HttpServlet {

    private JeuxVideoService service;

    public void init() {
        service = new JeuxVideoService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("id") != null && request.getParameter("status") ==null){
            int id = Integer.parseInt(request.getParameter("id"));
            JeuxVideo jeuxVideo = service.findById(id);
            request.setAttribute("jeuxVideo", jeuxVideo);
            request.getRequestDispatcher("WEB-INF/detailsJeux.jsp").forward(request, response);
        }else if (request.getParameter("status") != null && !request.getParameter("status").equals("delete")){

            if(request.getParameter("status").equals("add")){
                request.getRequestDispatcher("WEB-INF/formulaireAjout.jsp").forward(request, response);
            } else{
                int id = Integer.parseInt(request.getParameter("id"));
                JeuxVideo jeuxVideo = service.findById(id);
                request.setAttribute("jeuxVideo", jeuxVideo);
                request.getRequestDispatcher("WEB-INF/formulaireAjout.jsp").forward(request, response);
            }
        } else if(request.getParameter("status") ==null ){
            List<JeuxVideo> jeuxVideo = service.findAll();
            request.setAttribute("jeuxVideo", jeuxVideo);
            jeuxVideo.forEach(out::println);
            request.getRequestDispatcher("WEB-INF/listeJeux.jsp").forward(request, response);
        }

        if(request.getParameter("id") != null && request.getParameter("status") != null && request.getParameter("status").equals("delete")){
            int id = Integer.parseInt(request.getParameter("id"));
            JeuxVideo jeuxVideo = service.findById(id);
            service.delete(jeuxVideo );
            response.sendRedirect("jeuxvideo");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        if(request.getParameter("status").equals("add")){
            if (request.getParameter("nom") != null) {
                String nom = request.getParameter("nom");
                String desc = request.getParameter("description");
                int note = Integer.parseInt(request.getParameter("notePopularite"));
                LocalDate dateSortie = LocalDate.parse(request.getParameter("dateSortie"));
                String imageUrl = request.getParameter("imageUrl");
                JeuxVideo jeuxVideo = new JeuxVideo(nom, desc, dateSortie, note, imageUrl);
                String urlImage = "https://picsum.photos/id/" + imageUrl + "/300/300";
                //String urlImage = imageUrl;
                jeuxVideo.setImageUrl(urlImage);
                if (service.create(jeuxVideo)) {
                    out.println("<h1>jeuxVideo ajouté</h1>");
                } else {
                    out.println("<h1>erreur de données</h1>");
                }
                out.println("</body></html>");
            }
        }
        else{
            int id = Integer.parseInt(request.getParameter("id"));
            String nom = request.getParameter("nom");
            String desc = request.getParameter("description");
            int note = Integer.parseInt(request.getParameter("notePopularite"));
            LocalDate dateSortie = LocalDate.parse(request.getParameter("dateSortie"));
            String imageUrl = request.getParameter("imageUrl");
            String urlImage = "https://picsum.photos/id/" + imageUrl + "/300/300";
            //String urlImage = imageUrl;

            JeuxVideo jeuxVideo = new JeuxVideo(nom, desc, dateSortie, note, urlImage);
            jeuxVideo.setId(id);
            if (service.update(jeuxVideo)) {
                //out.println("<h1>jeuxVideo modifié</h1>");
                response.sendRedirect("jeuxvideo");
            } else {
                out.println("<h1>erreur de données lors de la modification</h1>");
            }
            out.println("</body></html>");

        }

    }

    public void destroy() {
    }
}