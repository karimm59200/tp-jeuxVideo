<%--
  Created by IntelliJ IDEA.
  User: karim
  Date: 09/06/2023
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire d'ajout d'un jeux </title>
</head>
<body>
<h1> Formulaire d'ajout d'un jeux </h1> <br>

<div>
    <form action="JeuxVideoServlet" method="POST" enctype="multipart/form-data">

        <label for="nom">Nom du jeux</label> <br>
        <input type="text" id="nom" name="nom" required >
        <br>
        <label for="description">Description du jeux</label> <br>
        <input type="text" id="description" name="desc" required>
        <br>
        <label for="note">Note de popularité</label> <br>
        <input type="number" id="note" name="note" min=0 max=5 required>
        <br>
        <label for="imageUrl">Image du jeux</label> <br>
        <input type="text" id="imageUrl" name="imageUrl">
        <br>
        <label for="date">Date de sortie</label> <br>
        <input type="text" id="date" name="dateSortie" required>


        <input type="submit" value="Ajouter">
    </form>
</div>
</body>
</html>
