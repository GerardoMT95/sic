//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.27 at 01:25:11 AM CEST 
//


package it.latraccia.entity.sic.richiesta.impl;

public class MessaggioRichiestaTypesImpl implements it.latraccia.entity.sic.richiesta.MessaggioRichiestaTypes, com.sun.xml.bind.JAXBObject, it.latraccia.entity.sic.richiesta.impl.runtime.UnmarshallableObject, it.latraccia.entity.sic.richiesta.impl.runtime.XMLSerializable, it.latraccia.entity.sic.richiesta.impl.runtime.ValidatableObject
{

    protected it.latraccia.entity.sic.richiesta.IntestazioneTypes _Intestazione;
    protected it.latraccia.entity.sic.richiesta.RichiestaTypes _Richiesta;
    public final static java.lang.Class version = (it.latraccia.entity.sic.richiesta.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (it.latraccia.entity.sic.richiesta.MessaggioRichiestaTypes.class);
    }

    public it.latraccia.entity.sic.richiesta.IntestazioneTypes getIntestazione() {
        return _Intestazione;
    }

    public void setIntestazione(it.latraccia.entity.sic.richiesta.IntestazioneTypes value) {
        _Intestazione = value;
    }

    public it.latraccia.entity.sic.richiesta.RichiestaTypes getRichiesta() {
        return _Richiesta;
    }

    public void setRichiesta(it.latraccia.entity.sic.richiesta.RichiestaTypes value) {
        _Richiesta = value;
    }

    public it.latraccia.entity.sic.richiesta.impl.runtime.UnmarshallingEventHandler createUnmarshaller(it.latraccia.entity.sic.richiesta.impl.runtime.UnmarshallingContext context) {
        return new it.latraccia.entity.sic.richiesta.impl.MessaggioRichiestaTypesImpl.Unmarshaller(context);
    }

    public void serializeBody(it.latraccia.entity.sic.richiesta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "Intestazione");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Intestazione), "Intestazione");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Intestazione), "Intestazione");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Intestazione), "Intestazione");
        context.endElement();
        context.startElement("", "Richiesta");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Richiesta), "Richiesta");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Richiesta), "Richiesta");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Richiesta), "Richiesta");
        context.endElement();
    }

    public void serializeAttributes(it.latraccia.entity.sic.richiesta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(it.latraccia.entity.sic.richiesta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (it.latraccia.entity.sic.richiesta.MessaggioRichiestaTypes.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000\'com.sun.msv.grammar.trex.ElementPatt"
+"ern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;"
+"xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndecl"
+"aredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0006pp\u0000"
+"sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com."
+"sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gramm"
+"ar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean"
+"\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0007xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u00002com.su"
+"n.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"\u0003sq\u0000~\u0000\u0011\u0001q\u0000~\u0000\u0016sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.ms"
+"v.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0017"
+"q\u0000~\u0000\u001csr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlo"
+"calNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u00003it."
+"latraccia.entity.sic.richiesta.IntestazioneTypest\u0000+http://ja"
+"va.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0012psr\u0000\u001bco"
+"m.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dat"
+"atype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Str"
+"ingPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'co"
+"m.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespace"
+"Uriq\u0000~\u0000\u001eL\u0000\btypeNameq\u0000~\u0000\u001eL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatyp"
+"e/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSch"
+"emat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$"
+"Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpacePr"
+"ocessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullS"
+"etExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.util.Stri"
+"ngPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001eL\u0000\fnamespaceURIq\u0000~\u0000\u001expq\u0000~\u0000"
+"/q\u0000~\u0000.sq\u0000~\u0000\u001dt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-insta"
+"nceq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000\fIntestazionet\u0000\u0000sq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0006pp\u0000sq"
+"\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00000it.lat"
+"raccia.entity.sic.richiesta.RichiestaTypesq\u0000~\u0000!sq\u0000~\u0000\fppsq\u0000~\u0000"
+"\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\'q\u0000~\u00007q\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000\tRichiestaq\u0000~\u0000<sr\u0000\"com.sun.msv"
+".grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv"
+"/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar"
+".ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersio"
+"nL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\t\u0001pq\u0000~"
+"\u0000\u0010q\u0000~\u0000Aq\u0000~\u0000\"q\u0000~\u0000\nq\u0000~\u0000Eq\u0000~\u0000>q\u0000~\u0000\rq\u0000~\u0000@q\u0000~\u0000\u0005x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends it.latraccia.entity.sic.richiesta.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(it.latraccia.entity.sic.richiesta.impl.runtime.UnmarshallingContext context) {
            super(context, "-------");
        }

        protected Unmarshaller(it.latraccia.entity.sic.richiesta.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return it.latraccia.entity.sic.richiesta.impl.MessaggioRichiestaTypesImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("InfoMittDest" == ___local)&&("" == ___uri)) {
                            _Intestazione = ((it.latraccia.entity.sic.richiesta.impl.IntestazioneTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.IntestazioneTypesImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  6 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        if (("Richiesta" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        if (("Intestazione" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  4 :
                        if (("InterrogazioneCapitoli" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneCapitoliLiquidazioni" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneBilancio" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneObiettiviGestionali" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("DisponibilitaPreImpegno" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneImpegniAperti" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneLiquidazioniAperte" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazionePreimpegniAperti" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneImpegniPerenti" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PrenotazionePreimpegni" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("CreateDelDocumento" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("DisponibilitaImpegno" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneTipologiaReddito" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogaCodiceSiope" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogaCapitoloEntrate" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogaReversaliCollegabili" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogaBeneficiariLiq" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogaMandatiBeneficiariAtto" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazionePCF" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneMandatiTrasparenza" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneContratti" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterrogazioneListaContratti" == ___local)&&("" == ___uri)) {
                            _Richiesta = ((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.sic.richiesta.impl.RichiestaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("Intestazione" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  6 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        if (("Richiesta" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  6 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
