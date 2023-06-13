<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Bienvenue sur votre librairie de gestion de jeux vidéos" %>
</h1>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<br/>




<a href="jeuxvideo">1--Liste de tous mes jeux</a>
<br/>
<a href="DetailsServlet">2--Details du jeux </a>
<br/>
<a href="jeuxvideo?status=add">3--Formulaire d'Ajout jeux </a>
<br/>
<a href="ErreurServlet">4--Erreur </a>


</body>
</html>