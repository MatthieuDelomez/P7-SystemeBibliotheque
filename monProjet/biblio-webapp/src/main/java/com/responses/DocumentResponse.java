
package com.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe Response.
 * 
 *
 * @author Delomez Matthieu
 */

@XmlRootElement(name = "DocumentResponse")
@XmlType(name = "DocumentResponse")
public class DocumentResponse {
    
    //=========Attributs=============
    
    private int refOuvrage;
    private int refBibliotheque;
    
    private String nomOuvrage;
    private String quantiteTotal;
    
    //=========Getters & Setters=============
    
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
    public int getRefBibliotheque() {
        return refBibliotheque;
    }
    
    /**
     *
     * @param refBibliotheque
     */
    @XmlElement(name = "refbibliotheque")
    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    /**
     *
     * @return
     */
    public String getNomOuvrage() {
        return nomOuvrage;
    }
    
    /**
     *
     * @param nomOuvrage
     */
    @XmlElement(name = "nomouvrage")
    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }

    /**
     *
     * @return
     */
    public String getQuantiteTotal() {
        return quantiteTotal;
    }
    
    /**
     *
     * @param quantiteTotal
     */
    @XmlElement(name = "quantitetotal")
    public void setQuantiteTotal(String quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }


    
    
    
}
