package com.biblio;

import com.responses.BibliothequeResponse;
import org.projet.biblio.consumer.dao.BibliothequeDao;
import org.projet.biblio.model.Bibliotheque;
import com.biblio.resources.AbstractResource;
import com.responses.ClientResponse;
import com.responses.DocumentResponse;
import com.responses.InfoPretResponse;
import com.responses.PretResponse;
import com.responses.UtilisateurResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;
import org.projet.biblio.consumer.dao.ClientDao;
import org.projet.biblio.consumer.dao.DocumentDao;
import org.projet.biblio.consumer.dao.PretDao;
import org.projet.biblio.consumer.dao.UtilisateurDao;
import org.projet.biblio.model.Client;
import org.projet.biblio.model.Document;
import org.projet.biblio.model.InfoPret;
import org.projet.biblio.model.Pret;
import org.projet.biblio.model.Utilisateur;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Service qui va regrouper toutes les méthodes utiles au module Client,
 * pour optimiser le bon fonctionnement de l'application.
 * 
 *
 * @author Delomez Matthieu
 */
@WebService(name="BibliothequeServices") 
public class BibliothequeServices extends AbstractResource {
    
    
    
    /******************************************************************************************************/
    /*******************************************Bibliotheque*********************************************
    /******************************************************************************************************/

    
    
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    
		/* Créer une bibliotheque */
    BibliothequeDao bibliothequeDao = ctx.getBean("bibliothequeDao", BibliothequeDao.class);

    /**
     *
     * @param refBibliotheque
     * @param nom
     * @param adresse
     * @param ville
     * @param codePostal
     * @param description
     * @return
     */
        @WebMethod(operationName="addBiblio") 
        public BibliothequeResponse doAddBibliotheque(@WebParam(name="refbibliotheque") int refBibliotheque,
                                                                                                     @WebParam(name="nom") String nom,
                                                                                                     @WebParam(name="adresse") String adresse,
                                                                                                     @WebParam(name="ville") String ville,
                                                                                                     @WebParam(name="codepostal") String codePostal,
                                                                                                     @WebParam(name="description") String description){
            
            
           Bibliotheque bibliotheque = new Bibliotheque(); 
           BibliothequeResponse response = new BibliothequeResponse();
           
           
               bibliotheque.setRefBibliotheque(refBibliotheque);
               bibliotheque.setNom(nom);
               bibliotheque.setAdresse(adresse);
               bibliotheque.setVille(ville);
               bibliotheque.setCodePostal(codePostal);
               bibliotheque.setDescription(description);

               response.setRefBibliotheque(refBibliotheque);
               response.setNom(nom);
               response.setAdresse(adresse);
               response.setVille(ville);
               response.setCodePostal(codePostal);
               response.setDescription(description);
               
               bibliothequeDao.addBibliotheque(bibliotheque);


               
               return response;     
            
        }
        
        
       /**
       *
       * @param refBibliotheque
       * @return
       */
           
           @WebMethod(operationName = "searchBiblio")
           public BibliothequeResponse doSearchBiblio( @WebParam(name="refbibliotheque") int refBibliotheque){
                
               
               Bibliotheque bibliotheque = new Bibliotheque();
               BibliothequeResponse response = new BibliothequeResponse();
               
               bibliotheque.setRefBibliotheque(refBibliotheque);
               
               
               bibliotheque = bibliothequeDao.getBibliotheque(bibliotheque);
               
               try {
               
               response.setRefBibliotheque(bibliotheque.getRefBibliotheque());
               response.setNom(bibliotheque.getNom());
               response.setAdresse(bibliotheque.getAdresse());
               response.setVille(bibliotheque.getVille());
               response.setCodePostal(bibliotheque.getCodePostal());
               response.setDescription(bibliotheque.getDescription());

               
               } catch (Exception e){
                   e.printStackTrace();
               }
               
               
               return response;
               
           }

    
    
    /******************************************************************************************************/
    /********************************************Document************************************************
    /******************************************************************************************************/
           
    
		/* Créer un document */
    DocumentDao documentDao = ctx.getBean("documentDao", DocumentDao.class);
    
    
    
    /**
     *
     * @param refBibliotheque
     * @param nomOuvrage
     * @param quantiteTotal
     * @return
     */
    @WebMethod(operationName="addDocument") 
    public DocumentResponse doAddBook( 
                                                                                @WebParam(name="refbibliotheque") int refBibliotheque,
                                                                                @WebParam(name="nomouvrage") String nomOuvrage,
                                                                                @WebParam(name="quantitetotal") String quantiteTotal) {
        
         Document document = new Document(); 
         DocumentResponse response = new DocumentResponse();
         
               document.setRefBibliotheque(refBibliotheque);
               document.setNomOuvrage(nomOuvrage);
               document.setQuantiteTotal(quantiteTotal);

               response.setRefBibliotheque(refBibliotheque);
               response.setNomOuvrage(nomOuvrage);
               response.setQuantiteTotal(quantiteTotal);

               
               documentDao.addDocument(document);


               
               return response;               
               
                    
              }
    
    

      /**
     *
     * @param listDocuments 
     * @param nomOuvrage
     */
          @WebMethod(operationName = "listDocument")
          public void listDocument2(@WebParam(name = "nomOuvrage") String nomOuvrage, 
                                                           @WebParam(name = "listDocument", mode = WebParam.Mode.OUT) Holder<List<DocumentResponse>> listDocuments){

                     listDocuments.value = new ArrayList<>();

                     List<Document>listDocument  = new ArrayList<>();
                     List<DocumentResponse>listDocumentResponse  = new ArrayList<>();
                     Document doc = new Document();

                     doc.setNomOuvrage(nomOuvrage);


                     listDocument = documentDao.getAllDocument(doc);
                     
                     
                     for(Document document : listDocument){

                     DocumentResponse documentResponse = new DocumentResponse();

                     documentResponse.setRefOuvrage(document.getRefOuvrage());
                     documentResponse.setRefBibliotheque(document.getRefBibliotheque());
                     documentResponse.setNomOuvrage(document.getNomOuvrage());
                     documentResponse.setQuantiteTotal(document.getQuantiteTotal());


                      listDocumentResponse.add(documentResponse);


                     }

                     listDocuments.value = listDocumentResponse;

                     
                     

                     }

    
     /******************************************************************************************************/
    /***********************************************Pret***************************************************
    /******************************************************************************************************/
           
           
           		/* Créer un pret */
    PretDao pretDao = ctx.getBean("pretDao", PretDao.class);
    
    
    /**
     *
     * @param refOuvrage
     * @param refClient
     * @param refPret
     * @param dureePret
     * @param nbrExemplaire
     * @param prolonger
     * @return
     */
           @WebMethod(operationName = "addPret")
           public PretResponse doCreatePret(@WebParam(name="refpret") int refPret ,  
                                                                             @WebParam(name="refclient") int refClient,
                                                                             @WebParam(name="refouvrage") int refOuvrage,
                                                                             @WebParam(name="dureepret") String dureePret,
                                                                             
                                                                             @WebParam(name="nbrexemplaire") String nbrExemplaire,
                                                                             @WebParam(name="prolonger") boolean prolonger  ) {
               
               
           Pret pret = new Pret(); 
           PretResponse response = new PretResponse();
           
           Date datePret = new Date();
                      
                      Calendar c = Calendar.getInstance();
                      c.setTime(datePret);
                      
                      c.add(Calendar.MONTH, 1);
                      
                      Date dateFinPret = c.getTime();
                      
           
               
               pret.setRefPret(refPret);
               pret.setRefClient(refClient);
               pret.setRefOuvrage(refOuvrage);
               pret.setDatePret(datePret);
               pret.setDureePret(dureePret);
               pret.setDateFinPret(dateFinPret);
               pret.setNbrExemplaire(nbrExemplaire);
               pret.setProlonger(prolonger);

                       
               response.setRefPret(refPret);
               response.setRefOuvrage(refOuvrage);
               response.setRefClient(refClient);
               response.setDatePret(datePret);
               response.setDureePret(dureePret);
               response.setDateFinPret(dateFinPret);
               response.setDureePret(nbrExemplaire);
               response.setProlonger(prolonger);

              pretDao.addPret(pret);
              

               
               return response;               
               
               
           }
           
    /**
     *
     * @param dureePret
     * @param refPret
     * @return
     */
    @WebMethod(operationName = "deletePret")
           public PretResponse doSuppPret(@WebParam(name="dureepret") String dureePret,
                                                                            @WebParam(name="refpret")    int refPret) {
               
           Pret pret = new Pret(); 
           PretResponse response = new PretResponse();
               
               pret.setRefPret(refPret);
               pret.setDureePret(dureePret);
               
               
               
               pretDao.deletePret(pret);
               
              
               
               try{
               
               response.setRefPret(pret.getRefPret());
               response.setRefOuvrage(pret.getRefOuvrage());
               response.setRefClient(pret.getRefClient());
               response.setDatePret(pret.getDatePret());
               response.setDureePret(pret.getDureePret());
               response.setDateFinPret(pret.getDateFinPret());
               response.setNbrExemplaire(pret.getNbrExemplaire());
               response.setProlonger(pret.isProlonger());


               } catch (Exception e){
                   e.printStackTrace();
               }
               
               return response;
           

               }


           
           
       /**
       *
       * @param refPret
       * @return
       */
           
           @WebMethod(operationName = "searchPret")
           public PretResponse doSearchPret( @WebParam(name="refpret") int refPret){
                
               
               Pret pret = new Pret();
               PretResponse response = new PretResponse();
               
               pret.setRefPret(refPret);
               
               
               pret = pretDao.getPret(pret);
               
               try {
               
               response.setRefPret(pret.getRefPret());
               response.setRefOuvrage(pret.getRefOuvrage());
               response.setRefClient(pret.getRefClient());
               response.setDatePret(pret.getDatePret());
               response.setDureePret(pret.getDureePret());
               response.setDateFinPret(pret.getDateFinPret());
               response.setNbrExemplaire(pret.getNbrExemplaire());
               response.setProlonger(pret.isProlonger());
               
               } catch (Exception e){
                   e.printStackTrace();
               }
               
               
               return response;
               
           }
           
    /**
     *
     * @param listPrets
     */
    @WebMethod(operationName ="listPret")
           public void listPret2(@WebParam(name = "listPret", mode = WebParam.Mode.OUT) Holder<List<PretResponse>> listPrets){

                    listPrets.value = new ArrayList<>();
                
                List<Pret>listPret  = new ArrayList<>();
                List<PretResponse>listPretResponse  = new ArrayList<>();
                listPret = pretDao.getAllPret();


                      for(Pret pret : listPret){
	PretResponse pretResponse = new PretResponse();
                      
                      pretResponse.setRefPret(pret.getRefPret());
	pretResponse.setRefOuvrage(pret.getRefOuvrage());
                      pretResponse.setRefClient(pret.getRefClient());
                      pretResponse.setDatePret(pret.getDatePret());
                      pretResponse.setDureePret(pret.getDureePret());
                      pretResponse.setDateFinPret(pret.getDateFinPret());
                      pretResponse.setNbrExemplaire(pret.getNbrExemplaire());
                      pretResponse.setProlonger(pret.isProlonger());

	listPretResponse.add(pretResponse);

                      }

                      listPrets.value = listPretResponse;
               
           
                      }

           
     /******************************************************************************************************/
    /********************************************Utilisateur************************************************
    /******************************************************************************************************/
           
           		/* Créer un utilisateur */
    UtilisateurDao utilisateurDao = ctx.getBean("utilisateurDao", UtilisateurDao.class);
    
    
    /**
     *
     * @param pseudo
     * @param motPasse
     * @return
     */
           @WebMethod(operationName = "doLogin")
           public UtilisateurResponse doLogin( @WebParam(name="pseudo") String pseudo,  
                                                                               @WebParam(name="motPasse") String motPasse ){

           Utilisateur utilisateur = new Utilisateur(); 
           UtilisateurResponse response = new UtilisateurResponse();
               
               utilisateur.setPseudo(pseudo);
               utilisateur.setMotPasse(motPasse);
               
               
               utilisateur = utilisateurDao.getUtilisateur(utilisateur);
               

               
               try{
                   
               
               response.setPseudo(utilisateur.getPseudo());
               response.setMotPasse(utilisateur.getMotPasse());
               response.setNom(utilisateur.getNom());
               response.setPrenom(utilisateur.getPrenom());
               response.setEmail(utilisateur.getEmail());
               response.setRefBibliotheque(utilisateur.getRefBibliotheque());
               response.setIdUtilisateur(utilisateur.getIdUtilisateur());

               
               } catch (Exception e){
                   e.printStackTrace();
                   return null;
                   
               }
               
               return response;
           

               }
           
    /**
     *
     * @param refBibliotheque
     * @param pseudo
     * @param motPasse
     * @param email
     * @param nom
     * @param prenom
     * @return
     */
    @WebMethod(operationName ="addUser")
           public UtilisateurResponse doCreateUser( 
                                                                                          @WebParam(name="refbibliotheque") int refBibliotheque,
                                                                                          @WebParam(name="pseudo") String pseudo, 
                                                                                          @WebParam(name="motPasse") String motPasse,
                                                                                          @WebParam(name="email") String email,
                                                                                          @WebParam(name="nom") String nom,
                                                                                          @WebParam(name="prenom") String prenom)  {
               
           UtilisateurResponse response = new UtilisateurResponse();
           Utilisateur utilisateur = new Utilisateur();
           
           utilisateur.setMotPasse(motPasse);
           utilisateur.setNom(nom);
           utilisateur.setPrenom(prenom);
           utilisateur.setPseudo(pseudo);
           utilisateur.setEmail(email);
           utilisateur.setRefBibliotheque(refBibliotheque);
           utilisateur.setNom(nom);
           
           response.setMotPasse(motPasse);
           response.setNom(nom);
           response.setPrenom(prenom);
           response.setPseudo(pseudo);
           response.setEmail(email);
           response.setRefBibliotheque(refBibliotheque);
           response.setNom(nom);


           
           utilisateurDao.addUtilisateur(utilisateur);
               
           
               return response;
           
               
               
           }
           
           
           
     /******************************************************************************************************/
    /************************************************Client************************************************
    /******************************************************************************************************/

           		/* Créer un client */
    ClientDao clientDao = ctx.getBean("clientDao", ClientDao.class);
    
    
        
    /**
     *
     * @param pseudo
     * @param motPasse
     * @return
     */
           @WebMethod(operationName = "doLoginClient")
           public ClientResponse doLoginClient( @WebParam(name="pseudo") String pseudo,  
                                                                                  @WebParam(name="motpasse") String motPasse ){

           Client client = new Client(); 
           ClientResponse response = new ClientResponse();
               
               client.setPseudo(pseudo);
               client.setMotPasse(motPasse);
               
               
               client = clientDao.getClient(client);
               
              
               
               try{
                   
               
               response.setPseudo(client.getPseudo());
               response.setMotPasse(client.getMotPasse());
               response.setNom(client.getNom());
               response.setPrenom(client.getPrenom());
               response.setEmail(client.getEmail());
               response.setRefBibliotheque(client.getRefBibliotheque());
               response.setRefClient(client.getRefClient());
               response.setSexe(client.getSexe());
               response.setAdresse(client.getAdresse());
               response.setCodePostal(client.getCodePostal());
                   

               } catch (Exception e){
                   e.printStackTrace();
                   return null;
               }
               
               
               
               return response;
           

               }
           
    /**
     *
     * @param refBibliotheque
     * @param nom
     * @param prenom
     * @param sexe
     * @param pseudo
     * @param motPasse
     * @param adresse
     * @param email
     * @param codePostal
     * @return
     */
            @WebMethod(operationName ="addClient")
            public ClientResponse doCreateClient(        
            @WebParam(name="refbibliotheque") int refBibliotheque,
            @WebParam(name="nom") String nom,
            @WebParam(name="prenom") String prenom,
            @WebParam(name="sexe") String sexe,
            @WebParam(name="pseudo") String pseudo, 
            @WebParam(name="motPasse") String motPasse,
            @WebParam(name="adresse") String adresse,
            @WebParam(name="email") String email,
            @WebParam(name="codepostal") String codePostal) {
               
           ClientResponse response = new ClientResponse();
           Client client = new Client();
           

           
           client.setRefBibliotheque(refBibliotheque);
           client.setNom(nom);
           client.setPrenom(prenom);
           client.setSexe(sexe);
           client.setPseudo(pseudo);
           client.setMotPasse(motPasse);
           client.setAdresse(adresse);
           client.setEmail(email);
           client.setCodePostal(codePostal);


           
           response.setRefBibliotheque(refBibliotheque);
           response.setNom(nom);
           response.setPrenom(prenom);
           response.setSexe(sexe);
           response.setPseudo(pseudo);
           response.setMotPasse(motPasse);
           response.setAdresse(adresse);
           response.setEmail(email);
           response.setCodePostal(codePostal);



           
           clientDao.addClient(client);
               
           
               return response;
           
               
               
           }
           
    /**
     *
     * @param refClient
     * @return
     */
    @WebMethod(operationName = "deleteClient")
           public ClientResponse doSuppClient(@WebParam(name="refclient") int refClient) {
               
           Client client = new Client(); 
           ClientResponse response = new ClientResponse();
               
               client.setRefClient(refClient);
               
               
               
               clientDao.deleteClient(client);
               
              
               
               try{
               
                      response.setNom(client.getNom());
                      response.setRefClient(client.getRefClient());
	response.setRefBibliotheque(client.getRefBibliotheque());
                      response.setPrenom(client.getPrenom());
                      response.setSexe(client.getSexe());
                      response.setPseudo(client.getPseudo());
                      response.setMotPasse(client.getMotPasse());
                      response.setAdresse(client.getAdresse());
                      response.setEmail(client.getEmail());
                      response.setCodePostal(client.getCodePostal());


               } catch (Exception e){
                   e.printStackTrace();
               }
               
               return response;
           

               }
           
    /**
     *
     * @param listClients
     */
    @WebMethod(operationName ="listClient")
           public void listClient2(@WebParam(name = "listClient", mode = WebParam.Mode.OUT) Holder<List<ClientResponse>> listClients){

                      listClients.value = new ArrayList<>();
                
                      List<Client>listClient  = new ArrayList<>();
                      List<ClientResponse>listClientResponse  = new ArrayList<>();
                      listClient = clientDao.getAllClient();


                      for(Client client : listClient){
	ClientResponse clientResponse = new ClientResponse();
                      
                      clientResponse.setRefClient(client.getRefClient());
	clientResponse.setRefBibliotheque(client.getRefBibliotheque());
                      clientResponse.setNom(client.getNom());
                      clientResponse.setPrenom(client.getPrenom());
                      clientResponse.setSexe(client.getSexe());
                      clientResponse.setPseudo(client.getPseudo());
                      clientResponse.setMotPasse(client.getMotPasse());
                      clientResponse.setAdresse(client.getAdresse());
                      clientResponse.setEmail(client.getEmail());
                      clientResponse.setCodePostal(client.getCodePostal());
                      

	listClientResponse.add(clientResponse);

                      }

                      listClients.value = listClientResponse;
               
           
                      }
           
    /**
     *
     * @param listInfoDocument
     */
    @WebMethod(operationName = "listInfoDocument")
           public void listEmailClient2(  @WebParam(name = "listInfoDocument", mode = WebParam.Mode.OUT) Holder<List<InfoPretResponse>> listInfoDocument
                                                                ) {
               
               

                      listInfoDocument.value = new ArrayList<>();
                      
                                      

                      List<InfoPret>listInfoPret  = new ArrayList<>();
                      
                      
                      List<InfoPretResponse>listInfoPretResponse  = new ArrayList<>();
                      
                      
                      listInfoPret = pretDao.getInfoPret();
                      
                      
                      for(InfoPret infoPret : listInfoPret) {
                      InfoPretResponse infoPretResponse = new InfoPretResponse();    
                      
                      infoPretResponse.setNomOuvrage(infoPret.getNomOuvrage());
                      infoPretResponse.setEmail(infoPret.getEmail());
                      infoPretResponse.setDateFinPret(infoPret.getDateFinPret());
                      
                      listInfoPretResponse.add(infoPretResponse);
                          
                      }
                      
                      listInfoDocument.value = listInfoPretResponse;
                      
                      
           }
                      
                      
                   

           
    
}


