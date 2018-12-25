package com.biblio;

import com.biblio.resources.AbstractResource;
import com.responses.BibliothequeResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.consumer.dao.BibliothequeDao;
import org.projet.biblio.model.Bibliotheque;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@WebService(name="BibliothequeServices") 
public class BibliothequeServices extends AbstractResource {
    
    
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
        @WebMethod(operationName="BibliothequeServices") 
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

    
    
    
}


