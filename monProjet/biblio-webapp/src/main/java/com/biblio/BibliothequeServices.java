package com.biblio;

import com.responses.BibliothequeResponse;
import org.projet.biblio.consumer.dao.BibliothequeDao;
import org.projet.biblio.model.Bibliotheque;
import com.biblio.resources.AbstractResource;
import com.responses.DocumentResponse;
import com.responses.PretResponse;
import com.responses.UtilisateurResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.consumer.dao.DocumentDao;
import org.projet.biblio.consumer.dao.PretDao;
import org.projet.biblio.consumer.dao.UtilisateurDao;
import org.projet.biblio.model.Document;
import org.projet.biblio.model.Pret;
import org.projet.biblio.model.Utilisateur;
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
           
           
           		/* Créer un utilisateur */
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
           public PretResponse doCreatePret(@WebParam(name="refouvrage") int refPret ,  
                                                                             @WebParam(name="refclient") int refClient,
                                                                             @WebParam(name="refpret") int refOuvrage,
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

               
               
               response.setPseudo(utilisateur.getPseudo());
               response.setMotPasse(utilisateur.getMotPasse());
               response.setNom(utilisateur.getNom());
               response.setPrenom(utilisateur.getPrenom());
               response.setEmail(utilisateur.getEmail());
               response.setRefBibliotheque(utilisateur.getRefBibliotheque());
               response.setIdUtilisateur(utilisateur.getIdUtilisateur());

               
               
               return response;
           

               }
           
           
           
           @WebMethod(operationName ="addUser")
           public UtilisateurResponse doCreateUser( @WebParam(name="pseudo") String pseudo, 
                                                                                          @WebParam(name="motPasse") String motPasse,
                                                                                          @WebParam(name="nom") String nom,
                                                                                          @WebParam(name="prenom") String prenom,
                                                                                          @WebParam(name="email") String email,
                                                                                          @WebParam(name="refbibliotheque") int refBibliotheque,
                                                                                          @WebParam(name="idutilisateur") int idUtilisateur) {
               
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



           
    
}


