//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.17 at 12:28:37 PM CET 
//


package it.latraccia.entity.sic.risposta;


/**
 * Java content class for Risposta_InterrogazioneCodiciSiope_Types complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/simonebrunox/Desktop/SIC/RispostaSIC.xsd line 1352)
 * <p>
 * <pre>
 * &lt;complexType name="Risposta_InterrogazioneCodiciSiope_Types">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceSiope" type="{}CodiceSiope_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RispostaInterrogazioneCodiciSiopeTypes {


    /**
     * Codice e descrizione dell'elemento SIOPEGets the value of the CodiceSiope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the CodiceSiope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodiceSiope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link it.latraccia.entity.sic.risposta.CodiceSiopeType}
     * 
     */
    java.util.List getCodiceSiope();

}
