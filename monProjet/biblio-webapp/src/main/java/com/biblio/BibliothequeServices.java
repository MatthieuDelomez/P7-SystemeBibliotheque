package com.biblio;

import com.responses.BibliothequeResponse;
import org.projet.biblio.consumer.dao.BibliothequeDao;
import org.projet.biblio.model.Bibliotheque;
import com.biblio.resources.AbstractResource;
import com.responses.ClientResponse;
import com.responses.DocumentResponse;
import com.responses.PretResponse;
import com.responses.UtilisateurResponse;
import java.util.ArrayList;
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
import org.projet.biblio.model.Pret;
import org.projet.biblio.model.Utilisateur;
import org.projet.biblio.business.manager.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@WebService(name="BibliothequeServices") 
public class BibliothequeServices extends AbstractResource {
    
    
    
    /******************************************************************************************************/
    /*******************************************Bibliotheque*********************************************
    /******************************************************************************************************/

    
    
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    
		/* Créer un utilisateur */
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
           
    
		/* Créer un utilisateur */
    DocumentDao documentDao = ctx.getBean("documentDao", DocumentDao.class);
    
    
    
    /**
     *
     * @param refOuvrage
     * @param refBibliotheque
     * @param nomOuvrage
     * @param quantiteTotal
     * @return
     */
    @WebMethod(operationName="addDocument") 
    public DocumentResponse doAddBook(@WebParam(name="refouvrage") int refOuvrage,  
                                                                                @WebParam(name="refbibliotheque") int refBibliotheque,
                                                                                @WebParam(name="nomouvrage") String nomOuvrage,
                                                                                @WebParam(name="quantitetotal") String quantiteTotal) {
        
         Document document = new Document(); 
         DocumentResponse response = new DocumentResponse();
               
               document.setRefOuvrage(refOuvrage);
               document.setRefBibliotheque(refBibliotheque);
               document.setNomOuvrage(nomOuvrage);
               document.setQuantiteTotal(quantiteTotal);

         
               response.setRefOuvrage(refOuvrage);
               response.setRefBibliotheque(refBibliotheque);
               response.setNomOuvrage(nomOuvrage);
               response.setQuantiteTotal(quantiteTotal);

               
               documentDao.addDocument(document);


               
               return response;               
               
                    
              }
    
    
        /**
       *
       * @param nomOuvrage
       * @return
       */
        
           @WebMethod(operationName = "searchBook")
           public DocumentResponse doSearchBook( @WebParam(name="nomouvrage") String nomOuvrage) {
               
               
               Document document = new Document();
               DocumentResponse response = new DocumentResponse();
               
               document.setNomOuvrage(nomOuvrage);

               
               document = documentDao.getDocument(document);
               
               try {
                   
                      System.out.println(nomOuvrage);
                      System.out.println(document.getRefOuvrage());

                   
               response.setRefOuvrage(document.getRefOuvrage());
               response.setRefBibliotheque(document.getRefBibliotheque());
               response.setNomOuvrage(document.getNomOuvrage());
               response.setQuantiteTotal(document.getQuantiteTotal());
                   
               } catch (Exception e) {
                   e.printStackTrace();
                   
               }
               
  
               
               return response;
               
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
     * @param datePret
     * @param dureePret
     * @param dateFinPret
     * @param nbrExemplaire
     * @param prolonger
     * @return
     */
           @WebMethod(operationName = "addPret")
           public PretResponse doCreatePret(@WebParam(name="refpret") int refPret ,  
                                                                             @WebParam(name="refclient") int refClient,
                                                                             @WebParam(name="refouvrage") int refOuvrage,
                                                                             @WebParam(name="datepret") String datePret,
                                                                             @WebParam(name="dureepret") String dureePret,
                                                                             @WebParam(name="datefinpret") String dateFinPret,
                                                                             @WebParam(name="nbrexemplaire") String nbrExemplaire,
                                                                             @WebParam(name="prolonger") boolean prolonger  ) {
               
           Pret pret = new Pret(); 
           PretResponse response = new PretResponse();
               
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
           
           
           
           @WebMethod(operationName ="listPret")
           public void listPret2(@WebParam(name = "listPrets", mode = WebParam.Mode.OUT) Holder<List<PretResponse>> listPrets){

                listPrets.value = new ArrayList<>();
                  
                /*
                creer 2 pret pour test
                */
                PretResponse pr1 = new PretResponse();
                
                PretResponse pr2 = new PretResponse();
                
                PretResponse pr3 = new PretResponse();

                
                pr1.setRefPret(1);
                pr1.setRefClient(1);
                pr1.setRefOuvrage(1);
                pr1.setDatePret("04/12/2018");
                pr1.setDureePret("4 semaines");
                pr1.setDateFinPret("21/12/2018");            
                pr1.setNbrExemplaire("1");
                pr1.setProlonger(false);
                
                
                pr2.setRefPret(2);
                pr2.setRefClient(1);
                pr2.setRefOuvrage(2);
                pr2.setDatePret("19/12/2018");
                pr2.setDureePret("4 semaines");
                pr2.setDateFinPret("16/01/2019");            
                pr2.setNbrExemplaire("1");
                pr2.setProlonger(false);
                
                
                pr3.setRefPret(3);
                pr3.setRefClient(1);
                pr3.setRefOuvrage(1);
                pr3.setDatePret("21/12/2018");
                pr3.setDureePret("2 jours");
                pr3.setDateFinPret("23/12/2019");            
                pr3.setNbrExemplaire("1");
                pr3.setProlonger(true);
      
                
                /*
                 Ajouter les 2 prêts à la list
                */
                listPrets.value.add(pr1);
                listPrets.value.add(pr2);
                listPrets.value.add(pr3);
                
                 System.out.println(listPrets.value.size());
                 System.out.println(pr1);
                 System.out.println(pr2);

                             
           
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
               
               
               System.out.println(utilisateur.getPseudo());
               System.out.println(utilisateur.getMotPasse());

               
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
               }
               
               return response;
           

               }
           
           
           
           @WebMethod(operationName ="addUser")
           public UtilisateurResponse doCreateUser( @WebParam(name="idutilisateur") int idUtilisateur,
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
           utilisateur.setIdUtilisateur(idUtilisateur);
           
           response.setMotPasse(motPasse);
           response.setNom(nom);
           response.setPrenom(prenom);
           response.setPseudo(pseudo);
           response.setEmail(email);
           response.setRefBibliotheque(refBibliotheque);
           response.setNom(nom);
           response.setIdUtilisateur(idUtilisateur);


           
           utilisateurDao.addUtilisateur(utilisateur);
               
           
               return response;
           
               
               
           }
           
           
           
     /******************************************************************************************************/
    /************************************************Client************************************************
    /******************************************************************************************************/

           		/* Créer un utilisateur */
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
               
               
               System.out.println(client.getPseudo());
               System.out.println(client.getMotPasse());
              
               
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
               }
               
               return response;
           

               }
           
           
           
           @WebMethod(operationName ="addClient")
           public ClientResponse doCreateClient(         @WebParam(name="refclient") int refClient,
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
           

           
           client.setRefClient(refClient);
           client.setRefBibliotheque(refBibliotheque);
           client.setNom(nom);
           client.setPrenom(prenom);
           client.setSexe(sexe);
           client.setPseudo(pseudo);
           client.setMotPasse(motPasse);
           client.setAdresse(adresse);
           client.setEmail(email);
           client.setCodePostal(codePostal);


           
           response.setRefClient(refClient);
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

           
    
}


