
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.UtilisateurResponse;
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
                      
                      /*
                      Action permettant la connexion d'un utilisateur
                      @return input / success
                      */
                      public String doLogin(){
                          
                          String vResult = ActionSupport.INPUT;
                          
                          if (!StringUtils.isAllEmpty(pseudo, motPasse)) {
                              
                                                     
                              try {               
                                                               
                             UtilisateurResponse utilisateurResponse  = port.doLogin("Martine59", "admin");
                             vResult = ActionSupport.SUCCESS;
                              
                              } catch (Exception pe){
                                      this.addActionError("Identifiant ou mot motPasse invalide !");
                                      
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
