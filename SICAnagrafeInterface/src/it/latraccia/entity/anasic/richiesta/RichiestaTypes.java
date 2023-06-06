//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.28 at 01:25:27 PM CET 
//


package it.latraccia.entity.anasic.richiesta;


/**
 * Java content class for Richiesta_Types complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/simonebrunox/Desktop/JAXB/XSD/Anagraf/RichiestaAnaSIC.xsd line 38)
 * <p>
 * <pre>
 * &lt;complexType name="Richiesta_Types">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="InterrogaAnagrafica" type="{}InterrogaAnagrafica_Types"/>
 *         &lt;element name="InterrogaAnagraficaContratti" type="{}InterrogaAnagraficaContratti_Types"/>
 *         &lt;element name="VerificaAnagrafica" type="{}VerificaAnagrafica_Types"/>
 *         &lt;element name="CreaAnagrafica" type="{}CreaAnagrafica_Types"/>
 *         &lt;element name="CreaSede" type="{}CreaSede_Types"/>
 *         &lt;element name="CreaContoBancario" type="{}CreaContoBancario_Types"/>
 *         &lt;element name="InterrogaComuni" type="{}InterrogaComuni_Types"/>
 *         &lt;element name="ModificaAnagrafica" type="{}ModificaAnagrafica_Types"/>
 *         &lt;element name="ModificaSede" type="{}ModificaSede_Types"/>
 *         &lt;element name="ModificaContoBancario" type="{}ModificaContoBancario_Types"/>
 *         &lt;element name="CaricamentoAnagrafiche" type="{}CaricamentoAnagrafiche_Types"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RichiestaTypes {


    /**
     * Servizio per la creazione di un conto bancario associato ad una sede
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.CreaContoBancarioTypes}
     */
    it.latraccia.entity.anasic.richiesta.CreaContoBancarioTypes getCreaContoBancario();

    /**
     * Servizio per la creazione di un conto bancario associato ad una sede
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.CreaContoBancarioTypes}
     */
    void setCreaContoBancario(it.latraccia.entity.anasic.richiesta.CreaContoBancarioTypes value);

    /**
     * Servizio di modifica del conto bancario di una sede dell' anagrafica SIC
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.ModificaContoBancarioTypes}
     */
    it.latraccia.entity.anasic.richiesta.ModificaContoBancarioTypes getModificaContoBancario();

    /**
     * Servizio di modifica del conto bancario di una sede dell' anagrafica SIC
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.ModificaContoBancarioTypes}
     */
    void setModificaContoBancario(it.latraccia.entity.anasic.richiesta.ModificaContoBancarioTypes value);

    /**
     * Servizio di interrogazione anagrafica SIC
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.InterrogaAnagraficaTypes}
     */
    it.latraccia.entity.anasic.richiesta.InterrogaAnagraficaTypes getInterrogaAnagrafica();

    /**
     * Servizio di interrogazione anagrafica SIC
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.InterrogaAnagraficaTypes}
     */
    void setInterrogaAnagrafica(it.latraccia.entity.anasic.richiesta.InterrogaAnagraficaTypes value);

    /**
     * Servizio di creazione della sede associata ad un anagrafica
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.CreaSedeTypes}
     */
    it.latraccia.entity.anasic.richiesta.CreaSedeTypes getCreaSede();

    /**
     * Servizio di creazione della sede associata ad un anagrafica
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.CreaSedeTypes}
     */
    void setCreaSede(it.latraccia.entity.anasic.richiesta.CreaSedeTypes value);

    /**
     * Servizio di modifica dell' Anagrafica SIC
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.ModificaAnagraficaTypes}
     */
    it.latraccia.entity.anasic.richiesta.ModificaAnagraficaTypes getModificaAnagrafica();

    /**
     * Servizio di modifica dell' Anagrafica SIC
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.ModificaAnagraficaTypes}
     */
    void setModificaAnagrafica(it.latraccia.entity.anasic.richiesta.ModificaAnagraficaTypes value);

    /**
     * Servizio di modifica della sede di un' anagrafica SIC
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.ModificaSedeTypes}
     */
    it.latraccia.entity.anasic.richiesta.ModificaSedeTypes getModificaSede();

    /**
     * Servizio di modifica della sede di un' anagrafica SIC
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.ModificaSedeTypes}
     */
    void setModificaSede(it.latraccia.entity.anasic.richiesta.ModificaSedeTypes value);

    /**
     * Servizio di interrogazione Comuni dell'Anagrafica SIC
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.InterrogaComuniTypes}
     */
    it.latraccia.entity.anasic.richiesta.InterrogaComuniTypes getInterrogaComuni();

    /**
     * Servizio di interrogazione Comuni dell'Anagrafica SIC
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.InterrogaComuniTypes}
     */
    void setInterrogaComuni(it.latraccia.entity.anasic.richiesta.InterrogaComuniTypes value);

    /**
     * Servizio di verifica con Anagrafica SIC
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.VerificaAnagraficaTypes}
     */
    it.latraccia.entity.anasic.richiesta.VerificaAnagraficaTypes getVerificaAnagrafica();

    /**
     * Servizio di verifica con Anagrafica SIC
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.VerificaAnagraficaTypes}
     */
    void setVerificaAnagrafica(it.latraccia.entity.anasic.richiesta.VerificaAnagraficaTypes value);

    /**
     * Servizio di creazione anagrafica SIC
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.CreaAnagraficaTypes}
     */
    it.latraccia.entity.anasic.richiesta.CreaAnagraficaTypes getCreaAnagrafica();

    /**
     * Servizio di creazione anagrafica SIC
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.CreaAnagraficaTypes}
     */
    void setCreaAnagrafica(it.latraccia.entity.anasic.richiesta.CreaAnagraficaTypes value);

    /**
     * Servizio di caricamento massivo anagrafiche
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.CaricamentoAnagraficheTypes}
     */
    it.latraccia.entity.anasic.richiesta.CaricamentoAnagraficheTypes getCaricamentoAnagrafiche();

    /**
     * Servizio di caricamento massivo anagrafiche
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.CaricamentoAnagraficheTypes}
     */
    void setCaricamentoAnagrafiche(it.latraccia.entity.anasic.richiesta.CaricamentoAnagraficheTypes value);

    /**
     * Servizio di interrogazione anagrafica beneficiari associati ad un contratto
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.anasic.richiesta.InterrogaAnagraficaContrattiTypes}
     */
    it.latraccia.entity.anasic.richiesta.InterrogaAnagraficaContrattiTypes getInterrogaAnagraficaContratti();

    /**
     * Servizio di interrogazione anagrafica beneficiari associati ad un contratto
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.anasic.richiesta.InterrogaAnagraficaContrattiTypes}
     */
    void setInterrogaAnagraficaContratti(it.latraccia.entity.anasic.richiesta.InterrogaAnagraficaContrattiTypes value);

}