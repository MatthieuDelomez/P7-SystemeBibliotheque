
package com.bibliotheque.batch;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.ClientResponse;
import com.sun.xml.internal.ws.util.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class Batch {
    
private static final String SUBJECT = "BOOK NOT RETURNED";

                     

	private static void sendEmail(List<String> listClient) {
		
	}

	public static void main(String[] args) throws IOException {
		// Récupération de fichier de configuration sous forme de Properties
		Properties emailProps = PropsUtils.getProps(args[1]);

		// Configuration EmailUtils
		EmailsUtils.setEmailProperties(emailProps);
		

		List<String> listClients = null;
                
		try {
                    
                    
		 // Récupération de la liste des clients Dans le web service 
                 
                                             BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();      
                                             BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
                                            
                                             
                                              listClients = new ArrayList();
                                              port.listEmailClient();
                                              
                                              System.out.println(listClients);
                                              
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Envois des email de relance
		if (listClients != null) {
			sendEmail(listClients);
		}
	}
}
    
