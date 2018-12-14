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

    
    @WebMethod(operationName="DocumentServices") 
    public DocumentResponse doSearchBook(@WebParam(name="refouvrage") int refOuvrage,  
                                                                                     @WebParam(name="refbibliotheque") int refBibliotheque,
                                                                                     @WebParam(name="nomouvrage") String nomOuvrage,
                                                                                     @WebParam(name="quantitetotal") String quantiteTotal,
                                                                                     @WebParam(name="nbremprunte") String nbrEmprunte,
                                                                                     @WebParam(name="quantiterestante") String quantiteRestante ){
        
         Document document = new Document(); 
         DocumentResponse response = new DocumentResponse();
               

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
