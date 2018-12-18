package com.biblio;

import com.biblio.resources.AbstractResource;
import com.responses.DocumentResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.business.manager.DocumentManager;
import org.projet.biblio.model.Document;


@WebService(name="DocumentServices") 
public class DocumentServices extends AbstractResource {
    
    
    private DocumentManager documentManager = getManagerFactory().getDocumentManager();

    /**
     *
     * @param refOuvrage
     * @param refBibliotheque
     * @param nomOuvrage
     * @param quantiteTotal
     * @param nbrEmprunte
     * @param quantiteRestante
     * @return
     */
    @WebMethod(operationName="DocumentServices") 
    public DocumentResponse doAddBook(@WebParam(name="refouvrage") int refOuvrage,  
                                                                                     @WebParam(name="refbibliotheque") int refBibliotheque,
                                                                                     @WebParam(name="nomouvrage") String nomOuvrage,
                                                                                     @WebParam(name="quantitetotal") String quantiteTotal,
                                                                                     @WebParam(name="nbremprunte") String nbrEmprunte,
                                                                                     @WebParam(name="quantiterestante") String quantiteRestante ){
        
         Document document = new Document(); 
         DocumentResponse response = new DocumentResponse();
               
               document.setRefOuvrage(1);
               document.setRefBibliotheque(1);
               document.setNomOuvrage("nomouvrage");
               document.setQuantiteTotal("quantitetotal");
               document.setNbrEmprunte("nbremprunte");
               document.setQuantiteRestante("quantiterestante");
         
               response.setRefOuvrage(1);
               response.setRefBibliotheque(1);
               response.setNomOuvrage("nomouvrage");
               response.setQuantiteTotal("quantitetotal");
               response.setNbrEmprunte("nbremprunte");
               response.setQuantiteRestante("quantiterestante");
               
               documentManager.addDocument(document);


               
               return response;               
               
        
        
        
    }
    
}
