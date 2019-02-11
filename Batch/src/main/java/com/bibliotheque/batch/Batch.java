
package com.bibliotheque.batch;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.InfoPretResponse;
import com.biblio.ListInfoDocument;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class Batch {
    
private static final String SUBJECT = "BOOK NOT RETURNED";

                     

	private static void sendEmail(List<InfoPretResponse> listInfoPretResponse) {
                      
                      for(InfoPretResponse infoPretResponse : listInfoPretResponse) {
                          
                       //   EmailsUtils.sendEmail(infoPretResponse.getEmail(), SUBJECT, "Bonjour votre" + infoPretResponse.getNomouvrage() + "" );
                          System.out.println(infoPretResponse.getEmail());
            
                         }
		
	}

	public static void main(String[] args) throws IOException {
		// Récupération de fichier de configuration sous forme de Properties
		//Properties emailProps = PropsUtils.getProps(args[1]);

		// Configuration EmailUtils
	//	EmailsUtils.setEmailProperties(emailProps);
		
                                           List<InfoPretResponse> listInfoDocument = null ;
                
		try {
                    
                    
		 // Récupération de la liste des clients Dans le web service 
                 
                                             BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();      
                                             BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
                                            
                                             
                                             listInfoDocument = port.listInfoDocument();
                                                                                            
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Envois des email de relance
		if (listInfoDocument != null) {
			sendEmail(listInfoDocument);
		}
	}
}
    
