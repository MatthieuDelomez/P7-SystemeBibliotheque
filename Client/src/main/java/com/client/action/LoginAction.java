
package com.client.action;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {
    
                      /*
                      Import des attributs qui serviront à la récupération des données via le WebService
                      */
                       
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

                      String vResult = ActionSupport.INPUT;
                                               
                       try {
                           
                      if(pseudo.equals("Marko") && motPasse.equals("admin"))  {
                      vResult = ActionSupport.SUCCESS;
                                      
                       }
                      
                      
                       } catch (Exception pe){
                           
                       this.addActionError("Identifiant ou mot motPasse invalide !");
                      System.out.println("Prise en compte de la methode !!");
                                                                  
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
