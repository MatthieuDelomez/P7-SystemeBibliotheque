package com.biblio;

import com.responses.UtilisateurResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.model.Utilisateur;


@WebService(name="UtilisateurServices")
public class UtilisateurServices{
    
           @WebMethod(operationName = "doLogin")
           public UtilisateurResponse doLogin( @WebParam(name="pseudo") String pseudo, @WebParam(name="motPasse") String motPasse ){

            Utilisateur utilisateur = new Utilisateur();
            
               UtilisateurResponse response = new UtilisateurResponse();

               response.setNom("test");
               response.setPrenom("testP");
               response.setPseudo("testPseudo");
               
               return response;
           

        }
    
}
