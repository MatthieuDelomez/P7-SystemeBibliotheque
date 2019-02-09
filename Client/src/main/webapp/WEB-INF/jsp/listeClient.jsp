<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
                      <!-- Bootstrap -->

                      <link rel="stylesheet"

	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
        
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
        
	crossorigin="anonymous" />
                      
                      
                      <link href="/docs/4.2/dist/css/bootstrap.min.css" rel="stylesheet"
                            
                      integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" 
                      
                      crossorigin="anonymous">
                      
                      

                      

                      <!-- Chargement du fichier style.css -->
                      
                      <link rel="stylesheet" href="resources/css/style.css" />
                      
                      <!-- Inclusion du Header -->
                      
                      <%@ include file="_include/headerEmploye.jsp"%>

        
                      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    
    
    <body>
        
                      <div class="titreClient">
                      <h2>Base Clients</h2>
                      </div>
        
                      <div class="listeClient">
                          <table class="tableClient">
                      <tr>
                              <th>Ref client</th>
                              <th>Ref bibliotheque</th>
                              <th>Nom</th>
                              <th>Prenom</th>
                              <th>Sexe</th>
                              <th>Pseudo</th>
                              <th>Adresse</th>
                              <th>Email</th>
                              <th>Code postal</th>
                      </tr>
                      
                      
                      <tr>                             
                      <ul>
                      <s:iterator value="listClientResponse" var="listeClient">

                      <li><td><s:property value="#listeClient.refClient" /></td></li> 
                      <li><td><s:property value="#listeClient.refBibliotheque" /></td></li>
                      <li><td><s:property value="#listeClient.nom" /></td></li>
                      <li><td><s:property value="#listeClient.prenom" /></td></li>
                      <li><td><s:property value="#listeClient.sexe" /></td></li>
                      <li><td><s:property value="#listeClient.pseudo" /></td></li>
                      <li><td><s:property value="#listeClient.adresse" /></td></li>
                      <li><td><s:property value="#listeClient.email" /></td></li>
                      <li><td><s:property value="#listeClient.codePostal" /></td></li>
                      </ul></tr>
                      </s:iterator>
                      </table></div>
                      </div>

                      
        
    </body>
    
    
</html>