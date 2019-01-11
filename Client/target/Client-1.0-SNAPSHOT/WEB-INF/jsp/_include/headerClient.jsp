<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<meta charset="utf-8" />

<title>Bibliotheque</title>



<nav class="navbar navbar-inverse navbar-fixed-top">

	<div class="container">

		<div class="navbar-header">

			<button type="button" class="navbar-toggle collapsed"

				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">

				<span class="sr-only">Connexion</span> 

				<span

					class="icon-bar"></span> <span class="icon-bar"></span> <span

					class="icon-bar"></span>

			</button>

			<a class="navbar-brand" href="#">${application.name}</a>

		</div>


		<div id="navbar" class="collapse navbar-collapse">

			<ul class="nav navbar-nav">

				<li class="active">
                                    
                                                                                        <a href="${pageContext.request.contextPath}/accueilLog">Home</a></li>

                                                                                         <li><a href="${pageContext.request.contextPath}/actu">Actualité</a></li>
                                                                                         
                                		                      <li><a href="${pageContext.request.contextPath}/recherche">Recherche</a></li>

	

			</ul>


		</div>

	</div>

</nav>
