//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 12:37:18 PM CET 
//


package it.latraccia.entity.anasic.risposta.impl;

public class MessaggioRispostaTypesImpl implements it.latraccia.entity.anasic.risposta.MessaggioRispostaTypes, com.sun.xml.bind.JAXBObject, it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallableObject, it.latraccia.entity.anasic.risposta.impl.runtime.XMLSerializable, it.latraccia.entity.anasic.risposta.impl.runtime.ValidatableObject
{

    protected it.latraccia.entity.anasic.risposta.IntestazioneTypes _Intestazione;
    protected it.latraccia.entity.anasic.risposta.SuccessoTypes _Successo;
    protected it.latraccia.entity.anasic.risposta.MessaggioRispostaMassivaTypes _MessaggioRispostaMassiva;
    protected it.latraccia.entity.anasic.risposta.EccezioneTypes _Eccezione;
    public final static java.lang.Class version = (it.latraccia.entity.anasic.risposta.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (it.latraccia.entity.anasic.risposta.MessaggioRispostaTypes.class);
    }

    public it.latraccia.entity.anasic.risposta.IntestazioneTypes getIntestazione() {
        return _Intestazione;
    }

    public void setIntestazione(it.latraccia.entity.anasic.risposta.IntestazioneTypes value) {
        _Intestazione = value;
    }

    public it.latraccia.entity.anasic.risposta.SuccessoTypes getSuccesso() {
        return _Successo;
    }

    public void setSuccesso(it.latraccia.entity.anasic.risposta.SuccessoTypes value) {
        _Successo = value;
    }

    public it.latraccia.entity.anasic.risposta.MessaggioRispostaMassivaTypes getMessaggioRispostaMassiva() {
        return _MessaggioRispostaMassiva;
    }

    public void setMessaggioRispostaMassiva(it.latraccia.entity.anasic.risposta.MessaggioRispostaMassivaTypes value) {
        _MessaggioRispostaMassiva = value;
    }

    public it.latraccia.entity.anasic.risposta.EccezioneTypes getEccezione() {
        return _Eccezione;
    }

    public void setEccezione(it.latraccia.entity.anasic.risposta.EccezioneTypes value) {
        _Eccezione = value;
    }

    public it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallingEventHandler createUnmarshaller(it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallingContext context) {
        return new it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaTypesImpl.Unmarshaller(context);
    }

    public void serializeBody(it.latraccia.entity.anasic.risposta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "Intestazione");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Intestazione), "Intestazione");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Intestazione), "Intestazione");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Intestazione), "Intestazione");
        context.endElement();
        if (((_Eccezione == null)&&(_MessaggioRispostaMassiva == null))&&(_Successo!= null)) {
            context.startElement("", "Successo");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Successo), "Successo");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Successo), "Successo");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Successo), "Successo");
            context.endElement();
        } else {
            if (((_Eccezione!= null)&&(_MessaggioRispostaMassiva == null))&&(_Successo == null)) {
                context.startElement("", "Eccezione");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Eccezione), "Eccezione");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Eccezione), "Eccezione");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Eccezione), "Eccezione");
                context.endElement();
            } else {
                if (((_Eccezione == null)&&(_MessaggioRispostaMassiva!= null))&&(_Successo == null)) {
                    context.startElement("", "Messaggio_RispostaMassiva");
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _MessaggioRispostaMassiva), "MessaggioRispostaMassiva");
                    context.endNamespaceDecls();
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _MessaggioRispostaMassiva), "MessaggioRispostaMassiva");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _MessaggioRispostaMassiva), "MessaggioRispostaMassiva");
                    context.endElement();
                }
            }
        }
    }

    public void serializeAttributes(it.latraccia.entity.anasic.risposta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(it.latraccia.entity.anasic.risposta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (it.latraccia.entity.anasic.risposta.MessaggioRispostaTypes.class);
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
+"calNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u00005it."
+"latraccia.entity.anasic.risposta.IntestazioneTypest\u0000+http://"
+"java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0012psr\u0000\u001b"
+"com.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/d"
+"atatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/S"
+"tringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'"
+"com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespa"
+"ceUriq\u0000~\u0000\u001eL\u0000\btypeNameq\u0000~\u0000\u001eL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datat"
+"ype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLS"
+"chemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcesso"
+"r$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpace"
+"Processor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Nul"
+"lSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util.String"
+"Pair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001eL\u0000\fnamespaceURIq\u0000~\u0000\u001expq\u0000~\u0000/q"
+"\u0000~\u0000.sq\u0000~\u0000\u001dt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanc"
+"eq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000\fIntestazionet\u0000\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000"
+"\u0000ppsq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001cs"
+"q\u0000~\u0000\u001dt\u00001it.latraccia.entity.anasic.risposta.SuccessoTypesq\u0000~"
+"\u0000!sq\u0000~\u0000\fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\'q\u0000~\u00007q\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000\bSuccessoq\u0000~\u0000<s"
+"q\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~"
+"\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00002it.latraccia.entity.anasic.risposta.Ecc"
+"ezioneTypesq\u0000~\u0000!sq\u0000~\u0000\fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\'q\u0000~\u00007q\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000\t"
+"Eccezioneq\u0000~\u0000<sq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012p"
+"sq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000Ait.latraccia.entity.anas"
+"ic.risposta.MessaggioRispostaMassivaTypesq\u0000~\u0000!sq\u0000~\u0000\fppsq\u0000~\u0000\u0013"
+"q\u0000~\u0000\u0012pq\u0000~\u0000\'q\u0000~\u00007q\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000\u0019Messaggio_RispostaMassivaq\u0000~\u0000<"
+"sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTable"
+"t\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com."
+"sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005count"
+"B\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionP"
+"ool;xp\u0000\u0000\u0000\u0013\u0001pq\u0000~\u0000\rq\u0000~\u0000Bq\u0000~\u0000Nq\u0000~\u0000Zq\u0000~\u0000>q\u0000~\u0000\"q\u0000~\u0000Gq\u0000~\u0000Sq\u0000~\u0000_q\u0000~"
+"\u0000\u0005q\u0000~\u0000\u0010q\u0000~\u0000Cq\u0000~\u0000Oq\u0000~\u0000[q\u0000~\u0000\nq\u0000~\u0000@q\u0000~\u0000Lq\u0000~\u0000Xq\u0000~\u0000=x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends it.latraccia.entity.anasic.risposta.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaTypesImpl.this;
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
                            _Intestazione = ((it.latraccia.entity.anasic.risposta.impl.IntestazioneTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.IntestazioneTypesImpl.class), 2, ___uri, ___local, ___qname, __atts));
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
                    case  9 :
                        if (("Risposta_InterrogaAnagrafica" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Risposta_InterrogaAnagraficaContratti" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Risposta_VerificaAnagrafica" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Risposta_CreaAnagrafica" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Risposta_CreaSede" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Risposta_CreaContoBancario" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Risposta_InterrogaComuni" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Risposta_ModificaAnagrafica" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Risposta_ModificaSede" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Risposta_ModificaContoBancario" == ___local)&&("" == ___uri)) {
                            _Successo = ((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.SuccessoTypesImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  4 :
                        if (("RispostaMassiva_Type" == ___local)&&("" == ___uri)) {
                            _MessaggioRispostaMassiva = ((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _MessaggioRispostaMassiva = ((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl.class), 5, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  3 :
                        if (("Successo" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        if (("Eccezione" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        if (("Messaggio_RispostaMassiva" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        break;
                    case  7 :
                        if (("Codice" == ___local)&&("" == ___uri)) {
                            _Eccezione = ((it.latraccia.entity.anasic.risposta.impl.EccezioneTypesImpl) spawnChildFromEnterElement((it.latraccia.entity.anasic.risposta.impl.EccezioneTypesImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  6 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
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
                    case  10 :
                        if (("Successo" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("Messaggio_RispostaMassiva" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("Eccezione" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("Intestazione" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  4 :
                        _MessaggioRispostaMassiva = ((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl) spawnChildFromLeaveElement((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  6 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
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
                    case  4 :
                        _MessaggioRispostaMassiva = ((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl) spawnChildFromEnterAttribute((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
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
                    case  4 :
                        _MessaggioRispostaMassiva = ((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl) spawnChildFromLeaveAttribute((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
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
                        case  4 :
                            _MessaggioRispostaMassiva = ((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl) spawnChildFromText((it.latraccia.entity.anasic.risposta.impl.MessaggioRispostaMassivaTypesImpl.class), 5, value));
                            return ;
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
