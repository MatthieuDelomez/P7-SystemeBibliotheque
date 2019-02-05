package org.projet.biblio.business.managerImpl;

import java.util.List;
import org.projet.biblio.business.manager.DocumentManager;
import org.projet.biblio.model.Document;


public class DocumentManagerImpl extends AbstractManager implements DocumentManager {
    

    @Override
    public void addDocument(Document document) {
        getDaoFactory().getDocumentDao().addDocument(document);   
    }

    @Override
    public Document getDocument(Document document) {
         return getDaoFactory().getDocumentDao().getDocument(document);  
    }

    @Override
    public void deleteDocumentPicture(Document document) {
          getDaoFactory().getDocumentDao().deleteDocumentPicture(document);  
    }

    @Override
    public void updateDocument(Document document) {
          getDaoFactory().getDocumentDao().updateDocument(document);   
    }

    @Override
    public void deleteDocument(Document document) {
          getDaoFactory().getDocumentDao().deleteDocument(document);  
    }
    

      /* Implementation de la methode liste des publications /*/
    @Override
    public List<Document> getAllDocument(Document document) {
                                                                    
          return getDaoFactory().getDocumentDao().getAllDocument(document);
                                      
         }
    
}
