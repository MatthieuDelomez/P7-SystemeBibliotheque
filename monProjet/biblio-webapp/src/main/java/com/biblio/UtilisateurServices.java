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
    
   
    
     //      private UtilisateurManager utilisateurManager = getManagerFactory().getUtilisateurManager();

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
               

               utilisateur.setMotPasse("motpasse");
               utilisateur.setPseudo("pseudo");
           
               response.setMotPasse("motpasse");
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
                                                                                          @WebParam(name="refbibliotheque") int refBibliotheque,
                                                                                          @WebParam(name="idutilisateur") int idUtilisateur) {
               
           UtilisateurResponse response = new UtilisateurResponse();
           Utilisateur utilisateur = new Utilisateur();
           
           
           utilisateur.setNom("nom");
           utilisateur.setPrenom("prenom");
           utilisateur.setPseudo("pseudo");
           utilisateur.setEmail("email");
           utilisateur.setRefBibliotheque(1);
           utilisateur.setNom("nom");
           utilisateur.setIdUtilisateur(2);
           
           response.setNom("nom");
           response.setPrenom("prenom");
           response.setPseudo("pseudo");
           response.setEmail("email");
           response.setRefBibliotheque(1);
           response.setNom("nom");
           response.setIdUtilisateur(2);


           
           utilisateurManager.addUtilisateur(utilisateur);
               
           
               return response;
           
               
               
           }
*/
    
}
