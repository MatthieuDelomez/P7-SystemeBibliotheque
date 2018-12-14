package com.biblio;

import com.biblio.resources.AbstractResource;
import com.responses.UtilisateurResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.business.manager.UtilisateurManager;
import org.projet.biblio.model.Utilisateur;


@WebService(name="UtilisateurServices")
public class UtilisateurServices extends AbstractResource{
    
   
    
         //  private UtilisateurManager utilisateurManager = getManagerFactory().getUtilisateurManager();
    
           @WebMethod(operationName = "doLogin")
           public UtilisateurResponse doLogin( @WebParam(name="pseudo") String pseudo,  
                                                                               @WebParam(name="motPasse") String motPasse ){

           Utilisateur utilisateur = new Utilisateur(); 
           UtilisateurResponse response = new UtilisateurResponse();
               

               response.setNom("nom");
               response.setPrenom("prenom");
               response.setPseudo("pseudo");
               
               
               return response;
           

        }
           
           /*
           
           @WebMethod(operationName ="doCreateUser")
           public UtilisateurResponse doCreateUser( @WebParam(name="pseudo") String pseudo, 
                                                                                          @WebParam(name="motPasse") String motPasse,
                                                                                          @WebParam(name="nom") String nom,
                                                                                          @WebParam(name="prenom") String prenom,
                                                                                          @WebParam(name="email") String email,
                                                                                          @WebParam(name="refbibliotheque") int refBibliotheque ){
               
           UtilisateurResponse response = new UtilisateurResponse();
           Utilisateur utilisateur = new Utilisateur();
           
           
           response.setNom("nom");
           response.setPrenom("prenom");
           response.setPseudo("pseudo");
           response.setEmail("email");
           response.setRefBibliotheque(2);
           response.setNom("nom");

           
           utilisateurManager.addUtilisateur(utilisateur);
               
           
               return response;
           
               
               
           }
*/
    
}
