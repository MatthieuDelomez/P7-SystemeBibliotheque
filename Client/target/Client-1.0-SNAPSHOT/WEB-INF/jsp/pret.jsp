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
                      
                      

        
    </head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des prêts</title>
    </head>
    
    
    
    <body>
        
        
        
      <logic:iterate id="pret" name="pret">
       <tr>
       <td><bean:write name="pret" property="refouvrage"/></td>
       <td><bean:write name="pret" property="refclient"/></td>
       <td>
       </tr> 
     </logic:iterate>
    
    
    
       <!-- Bouton Reserver   

        <div class="form-group">
            <div class="BoutonFormuPret">
                <button type="submit" class="btn btn-primary" ><span  class="glyphicon glyphicon-log-in"></span> Réserver</button>
            </div>
        </div>
    </form>
    -->
    
    <a href="${pageContext.request.contextPath}/addPret" target="_blank"> <input type="button" value="Bouton"> </a>
        
        
    </body>
    
    
</html>
