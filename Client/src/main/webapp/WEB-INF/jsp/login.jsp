<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
<head></head>

<body>
           <h1>Struts 2 Hello World Example</h1>

	<s:form action="Welcome">
		<s:textfield name="pseudo" label="Pseudo" />
		<s:password name="motpasse" label="Motpasse" />
		<s:submit />
	</s:form>

</body>
</html>
