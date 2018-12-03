<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Biblio</title>
</head>

<body>
    <h2>Détail du document</h2>

    <ul>
        <li>ID : <s:property value="document.id" /></li>
        <li>Nom : <s:property value="document.nom" /></li>
        <li>Date création : <s:date name="document.dateCreation" /></li>
        <li>
            Responsable :
            <s:a action="utilisateur_detail">
                <s:param name="id" value="document.responsable.id" />
                <s:property value="document.responsable.prenom"/> <s:property value="document.responsable.nom"/>
            </s:a>
        </li>
        <li>Cloturé : <s:property value="document.cloture" /></li>
    </ul>
</body>
</html>