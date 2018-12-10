<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="jsp/_include/head.jsp" %>
</head>

<body>
    <%@ include file="jsp/_include/header.jsp" %>

    <h2>Connexion</h2>

    <s:form action="pseudo">
        <s:textfield name="pseudo" label="Identifiant" requiredLabel="true" />
        <s:password name="motpasse" label="Mot de passe" requiredLabel="true" />

        <s:submit value="Connexion"/>
    </s:form>
</body>
</html>