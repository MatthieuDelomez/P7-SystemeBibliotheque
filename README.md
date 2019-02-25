# Systeme d'information de librairie
<br>
<br>
Parcours: OpenClassrooms - Développeur d'application Java/JEE.
<br>
Projet N°7: Développez le système d'information d'une librairie.
<br>
<br>

# Architecture

<br>
<ul>
  <li>
    Web Service: SAOP Web service 5.5.0
  </li>
  <li>
    Batch: Systeme d'envoi d'email automatisé
  </li>
  <li>
    Client: Application web
  </li>
  <ul>    
<br>

# Framework

<br>
<ul>
  <li>
    Spring Framework 4.3.11
  </li>
  <li>
    Apache Struts 2.5.14
  </li>
  <li>
    Java Mail 1.6.2
    </li>
  <li>
    Apache Log4j 2.9.1
  </li>
  <li>
    Apache Cxf 3.0.2
  </li>
  <li>
    Struts Core 2.5.18
  </li>
  <li>
    Apache Maven 3.6.0
  </li>
  <li>
    Spring Web 3.0.5
  </li>
  </ul>
  <br>
  
  # Base de donnée
  
  <br>
  <ul>
  <li>
    PostgreSQL 9.5.13
  </li>
  <li>
    PGAdmin III
  </li>
  <li>
    SQL Power Architect
  </li>
  </ul>
  <br>
  
  # Description
  
  <br> 
  
  Fontionnalités du Web service :
  
  <ul>
  <li>
    Authentification de l'utilisateur [Employé / Client]
  </li>
  <li>
    Récupération des ouvrages emprunté par un client
  </li>
  <li>
    Possibilité d'effectuer une recherche en fonction du nom d'ouvrage
  </li>
  <li>
    Suppression et création de nouveau prêt ainsi qu'un historique
  </li>
  <li>
    Création d'un nouveau compte coté client et employé
  </li>
  <li>
    Récupérer la liste des ouvrages dont la date est expirée
  </li>
  <ul>
    <br>
    
 Le web service est le seul systeme à ce connecter à la base de données.
 
 <br>
    
 # Le batch:
 
 Chemin du Batch: Batch/target/batch-1.0-SNAPSHOT.jar
 
 Le batch effectue une suite d'envoi d'email automatisé, ce dernier ce connecte
    au web service pour récupérer la liste des ouvrages dont la date est expirée.
    
 Un fichier properties est necessaire pour le bon fonctionnement du programme, afin de configurer le serveur d'envoi. Vous devez donc configurer les données pour l'authetification c'est à dire le username et le mot de passe :
   
    #Config
    mail.smtp.host=smtp.gmail.com [Domaine d'utilisation]
    mail.smtp.port=587
    mail.smtp.starttls.enable=true
    mail.smtp.auth=true

    #Authentication
    mail.auth.user=email_no_reply@gmail.com [Username]
    mail.auth.pass=*********** [Mot de Passe]

<br>

# Déploiement

Le déploiement s'assure avec la resources JNDI pour connecter le web service à la base de données.
<br>
<ul>
  <li>
    Téléchargez ou clonez le projet via Github
  </li>
  <li>
    Décompréssez votre fichier .zip que vous venez de télécharger
  </li>
   <li>
     Ouvrez le dossier "PostgreSql" 
  </li>
  <li>
    Télécharger PGAdmin III et créez une nouvelle base de données qui se nomme "Biblio"
  </li>    
  <li>
    Exécutez le script "Domaine fonctionnel.sql" dans l'onglet Sql
  </li>
  <li>
    Ouvrez  le dossier "ScriptSqlClient" et exécutez les scripts Sql dans l'ordre de la documentation
  </li>
  <li>
    Importez les modules "monProjet", "Client" et "Batch" dans l'environnement de développement de votre choix
  </li>
  <li>
    Configurez votre serveur local
  </li>
  <li>
    Lancez le service "Biblio-webapp" en faisant un clic droit puis "run"
  </li>
   <li>
   Exécutez le(s) module(s) "Client" et/ou "Batch" une fois le service lancé
  </li>    
  </ul>
  
 <br>
 <br>
 
 # Contact
 <ul>
  <li>
    Site: <a title="Site" href="http://www.matthieudelomez.fr">
     matthieudelomez.fr</a>
  </li>
  <li>
    Linkedin: <a title="Linkedin" href="https://www.linkedin.com/in/matthieu-delomez-8a46b9146/">
     https://www.linkedin.com/in/matthieu-delomez</a>
  </li>
  <li>
    Mail: <a title="mail" href="matthieu.delomez@gmail.com">
     matthieu.delomez@gmail.com</a>
  </li>
  </ul>
  <br>
    
