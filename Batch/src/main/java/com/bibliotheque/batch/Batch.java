
package com.bibliotheque.batch;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.InfoPretResponse;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


public class Batch {
    
private static final String SUBJECT = "BOOK NOT RETURNED";

                     

	private static void sendEmail(List<InfoPretResponse> listInfoPretResponse) {
                      
                      for(InfoPretResponse infoPretResponse : listInfoPretResponse) {
                          
                          EmailsUtils.sendEmail(infoPretResponse.getEmail(), SUBJECT, "Bonjour ,  \n vous avez enprunté le livre :" + infoPretResponse.getNomouvrage() + " " +
                                                                                                                                                "pendant une période supérieur à 4 semaines. \n\n"
                                                                                                                                               + "Vous êtes donc prié de restituer votre prêt dans votre bibliothèque.\n" +
                                                                                                                                                 "Cordialement, \n" +
                                                                                                                                                  "La direction"); 
                          
                          System.out.println("Message envoyé à l'adresse suivant" + infoPretResponse.getEmail());
            
                         }
		
	}

	public static void main(String[] args) throws IOException {
            
            
		// Récupération de fichier de configuration sous forme de Properties
		Properties emailProps = PropsUtils.getProps("src/email.properties");

		// Configuration EmailUtils
		EmailsUtils.setEmailProperties(emailProps);
		
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
    
