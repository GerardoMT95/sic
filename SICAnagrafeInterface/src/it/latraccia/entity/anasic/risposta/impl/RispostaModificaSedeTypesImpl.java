//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 12:37:18 PM CET 
//


package it.latraccia.entity.anasic.risposta.impl;

public class RispostaModificaSedeTypesImpl implements it.latraccia.entity.anasic.risposta.RispostaModificaSedeTypes, com.sun.xml.bind.JAXBObject, it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallableObject, it.latraccia.entity.anasic.risposta.impl.runtime.XMLSerializable, it.latraccia.entity.anasic.risposta.impl.runtime.ValidatableObject
{

    protected java.lang.String _IdAnagrafica;
    protected java.lang.String _IdSede;
    protected java.lang.String _IdTipoPagamento;
    public final static java.lang.Class version = (it.latraccia.entity.anasic.risposta.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (it.latraccia.entity.anasic.risposta.RispostaModificaSedeTypes.class);
    }

    public java.lang.String getIdAnagrafica() {
        return _IdAnagrafica;
    }

    public void setIdAnagrafica(java.lang.String value) {
        _IdAnagrafica = value;
    }

    public java.lang.String getIdSede() {
        return _IdSede;
    }

    public void setIdSede(java.lang.String value) {
        _IdSede = value;
    }

    public java.lang.String getIdTipoPagamento() {
        return _IdTipoPagamento;
    }

    public void setIdTipoPagamento(java.lang.String value) {
        _IdTipoPagamento = value;
    }

    public it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallingEventHandler createUnmarshaller(it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallingContext context) {
        return new it.latraccia.entity.anasic.risposta.impl.RispostaModificaSedeTypesImpl.Unmarshaller(context);
    }

    public void serializeBody(it.latraccia.entity.anasic.risposta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "IdAnagrafica");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _IdAnagrafica), "IdAnagrafica");
        } catch (java.lang.Exception e) {
            it.latraccia.entity.anasic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("", "IdSede");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _IdSede), "IdSede");
        } catch (java.lang.Exception e) {
            it.latraccia.entity.anasic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("", "IdTipoPagamento");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _IdTipoPagamento), "IdTipoPagamento");
        } catch (java.lang.Exception e) {
            it.latraccia.entity.anasic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
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
        return (it.latraccia.entity.anasic.risposta.RispostaModificaSedeTypes.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\'com.sun.msv.grammar.trex.Ele"
+"mentPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Na"
+"meClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aigno"
+"reUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000pps"
+"r\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxn"
+"g/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/uti"
+"l/StringPair;xq\u0000~\u0000\u0003ppsr\u0000%com.sun.msv.datatype.xsd.PatternFac"
+"et\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001[\u0000\bpatternst\u0000\u0013[Ljava/lang/String;xr\u0000;com.sun.ms"
+"v.datatype.xsd.DataTypeWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000"
+"xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\f"
+"isFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/"
+"datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/d"
+"atatype/xsd/ConcreteType;L\u0000\tfacetNamet\u0000\u0012Ljava/lang/String;xr"
+"\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnames"
+"paceUriq\u0000~\u0000\u0016L\u0000\btypeNameq\u0000~\u0000\u0016L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/dat"
+"atype/xsd/WhiteSpaceProcessor;xpt\u0000\u0000psr\u00005com.sun.msv.datatype"
+".xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv."
+"datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000\u0000sr\u0000#com.sun.m"
+"sv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com"
+".sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.su"
+"n.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0017t\u0000 http://ww"
+"w.w3.org/2001/XMLSchemat\u0000\u0006stringq\u0000~\u0000\u001d\u0001q\u0000~\u0000!t\u0000\u0007patternur\u0000\u0013[Lj"
+"ava.lang.String;\u00ad\u00d2V\u00e7\u00e9\u001d{G\u0002\u0000\u0000xp\u0000\u0000\u0000\u0001t\u0000\t[0-9]{10}sr\u00000com.sun.msv"
+".grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001b"
+"com.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0016L\u0000\fna"
+"mespaceURIq\u0000~\u0000\u0016xpt\u0000\u000estring-derivedq\u0000~\u0000\u001asr\u0000\u001dcom.sun.msv.gramm"
+"ar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.Attri"
+"buteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\bxq\u0000~\u0000\u0003sr\u0000\u0011java"
+".lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\fppsr\u0000\"com.sun.msv."
+"datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001fq\u0000~\u0000\"t\u0000\u0005QNamesr\u00005com."
+"sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u001cq\u0000~\u0000)sq\u0000~\u0000*q\u0000~\u00006q\u0000~\u0000\"sr\u0000#com.sun.msv.grammar.SimpleNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0016L\u0000\fnamespaceURIq\u0000~\u0000\u0016xr\u0000\u001dco"
+"m.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www"
+".w3.org/2001/XMLSchema-instancesr\u00000com.sun.msv.grammar.Expre"
+"ssion$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u00001\u0001q\u0000~\u0000@sq\u0000~\u0000:t\u0000"
+"\fIdAnagraficaq\u0000~\u0000\u001asq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fppsq\u0000~\u0000\u0010q\u0000~\u0000\u001apq\u0000~\u0000\u001d"
+"\u0000\u0000q\u0000~\u0000!q\u0000~\u0000!q\u0000~\u0000$uq\u0000~\u0000%\u0000\u0000\u0000\u0001t\u0000\t[0-9]{10}q\u0000~\u0000)sq\u0000~\u0000*t\u0000\u000estring-"
+"derivedq\u0000~\u0000\u001asq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u00003q\u0000~\u0000<q\u0000~\u0000@sq\u0000~\u0000:t\u0000\u0006IdSe"
+"deq\u0000~\u0000\u001asq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fppsq\u0000~\u0000\u0010q\u0000~\u0000\u001apq\u0000~\u0000\u001d\u0000\u0000q\u0000~\u0000!q\u0000~\u0000"
+"!q\u0000~\u0000$uq\u0000~\u0000%\u0000\u0000\u0000\u0001t\u0000\t[0-9]{10}q\u0000~\u0000)sq\u0000~\u0000*t\u0000\u000estring-derivedq\u0000~\u0000"
+"\u001asq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u00003q\u0000~\u0000<q\u0000~\u0000@sq\u0000~\u0000:t\u0000\u000fIdTipoPagamento"
+"q\u0000~\u0000\u001asr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexp"
+"Tablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000"
+"-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005"
+"countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expres"
+"sionPool;xp\u0000\u0000\u0000\b\u0001pq\u0000~\u0000\u0005q\u0000~\u0000.q\u0000~\u0000Lq\u0000~\u0000Xq\u0000~\u0000Qq\u0000~\u0000\u000bq\u0000~\u0000\u0006q\u0000~\u0000Ex"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends it.latraccia.entity.anasic.risposta.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(it.latraccia.entity.anasic.risposta.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return it.latraccia.entity.anasic.risposta.impl.RispostaModificaSedeTypesImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("IdAnagrafica" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("IdTipoPagamento" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        break;
                    case  3 :
                        if (("IdSede" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        break;
                    case  9 :
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
                    case  5 :
                        if (("IdSede" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("IdAnagrafica" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("IdTipoPagamento" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  9 :
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
                    case  9 :
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
                    case  9 :
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
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  9 :
                            revertToParentFromText(value);
                            return ;
                        case  7 :
                            state = 8;
                            eatText2(value);
                            return ;
                        case  4 :
                            state = 5;
                            eatText3(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _IdAnagrafica = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _IdTipoPagamento = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _IdSede = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
