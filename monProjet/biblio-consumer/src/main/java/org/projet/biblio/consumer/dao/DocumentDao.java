package org.projet.biblio.consumer.dao;

import java.util.List;
import org.projet.biblio.model.Document;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public interface DocumentDao {
    
/* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/
    
    
    void addDocument( Document document);
    
    Document getDocument(Document document);
    
    void deleteDocumentPicture(Document document);
    
    List<Document> getAllDocument(Document document);
    
    void updateDocument(Document document);
    
    void deleteDocument(Document document);
    
    List<Document> getDocumentBatch();
    
    
    
}
