
package com.client.action;

import java.util.List;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.PretResponse;
import com.opensymphony.xwork2.ActionSupport;


public class PretAction extends ActionSupport {
    /*
       BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
       BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
*/

   //=========Attributs=============
    protected int refclient;
    protected int refouvrage;
    protected int refpret;
       
    protected String datefinpret;
    protected String datepret;
    protected String dureePret;
    protected String nbrexemplaire;
    
    protected boolean prolonger;

       
       // ----- Eléments en sortie
    /*
       private List<Pret> listPrets;
       private Pret pret;
       */
       
  //=========Getters & Setters=======

    public int getRefclient() {
        return refclient;
    }

    public void setRefclient(int refclient) {
        this.refclient = refclient;
    }

    public int getRefouvrage() {
        return refouvrage;
    }

    public void setRefouvrage(int refouvrage) {
        this.refouvrage = refouvrage;
    }

    public int getRefpret() {
        return refpret;
    }

    public void setRefpret(int refpret) {
        this.refpret = refpret;
    }

    public String getDatefinpret() {
        return datefinpret;
    }

    public void setDatefinpret(String datefinpret) {
        this.datefinpret = datefinpret;
    }

    public String getDatepret() {
        return datepret;
    }

    public void setDatepret(String datepret) {
        this.datepret = datepret;
    }

    public String getDureePret() {
        return dureePret;
    }

    public void setDureePret(String dureePret) {
        this.dureePret = dureePret;
    }

    public String getNbrexemplaire() {
        return nbrexemplaire;
    }

    public void setNbrexemplaire(String nbrexemplaire) {
        this.nbrexemplaire = nbrexemplaire;
    }

    public boolean isProlonger() {
        return prolonger;
    }

    public void setProlonger(boolean prolonger) {
        this.prolonger = prolonger;
    }




 
       
  //=========Méthodes============
    
  /**
  Action permettant aux employés de consulter les prêts
 @return input / success
      
   public String affichagePrets() {
           
       String vResult = ActionSupport.INPUT;

                            
           PretResponse pretResponse = new PretResponse();
                                
                      pretResponse.getRefpret();
                      pretResponse.getRefclient();
                      pretResponse.getRefouvrage();
                      pretResponse.getDatepret();
                      pretResponse.getDureePret();
                      pretResponse.getDatefinpret();
                      pretResponse.getNbrexemplaire();
                                 
                      pretResponse.isProlonger();
                      

                      }
                       return vResult;
                            */
                            
                        }


       
    

