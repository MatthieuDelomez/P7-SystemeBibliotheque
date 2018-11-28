/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblio.main;

import com.biblio.bibliotheque.Document;
import com.biblio.bibliotheque.Library;


public class Main {
    
    public static void main(String[] args){
        
        Library library = new Library(150);
        
        library.addDocument(new Document("1984 - George Orwell", 1, "5", "1", "4" ));
        
      //  library.deleteDocument(1); // Rentrer l'id de l'ouvrage pour le supprimer
      
      
      System.out.println("Library capacité : " + library.getNbrDocuments() + "/" + library.capacity());
      
      System.out.println("-------------------------------------------------------------------------------");
      
        if(library.searchDocumentById(10) != null) {
            System.out.println("Document found :" );
          //  library.searchDocumentById(10).edition());
        }
        
        
        System.out.println("-------------------------------------------------------------------------------");
      
        library.showDocuments();
        System.out.println("--------------------------------------------------------------------------------");
        
        
      
      
    }
    
}
