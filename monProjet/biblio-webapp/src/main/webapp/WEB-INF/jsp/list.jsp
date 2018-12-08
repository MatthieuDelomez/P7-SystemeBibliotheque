<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Biblio</title>
</head>

<body>
    <h2>Liste des Docu</h2>

    <ul>
        <s:iterator value="listDocument">
            <li>
                <s:a action="document_list">
                    <s:param name="id" value="id" />
                    <s:property value="nom"/>
                </s:a>

                - Responsable :
                <s:a action="document_list">
                    <s:param name="id" value="responsable.id" />
                    <s:property value="responsable.prenom"/> <s:property value="responsable.nom"/>
                </s:a>
            </li>
        </s:iterator>
    </ul>
</body>
</html>