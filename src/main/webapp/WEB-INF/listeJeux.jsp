<%--
  Created by IntelliJ IDEA.
  User: karim
  Date: 09/06/2023
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Liste des jeux</h1> <br><br>

<c:forEach items="${jeux}" var="jeu">

    <div>
        <img src="${jeu.imageUrl}" alt="image du jeu" width="200" height="200">
        name : ${jeu.nom} <br>
    </div>
    <div>
    <a href="">Modifier jeux</a> <br>
    <a href="">Supprimer jeux</a> <br>
    <a href="">Plus de détails</a> <br>
    </div>

    </c:forEach>

</body>
</html>
