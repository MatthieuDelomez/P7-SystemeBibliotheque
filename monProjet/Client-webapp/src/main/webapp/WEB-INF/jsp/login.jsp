<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
</head>

<body>
    <%@ include file="./_include/header.jsp" %>

    <h2>Connexion</h2>

    <s:form action="login">
        <s:textfield name="pseudo" label="Identifiant" requiredLabel="true" />
        <s:password name="motPasse" label="Mot de passe" requiredLabel="true" />

        <s:submit value="Connexion"/>
    </s:form>
</body>
</html>