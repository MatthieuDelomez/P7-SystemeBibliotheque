<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Résultat de votre recherche</title>
        
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
        
    </head>
    
    
    
    
    
    <body>
                      <div class="titreDocument">
                      <h2>Recherche ouvrage</h2>
                      </div>
        
                      <div class="listeDocument">
                          <table class="tableDocument">
                      <tr>
                              <th>Ref ouvrage</th>
                              <th>Ref bibliotheque</th>
                              <th>Nom de l'ouvrage</th>
                              <th>Quantité total</th>
                      </tr>
                      <tr>    
                      <ul>
                      <s:iterator value="listDocumentResponse" var="listeDoc">

                      <li><td><s:property value="#listeDoc.refOuvrage" /></td></li> 
                      <li><td><s:property value="#listeDoc.refBibliotheque" /></td></li>
                      <li><td><s:property value="#listeDoc.nomOuvrage" /></td></li>
                      <li><td><s:property value="#listeDoc.quantiteTotal" /></td></li>
                      </ul></tr>
                      </s:iterator>
                      </table></div>
                      </div>
                      
                      
                       <div class="boutonPret">
                       <a href="${pageContext.request.contextPath}/addDocument" target="_blank"> 
                       <input type="button" value="Ajoutez un document"> </a>
                      </div>
    </body>
    
    
    
    
    


    <!-- Bootstrap core JavaScript -->

    <script src="resources/vendor/jquery/jquery.min.js"></script>

    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>



    <!-- Custom scripts for this template -->

    <script src="resources/js/clean-blog.min.js"></script>
</html>
