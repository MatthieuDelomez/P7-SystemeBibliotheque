<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajouter un Document</title>
        
        <!-- Bootstrap core CSS -->

<link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">





<!-- Bootstrap -->

<link rel="stylesheet"

	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"

	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"

	crossorigin="anonymous" />

<link rel="stylesheet"

	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"

	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"

	crossorigin="anonymous" />
        
                    <!-- Chargement du fichier style.css -->
                      
                      <link rel="stylesheet" href="resources/css/style.css" />
                      
                      
                      <!-- Inclusion du Header -->
                      
                      <%@ include file="_include/headerEmploye.jsp"%>
                      
                          
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>

    <body>
                      <div class="FormulaireAdd">
                      <h1>Ajouter un Document</h1>
        

	<s:form action="ajouterDocument">
                    	<s:textfield name="refBibliotheque" label="N° Bibliotheque"/>
                      <s:textfield name="nomOuvrage" label="Nom de l'ouvrage" />
                      <s:textfield name="quantiteTotal" label="Quantite total" />
		
	<s:submit />
	</s:form>
                      </div>
                          
        
        
        
                      <!-- Bootstrap core JavaScript -->
                      
                      <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
                      
                      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
                      
                      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


    </body>
    
    
    
    
    
</html>
