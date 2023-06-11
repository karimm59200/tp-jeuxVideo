package com.example.tpcollectionjeuxvideo;

import com.services.JeuxVideoService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ListeJeuxServlet", value = "/ListeJeuxServlet")
public class ListeJeuxServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            request.getRequestDispatcher("WEB-INF/listeJeux.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
