package com.example.tpcollectionjeuxvideo;

import com.entities.JeuxVideo;
import com.services.JeuxVideoService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DetailsServlet", value = "/DetailsServlet")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50 // 50MB
)
public class DetailsServlet extends HttpServlet {

    private JeuxVideoService service;

    public void init() {
        service = new JeuxVideoService();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getParameter("id") != null && !request.getParameter("id").equals("")){
            int id = Integer.parseInt(request.getParameter("id"));
            JeuxVideo jeuxVideo = service.findById(id);
            request.setAttribute("jeux", jeuxVideo);
            request.getRequestDispatcher("WEB-INF/details.jsp").forward(request, response);
        }
        else{

            request.setAttribute("jeux", service.findAll());
            response.sendRedirect("ListeJeuxServlet");
        }
        //request.getRequestDispatcher("WEB-INF/details.jsp").forward(request, response

    }


}
