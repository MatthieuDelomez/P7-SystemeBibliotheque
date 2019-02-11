
package com.biblio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour listEmailClientResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="listEmailClientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listDocuments" type="{http://biblio.com/}DocumentResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listPrets" type="{http://biblio.com/}PretResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listEmailClient" type="{http://biblio.com/}ClientResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listEmailClientResponse", propOrder = {
    "listDocuments",
    "listPrets",
    "listEmailClient"
})
public class ListEmailClientResponse {

    protected List<DocumentResponse> listDocuments;
    protected List<PretResponse> listPrets;
    protected List<ClientResponse> listEmailClient;

    /**
     * Gets the value of the listDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentResponse }
     * 
     * 
     */
    public List<DocumentResponse> getListDocuments() {
        if (listDocuments == null) {
            listDocuments = new ArrayList<DocumentResponse>();
        }
        return this.listDocuments;
    }

    /**
     * Gets the value of the listPrets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPrets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPrets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PretResponse }
     * 
     * 
     */
    public List<PretResponse> getListPrets() {
        if (listPrets == null) {
            listPrets = new ArrayList<PretResponse>();
        }
        return this.listPrets;
    }

    /**
     * Gets the value of the listEmailClient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listEmailClient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListEmailClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientResponse }
     * 
     * 
     */
    public List<ClientResponse> getListEmailClient() {
        if (listEmailClient == null) {
            listEmailClient = new ArrayList<ClientResponse>();
        }
        return this.listEmailClient;
    }

}
