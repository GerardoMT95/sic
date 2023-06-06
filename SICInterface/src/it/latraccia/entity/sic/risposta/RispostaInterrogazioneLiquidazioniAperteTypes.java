//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.17 at 12:28:37 PM CET 
//


package it.latraccia.entity.sic.risposta;


/**
 * Java content class for Risposta_InterrogazioneLiquidazioniAperte_Types complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/simonebrunox/Desktop/SIC/RispostaSIC.xsd line 728)
 * <p>
 * <pre>
 * &lt;complexType name="Risposta_InterrogazioneLiquidazioniAperte_Types">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Liquidazione" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Numero">
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{9}"/>
 *                     &lt;/restriction>
 *                   &lt;/element>
 *                   &lt;element name="Oggetto">
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="240"/>
 *                     &lt;/restriction>
 *                   &lt;/element>
 *                   &lt;element name="Capitolo">
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="U\d{5}"/>
 *                       &lt;minLength value="6"/>
 *                       &lt;maxLength value="6"/>
 *                     &lt;/restriction>
 *                   &lt;/element>
 *                   &lt;element name="Importo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="ImportoResiduo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RispostaInterrogazioneLiquidazioniAperteTypes {


    /**
     * Gets the value of the Liquidazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Liquidazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiquidazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link it.latraccia.entity.sic.risposta.RispostaInterrogazioneLiquidazioniAperteTypes.LiquidazioneType}
     * 
     */
    java.util.List getLiquidazione();


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/simonebrunox/Desktop/SIC/RispostaSIC.xsd line 731)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Numero">
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{9}"/>
     *           &lt;/restriction>
     *         &lt;/element>
     *         &lt;element name="Oggetto">
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="240"/>
     *           &lt;/restriction>
     *         &lt;/element>
     *         &lt;element name="Capitolo">
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="U\d{5}"/>
     *             &lt;minLength value="6"/>
     *             &lt;maxLength value="6"/>
     *           &lt;/restriction>
     *         &lt;/element>
     *         &lt;element name="Importo" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="ImportoResiduo" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface LiquidazioneType {


        /**
         * Numero della liquidazione
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getNumero();

        /**
         * Numero della liquidazione
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setNumero(java.lang.String value);

        /**
         * Oggetto della liquidazione
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getOggetto();

        /**
         * Oggetto della liquidazione
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setOggetto(java.lang.String value);

        /**
         * Importo residuo della liquidazione
         * 
         */
        double getImportoResiduo();

        /**
         * Importo residuo della liquidazione
         * 
         */
        void setImportoResiduo(double value);

        /**
         * Codice del capitolo della liquidazione: Uxxxxx (lettera U seguita da 5 cifre) – Uscite
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getCapitolo();

        /**
         * Codice del capitolo della liquidazione: Uxxxxx (lettera U seguita da 5 cifre) – Uscite
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setCapitolo(java.lang.String value);

        /**
         * Importo della liquidazione
         * 
         */
        double getImporto();

        /**
         * Importo della liquidazione
         * 
         */
        void setImporto(double value);

    }

}
