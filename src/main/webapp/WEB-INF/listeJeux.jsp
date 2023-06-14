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
<body>
<h1>Liste des jeux </h1> <br><br>


<%--<c:if test="${JeuxVideo != null}">--%>
<div>
    <c:forEach items="${jeuxVideo}" var="jeu">

        <div>
            <img src="${jeu.getImageUrl()}" alt="image du jeu" >
             <br>
                <h3>Nom du jeux : ${jeu.getNom()}</h3>
             <br>
        </div>
        <div>
            <a href="jeuxvideo?status=edit&id=${jeu.getId()}">Modifier jeux</a> <br>
            <a href="jeuxvideo?status=delete&id=${jeu.getId()}">Supprimer jeux</a> <br>
            <a href="?id=${jeu.getId()}">Plus de détails</a> <br>

        </div>
    </c:forEach>
</div>

<%--</c:if>--%>


</body>
<head>
    <title>Title</title>
</head>
</html>
