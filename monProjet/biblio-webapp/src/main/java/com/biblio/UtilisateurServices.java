package com.biblio;

import com.biblio.resources.AbstractResource;
import com.responses.UtilisateurResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.consumer.dao.UtilisateurDao;
import org.projet.biblio.model.Utilisateur;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@WebService(name="UtilisateurServices")
public class UtilisateurServices extends AbstractResource{
    
   
    
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    
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
               
               
               utilisateur = utilisateurDao.getUtilisateur(utilisateur);
               
               response.setPseudo(utilisateur.getPseudo());
               response.setMotPasse(utilisateur.getMotPasse());
               response.setNom(utilisateur.getNom());
               response.setPrenom(utilisateur.getPrenom());
               response.setEmail(utilisateur.getEmail());
               response.setRefBibliotheque(utilisateur.getRefBibliotheque());
               response.setIdUtilisateur(utilisateur.getIdUtilisateur());

               
               
               return response;
           

               }
           
           
           
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
