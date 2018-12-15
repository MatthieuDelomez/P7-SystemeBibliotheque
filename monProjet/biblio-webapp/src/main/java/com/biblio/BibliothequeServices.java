package com.biblio;

import com.biblio.resources.AbstractResource;
import com.responses.BibliothequeResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.business.manager.BibliothequeManager;
import org.projet.biblio.model.Bibliotheque;


@WebService(name="BibliothequeServices") 
public class BibliothequeServices extends AbstractResource {
    
    
        private BibliothequeManager bibliothequeManager = getManagerFactory().getBibliothequeManager();
    
        @WebMethod(operationName="DocumentServices") 
        public BibliothequeResponse doAddBibliotheque(@WebParam(name="refbibliotheque") int refBibliotheque,
                                                                                                     @WebParam(name="nom") String nom,
                                                                                                     @WebParam(name="adresse") String adresse,
                                                                                                     @WebParam(name="ville") String ville,
                                                                                                     @WebParam(name="codepostal") String codePostal,
                                                                                                     @WebParam(name="description") String description){
            
            
           Bibliotheque bibliotheque = new Bibliotheque(); 
           BibliothequeResponse response = new BibliothequeResponse();
           
           
               bibliotheque.setRefBibliotheque(2);
               bibliotheque.setNom(nom);
               bibliotheque.setAdresse(adresse);
               bibliotheque.setVille(ville);
               bibliotheque.setCodePostal(codePostal);
               bibliotheque.setDescription(description);

               response.setRefBibliotheque(2);
               response.setNom(nom);
               response.setAdresse(adresse);
               response.setVille(ville);
               response.setCodePostal(codePostal);
               response.setDescription(description);
               
               bibliothequeManager.addBibliotheque(bibliotheque);


               
               return response;     
            
        }

    
    
    
}