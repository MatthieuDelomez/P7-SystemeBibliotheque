package com.biblio;

import com.biblio.resources.AbstractResource;
import com.responses.DocumentResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.consumer.dao.DocumentDao;
import org.projet.biblio.model.Document;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@WebService(name="DocumentServices") 
public class DocumentServices extends AbstractResource {
    
    
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    
		/* Créer un utilisateur */
    DocumentDao bibliothequeDao = ctx.getBean("documentDao", DocumentDao.class);
    
    /**
     *
     * @param refOuvrage
     * @param refBibliotheque
     * @param nomOuvrage
     * @param quantiteTotal
     * @return
     */
    @WebMethod(operationName="DocumentServices") 
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

               
               bibliothequeDao.addDocument(document);


               
               return response;               
               
        
        
        
    }
    
}
