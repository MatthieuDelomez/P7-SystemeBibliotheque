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
        
                      <h1>Struts 2 Iterator tag example</h1>

                      <script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
                      <ins class="adsbygoogle"
                      style="display:block"
                      data-ad-client="ca-pub-2836379775501347"
                      data-ad-slot="8821506761"
                      data-ad-format="auto"
                      data-ad-region=""></ins>
                      <script>
                      (adsbygoogle = window.adsbygoogle || []).push({});
                      </script><h2>Simple Iterator</h2>
        
        
                      <ol>
                      <s:iterator value="listPret">
                      <li><s:property /></li>
                      </s:iterator>
                      </ol>

                      <h2>Iterator with IteratorStatus</h2>
                      <table>
                      <s:iterator value="listPret" status="listPretStatus">
                      <tr>
  	<s:if test="#listPretStatus.even == true">
                      <td style="background: #CCCCCC"><s:property/></td>
                     </s:if>
    
                      <s:elseif test="#listPretStatus.first == true">
                      <td><s:property/> (This is first value) </td>
                      </s:elseif>
    
                      <s:else>
                      <td><s:property/></td>
                      </s:else>
                      </tr>
                      </s:iterator>
                      </table>
    
    
    
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
