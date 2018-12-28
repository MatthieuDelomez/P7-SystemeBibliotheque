
package com.biblio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.biblio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchBiblio_QNAME = new QName("http://biblio.com/", "searchBiblio");
    private final static QName _SearchBiblioResponse_QNAME = new QName("http://biblio.com/", "searchBiblioResponse");
    private final static QName _BibliothequeResponse_QNAME = new QName("http://biblio.com/", "BibliothequeResponse");
    private final static QName _BibliothequeServices_QNAME = new QName("http://biblio.com/", "BibliothequeServices");
    private final static QName _BibliothequeServicesResponse_QNAME = new QName("http://biblio.com/", "BibliothequeServicesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.biblio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BibliothequeResponse }
     * 
     */
    public BibliothequeResponse createBibliothequeResponse() {
        return new BibliothequeResponse();
    }

    /**
     * Create an instance of {@link BibliothequeServices_Type }
     * 
     */
    public BibliothequeServices_Type createBibliothequeServices_Type() {
        return new BibliothequeServices_Type();
    }

    /**
     * Create an instance of {@link BibliothequeServicesResponse }
     * 
     */
    public BibliothequeServicesResponse createBibliothequeServicesResponse() {
        return new BibliothequeServicesResponse();
    }

    /**
     * Create an instance of {@link SearchBiblio }
     * 
     */
    public SearchBiblio createSearchBiblio() {
        return new SearchBiblio();
    }

    /**
     * Create an instance of {@link SearchBiblioResponse }
     * 
     */
    public SearchBiblioResponse createSearchBiblioResponse() {
        return new SearchBiblioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBiblio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchBiblio")
    public JAXBElement<SearchBiblio> createSearchBiblio(SearchBiblio value) {
        return new JAXBElement<SearchBiblio>(_SearchBiblio_QNAME, SearchBiblio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBiblioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchBiblioResponse")
    public JAXBElement<SearchBiblioResponse> createSearchBiblioResponse(SearchBiblioResponse value) {
        return new JAXBElement<SearchBiblioResponse>(_SearchBiblioResponse_QNAME, SearchBiblioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BibliothequeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "BibliothequeResponse")
    public JAXBElement<BibliothequeResponse> createBibliothequeResponse(BibliothequeResponse value) {
        return new JAXBElement<BibliothequeResponse>(_BibliothequeResponse_QNAME, BibliothequeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BibliothequeServices_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "BibliothequeServices")
    public JAXBElement<BibliothequeServices_Type> createBibliothequeServices(BibliothequeServices_Type value) {
        return new JAXBElement<BibliothequeServices_Type>(_BibliothequeServices_QNAME, BibliothequeServices_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BibliothequeServicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "BibliothequeServicesResponse")
    public JAXBElement<BibliothequeServicesResponse> createBibliothequeServicesResponse(BibliothequeServicesResponse value) {
        return new JAXBElement<BibliothequeServicesResponse>(_BibliothequeServicesResponse_QNAME, BibliothequeServicesResponse.class, null, value);
    }

}
