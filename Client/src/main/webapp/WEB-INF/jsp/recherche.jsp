<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
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
                      
                      <%@ include file="_include/headerClient.jsp"%>
        
        
    </head>
    

    <body>
        
        


                      <div id="searchbar">
                
                       <h1>What would you like to search?</h1>
                       <s:form action="rechercheLivre" class="formulaire">
                           <s:textfield class="champ" name="nomOuvrage" label="nomOuvrage"  value="Nom de l'ouvrage - Nom de l'auteur"/>
                       <s:submit/>
                       </s:form>
                     
                      </form>
                      </div>
        
        
        
                       <!-- Bootstrap core JavaScript -->
                      
                      <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>                    
                      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
                      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        
    </body>
    
</html>
