//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.27 at 01:25:11 AM CEST 
//


package it.latraccia.entity.sic.richiesta;


/**
 * Java content class for ReversaleColl_Types complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/simonebrunox/Desktop/SIC/RichiestaSIC.xsd line 1010)
 * <p>
 * <pre>
 * &lt;complexType name="ReversaleColl_Types">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroReversale">
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{9}"/>
 *           &lt;/restriction>
 *         &lt;/element>
 *         &lt;element name="ImportoReversale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ReversaleCollTypes {


    /**
     * Numero della reversale
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getNumeroReversale();

    /**
     * Numero della reversale
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setNumeroReversale(java.lang.String value);

    /**
     * Importo Reversale
     * 
     */
    double getImportoReversale();

    /**
     * Importo Reversale
     * 
     */
    void setImportoReversale(double value);

}
