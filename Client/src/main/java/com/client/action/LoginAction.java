
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.ClientResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.net.URL;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.StringUtils;


public class LoginAction extends ActionSupport {
    
                      /*
                      Import des attributs qui serviront à la récupération des données via le WebService
                      */
                    //  URL wsdlURL = BibliothequeServicesService.WSDL_LOCATION; 
                              
                   //   QName qName = new QName( "http://biblio.net", "BibliothequeServicesService");

                     BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
                   
                       BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
                       
                       //=========Attributs=============
                      private String pseudo;
                      private String motPasse; 

                      
	 //=========Getters & Setters=======
	public String getPseudo() {
	return pseudo;
	}

	public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
	}

                      public String getMotPasse() {
                      return motPasse;
                      }

                      public void setMotPasse(String motPasse) {
                      this.motPasse = motPasse;
                       }

                      //=========Méthodes============
                      


                       /**
                       *
                       * @return
                       */

                      public String doLoginClient(){
                          
                          System.out.println("test test");

                          String vResult = ActionSupport.INPUT;
                          
                          if (!StringUtils.isAllEmpty(pseudo, motPasse)) {
                              
                                                     
                              try {               
                                                               
                             ClientResponse clientResponse  = new ClientResponse();
                             if(clientResponse == port.doLoginClient(pseudo, motPasse))  {
                             vResult = ActionSupport.SUCCESS; 
                             
                             }
                              
                              } catch (Exception pe){
                                      this.addActionError("Identifiant ou mot motPasse invalide !");
                                      System.out.println("Prise en compte de la methode !!");

                   
                              }
                              }
                        
                          
                          return vResult;
                          
                      }
                      
                      /*
                      Action permettant la connexion d'un utilisateur
                      @return success
                      */
                      public String doLogout(){
                          return ActionSupport.SUCCESS;
                          
                      }
                      
                      
                      }
