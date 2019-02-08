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
        
                      <div class="titrePret">
                      <h2>Historique des Prêts</h2>
                      </div>
        
                      <div class="listePret">
                          <table class="tablePret">
                      <tr>
                              <th>Ref pret</th>
                              <th>Ref ouvrage</th>
                              <th>Ref client</th>
                              <th>Date du pret</th>
                              <th>Durée du prêt</th>
                              <th>Fin du prêt</th>
                              <th>Exemplaire</th>
                              <th>Prolongé</th>
                      </tr>
                      <tr>    
                      <ul>
                      <s:iterator value="listPretResponse" var="pret">

                      <li><td><s:property value="#pret.refPret" /></td></li> 
                      <li><td><s:property value="#pret.refOuvrage" /></td></li>
                      <li><td><s:property value="#pret.refClient" /></td></li>
                      <li><td><s:property value="#pret.datePret" /></td></li>
                      <li><td><s:property value="#pret.dureePret" /></td></li>
                      <li><td><s:property value="#pret.dateFinPret" /></td></li>
                      <li><td><s:property value="#pret.nbrExemplaire" /></td></li>
                      <li><td><s:property value="#pret.isProlonger" /></td></li>
                      </ul></tr>
                      </s:iterator>
                          </table></div>
                      </div>

                      
 
                      <div class="boutonPret">
                       <a href="${pageContext.request.contextPath}/addPret" target="_blank"> 
                       <input type="button" value="Ajoutez un prêt"> </a>
                      </div>
                       
                       
                       <div class="boutonSupp">
                       <a href="${pageContext.request.contextPath}/deletePret" target="_blank"> 
                       <input type="button" value="Supprimez un prêt"> </a>
                      </div>
        
    </body>
    
    
</html>
