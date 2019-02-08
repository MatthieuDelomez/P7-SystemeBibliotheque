<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
    <head>
                              <!-- Bootstrap -->

                      <link rel="stylesheet"

	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
        
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
        
	crossorigin="anonymous" />
                      

                      <!-- Chargement du fichier style.css -->
                      
                      <link rel="stylesheet" href="resources/css/style.css" />
                      
                      
                      <!-- Inclusion du Header -->
                      
                      <%@ include file="_include/header.jsp"%>
        
    </head>
    
    
    
    
    <body>
                     <div class="titrageLog">
                      <h1>Supprimez un prêt</h1>
           
	<s:form action="supprimerPret">
	<s:textfield name="refpret" label="refpret" value="refpret" />
	<s:textfield name="datefinpret" label="datefinpret" value="datefinpret" />
	<s:submit />
	</s:form>
                     </div >
    
    
    
    
    
    </body>
    
    
    
    
    
</html>
