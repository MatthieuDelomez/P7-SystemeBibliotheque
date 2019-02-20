
package com.responses;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe Response
 *
 * @author Delomez Matthieu
 */

@XmlRootElement(name = "PretResponse")
@XmlType(name = "PretResponse")
public class PretResponse {
    
    //=========Attributs=============
    
    private int refOuvrage;
    private int refClient;
    private int refPret;
    
    private Date datePret;
    private String dureePret;
    private Date dateFinPret;
    private String nbrExemplaire;
    
    private boolean prolonger;
    
    //=========Getters & Setters=============
    
    /**
     *
     * @return
     */
    public int getRefClient() {
        return refClient;
    }
    
    /**
     *
     * @param refClient
     */
    @XmlElement(name = "refclient")
    public void setRefClient(int refClient) {
        this.refClient = refClient;
    }

    /**
     *
     * @return
     */
    public int getRefPret() {
        return refPret;
    }
    
    /**
     *
     * @param refPret
     */
    @XmlElement(name = "refpret")
    public void setRefPret(int refPret) {
        this.refPret = refPret;
    }
    
    /**
     *
     * @return
     */
    public int getRefOuvrage() {
        return refOuvrage;
    }
    
    /**
     *
     * @param refOuvrage
     */
    @XmlElement(name = "refouvrage")
    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    /**
     *
     * @return
     */
    public Date getDatePret() {
        return datePret;
    }
    
    /**
     *
     * @param datePret
     */
    @XmlElement(name = "datepret")
    public void setDatePret(Date datePret) {
        this.datePret = datePret;
    }

    /**
     *
     * @return
     */
    public String getDureePret() {
        return dureePret;
    }
    
    /**
     *
     * @param dureePret
     */
    @XmlElement(name = "dureePret")
    public void setDureePret(String dureePret) {
        this.dureePret = dureePret;
    }

    /**
     *
     * @return
     */
    public Date getDateFinPret() {
        return dateFinPret;
    }
    
    /**
     *
     * @param dateFinPret
     */
    @XmlElement(name = "datefinpret")
    public void setDateFinPret(Date dateFinPret) {
        this.dateFinPret = dateFinPret;
    }

    /**
     *
     * @return
     */
    public String getNbrExemplaire() {
        return nbrExemplaire;
    }
    
    /**
     *
     * @param nbrExemplaire
     */
    @XmlElement(name = "nbrexemplaire")
    public void setNbrExemplaire(String nbrExemplaire) {
        this.nbrExemplaire = nbrExemplaire;
    }

    /**
     *
     * @return
     */
    public boolean isProlonger() {
        return prolonger;
    }
    
    /**
     *
     * @param prolonger
     */
    @XmlElement(name = "prolonger")
    public void setProlonger(boolean prolonger) {
        this.prolonger = prolonger;
    }
    
    
    
    
}
