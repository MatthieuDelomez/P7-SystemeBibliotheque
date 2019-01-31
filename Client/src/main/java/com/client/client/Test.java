
package com.client.client;


import com.biblio.BibliothequeResponse;
import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.ClientResponse;
import com.biblio.DocumentResponse;
import com.biblio.PretResponse;
import com.biblio.UtilisateurResponse;
import java.net.URL;

import javax.xml.namespace.QName;



public class Test {
    
    public static void main( String[] args ) {
        
        
        URL wsdlURL = BibliothequeServicesService.WSDL_LOCATION; 
        

        QName qName = new QName( "http://biblio.net", "BibliothequeServicesService");
        
        
           BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
                   
           BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
           
           
           for (PretResponse pretResponse: port.listPret()) {
               
               System.out.println("--> RefOuvrage : "+pretResponse.getRefouvrage());
            
        }
           
                      for (ClientResponse clientResponse: port.listClient()) {
               
               System.out.println("--> RefOuvrage : "+clientResponse.getRefclient());
            
        }

                                   
                   BibliothequeResponse bibliothequeResponse  = port.searchBiblio(1);
                   
                   System.out.println(bibliothequeResponse.getDescription());
                   
                   

                   
                   
                   PretResponse pretResponse  = port.searchPret(1);
                   
                   System.out.println(pretResponse.getRefouvrage());
                   
                   
                   UtilisateurResponse utilisateurResponse  = port.doLogin("Martine59", "admin");
                   
                   System.out.println(utilisateurResponse.getPrenom());
                   
                   
                   ClientResponse clientResponse  = port.doLoginClient("Marko", "admin");
                   
                   System.out.println(clientResponse.getPrenom());
                   

    }
}