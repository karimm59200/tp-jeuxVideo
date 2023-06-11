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
    <title>Detail du jeux</title>
</head>
<body>
<h1>Detail du jeux qui a pour id ${jeuxVideo.getId()}</h1>

<div>
    Le nom du jeux est ${jeuxVideo.getNom()}<br>
    Description du jeux est ${jeuxVideo.getDescription()}<br>
    Note popularité du jeux est ${jeuxVideo.getNotePopularite()}<br>
    Date de sortie ${jeuxVideo.getDateSortie()}
</div>

<div>
    <img src="${jeuxVideo.getImageUrl()}" alt="photo du jeux">
</div>

</body>
</html>
