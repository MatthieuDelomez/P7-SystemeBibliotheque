
package org.projet.biblio.business.manager;

import java.util.List;
import org.projet.biblio.model.Document;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Document
*/

public interface DocumentManager {
    
     /*
    Création des méthodes qui seront implémentées dans DocumentManagerImpl
    */
    
    void addDocument(Document document);
    
    Document getDocument (Document document);
    
    void deleteDocumentPicture(Document document);
    
    void updateDocument(Document document);
    
    void deleteDocument (Document document);
    


    List<Document> getAllDocument(Document document);
    
    List<Document> getDocumentBatch();


    
}
