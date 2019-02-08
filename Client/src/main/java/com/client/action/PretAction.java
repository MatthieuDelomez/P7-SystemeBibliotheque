
package com.client.action;

import java.util.List;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.PretResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.lang3.StringUtils;


public class PretAction extends ActionSupport {
    

   //=========Attributs=============
    protected int refclient;
    protected int refouvrage;
    protected int refpret;
       
    protected String datefinpret;
    protected String datepret;
    protected String dureePret;
    protected String nbrexemplaire;
    
    protected boolean prolonger;
    
    private List<String> listPret;
    private List<PretResponse> listPretResponse;
    
    private static AtomicInteger genId = new AtomicInteger(2);
    


    //=========Getters & Setters=======
    
     public List<PretResponse> getListPretResponse() {       
        return listPretResponse;
    }
    
    public void setListPretResponse(List<PretResponse> listPretResponse) {
        this.listPretResponse = listPretResponse;
    }

    public List<String> getListPret() {
        return listPret;
    }

    public void setListPret(List<String> listPret) {
        this.listPret = listPret;
    }

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

    public static AtomicInteger getGenId() {
        return genId;
    }

    public static void setGenId(AtomicInteger genId) {
        PretAction.genId = genId;
    }
    


    
  //================Méthodes===================
    
    
                      @Override
                      public String execute(){
                          
                      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();             
                      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
                      listPret = new ArrayList();
                      listPretResponse = port.listPret();                                                        
           
                       return SUCCESS ;
                      

                       }


                      
                      public String doAddPret() {
                          
                                                 
                      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();             
                      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
 
                      String vResult = ActionSupport.INPUT;

                      PretResponse pretResponse = new PretResponse();

                      pretResponse.setRefpret(refpret);
                      pretResponse.setRefclient(refclient);
                      pretResponse.setRefouvrage(refouvrage);
                      pretResponse.setDatepret(datepret);
                      pretResponse.setDureePret(dureePret);
                      pretResponse.setDatefinpret(datefinpret);
                      pretResponse.setNbrexemplaire(nbrexemplaire);
                      pretResponse.setProlonger(prolonger);


                      try {
                          
                      if (!StringUtils.isAllEmpty(datepret, dureePret, datefinpret)) {
                          
                      refpret = genId.getAndIncrement();
                      
                      port.addPret(refpret, refclient, refouvrage, datepret, dureePret, datefinpret, nbrexemplaire, prolonger);
                      
                      vResult = ActionSupport.SUCCESS;          
                      
     
                      }
                      
                      } catch (Exception pe) {
                        this.addActionError("Veuillez remplir les champs correctement");

                      }
                      
                      
                      return vResult;


                      }
                      
                      
                      public String doDeletePret() {
                          
                      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();             
                      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
                      
                      String vResult = ActionSupport.INPUT;

                      PretResponse pretResponse = new PretResponse();

                      pretResponse.setRefpret(refpret);
                      
                      try {
                          
                      if (!StringUtils.isAllEmpty(datefinpret)) {
                          
                      
                     port.deletePret(refpret, datefinpret);
                      
                      vResult = ActionSupport.SUCCESS;          
                      
     
                      }
                      
                      } catch (Exception pe) {
                        this.addActionError("Veuillez remplir les champs correctement");

                      }
                      
                      
                      return vResult;
                          
                      }


                      }

                      


       
    

