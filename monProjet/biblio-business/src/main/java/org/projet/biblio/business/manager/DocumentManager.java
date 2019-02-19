
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
    
    void addDocument(Document document); // Ajouter un document
    
    Document getDocument (Document document);  // Récupérer un document
    
    void deleteDocumentPicture(Document document); 
    
    void updateDocument(Document document);
    
    void deleteDocument (Document document); // Supprimer un document
    

   /*
    Liste de document qui va retourner tout les documents
    */
    List<Document> getAllDocument(Document document);
    
    /*
    Liste de document pour la configuration du batch
    */
    List<Document> getDocumentBatch();


    
}
