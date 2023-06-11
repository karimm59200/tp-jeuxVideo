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
    <form action="jeuxvideoservlet" method="post" >

        <label >Nom du jeux</label> <br>
        <input type="text" name="nom" required >
        <br>
        <label>Description du jeux</label> <br>
        <input type="text" name="description" required>
        <br>
        <label>Note de popularité</label> <br>
        <input type="number" name="notePopularite" min=0 max=5 required>
        <br>
        <label>Image du jeux</label> <br>
        <input type="text" name="imageUrl">
        <br>
        <label>Date de sortie</label> <br>
        <input type="text" name="dateSortie" required>


        <button type="submit" >Valider</button>
    </form>
</div>
</body>
</html>
