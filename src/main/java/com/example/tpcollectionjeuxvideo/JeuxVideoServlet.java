package com.example.tpcollectionjeuxvideo;

import com.entities.JeuxVideo;
import com.services.JeuxVideoService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import static java.lang.System.out;

@WebServlet(name = "JeuxVideoServlet", value = "/JeuxVideoServlet")
public class JeuxVideoServlet extends HttpServlet {

    private JeuxVideoService service;

    public void init() {
        service = new JeuxVideoService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        if (request.getParameter("nom") != null) {
            String nom = request.getParameter("nom");
            String desc = request.getParameter("description");
            int note = Integer.parseInt(request.getParameter("note"));
            LocalDate dateSortie = LocalDate.parse(request.getParameter("dateSortie"));
            String imageUrl = request.getParameter("imageUrl");
            JeuxVideo jeuxVideo = new JeuxVideo(nom, desc, dateSortie, note, imageUrl);
            if (service.create(jeuxVideo)) {
                out.println("<h1>jeuxVideo ajouté</h1>");
            } else {
                out.println("<h1>erreur de données</h1>");
            }
            out.println("</body></html>");
        }
    }

    public void destroy() {
    }
}