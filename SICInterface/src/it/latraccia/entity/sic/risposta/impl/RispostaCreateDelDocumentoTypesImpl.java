//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.17 at 12:28:37 PM CET 
//


package it.latraccia.entity.sic.risposta.impl;

public class RispostaCreateDelDocumentoTypesImpl implements it.latraccia.entity.sic.risposta.RispostaCreateDelDocumentoTypes, com.sun.xml.bind.JAXBObject, it.latraccia.entity.sic.risposta.impl.runtime.UnmarshallableObject, it.latraccia.entity.sic.risposta.impl.runtime.XMLSerializable, it.latraccia.entity.sic.risposta.impl.runtime.ValidatableObject
{

    protected boolean has_DocId;
    protected int _DocId;
    protected java.lang.String _Messaggio;
    protected java.lang.String _NumeroDocumentoPlur1;
    protected java.lang.String _NumeroDocumentoPlur2;
    protected java.lang.String _NumeroStorno;
    protected boolean has_DocId2;
    protected int _DocId2;
    protected boolean has_DocId1;
    protected int _DocId1;
    protected java.lang.String _NumeroDocumento;
    public final static java.lang.Class version = (it.latraccia.entity.sic.risposta.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (it.latraccia.entity.sic.risposta.RispostaCreateDelDocumentoTypes.class);
    }

    public int getDocId() {
        return _DocId;
    }

    public void setDocId(int value) {
        _DocId = value;
        has_DocId = true;
    }

    public java.lang.String getMessaggio() {
        return _Messaggio;
    }

    public void setMessaggio(java.lang.String value) {
        _Messaggio = value;
    }

    public java.lang.String getNumeroDocumentoPlur1() {
        return _NumeroDocumentoPlur1;
    }

    public void setNumeroDocumentoPlur1(java.lang.String value) {
        _NumeroDocumentoPlur1 = value;
    }

    public java.lang.String getNumeroDocumentoPlur2() {
        return _NumeroDocumentoPlur2;
    }

    public void setNumeroDocumentoPlur2(java.lang.String value) {
        _NumeroDocumentoPlur2 = value;
    }

    public java.lang.String getNumeroStorno() {
        return _NumeroStorno;
    }

    public void setNumeroStorno(java.lang.String value) {
        _NumeroStorno = value;
    }

    public int getDocId2() {
        return _DocId2;
    }

    public void setDocId2(int value) {
        _DocId2 = value;
        has_DocId2 = true;
    }

    public int getDocId1() {
        return _DocId1;
    }

    public void setDocId1(int value) {
        _DocId1 = value;
        has_DocId1 = true;
    }

    public java.lang.String getNumeroDocumento() {
        return _NumeroDocumento;
    }

    public void setNumeroDocumento(java.lang.String value) {
        _NumeroDocumento = value;
    }

    public it.latraccia.entity.sic.risposta.impl.runtime.UnmarshallingEventHandler createUnmarshaller(it.latraccia.entity.sic.risposta.impl.runtime.UnmarshallingContext context) {
        return new it.latraccia.entity.sic.risposta.impl.RispostaCreateDelDocumentoTypesImpl.Unmarshaller(context);
    }

    public void serializeBody(it.latraccia.entity.sic.risposta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_NumeroDocumento!= null) {
            context.startElement("", "NumeroDocumento");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _NumeroDocumento), "NumeroDocumento");
            } catch (java.lang.Exception e) {
                it.latraccia.entity.sic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_NumeroDocumentoPlur1 != null) {
            context.startElement("", "NumeroDocumento_Plur1");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _NumeroDocumentoPlur1), "NumeroDocumentoPlur1");
            } catch (java.lang.Exception e) {
                it.latraccia.entity.sic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_NumeroDocumentoPlur2 != null) {
            context.startElement("", "NumeroDocumento_Plur2");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _NumeroDocumentoPlur2), "NumeroDocumentoPlur2");
            } catch (java.lang.Exception e) {
                it.latraccia.entity.sic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_NumeroStorno!= null) {
            context.startElement("", "NumeroStorno");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _NumeroStorno), "NumeroStorno");
            } catch (java.lang.Exception e) {
                it.latraccia.entity.sic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (has_DocId) {
            context.startElement("", "DocId");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(javax.xml.bind.DatatypeConverter.printInt(((int) _DocId)), "DocId");
            } catch (java.lang.Exception e) {
                it.latraccia.entity.sic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (has_DocId1) {
            context.startElement("", "DocId1");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(javax.xml.bind.DatatypeConverter.printInt(((int) _DocId1)), "DocId1");
            } catch (java.lang.Exception e) {
                it.latraccia.entity.sic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (has_DocId2) {
            context.startElement("", "DocId2");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(javax.xml.bind.DatatypeConverter.printInt(((int) _DocId2)), "DocId2");
            } catch (java.lang.Exception e) {
                it.latraccia.entity.sic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_Messaggio!= null) {
            context.startElement("", "Messaggio");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _Messaggio), "Messaggio");
            } catch (java.lang.Exception e) {
                it.latraccia.entity.sic.risposta.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
    }

    public void serializeAttributes(it.latraccia.entity.sic.risposta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(it.latraccia.entity.sic.risposta.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (it.latraccia.entity.sic.risposta.RispostaCreateDelDocumentoTypes.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000pp"
+"sq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001pp"
+"sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnam"
+"eClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gram"
+"mar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcon"
+"tentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005value"
+"xp\u0000p\u0000sq\u0000~\u0000\u0000ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dt"
+"t\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLc"
+"om/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000%com.sun.msv.datatype."
+"xsd.PatternFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001[\u0000\bpatternst\u0000\u0013[Ljava/lang/String;"
+"xr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexicalConstraintFa"
+"cetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000"
+")Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'"
+"Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNamet\u0000\u0012Ljava/"
+"lang/String;xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpacet\u0000.Lc"
+"om/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000\u0000psr\u00005com.su"
+"n.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000"
+"\u0000sr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwa"
+"ysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u0000 t\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringq\u0000~\u0000&\u0001q\u0000~\u0000*t\u0000\u0007"
+"patternur\u0000\u0013[Ljava.lang.String;\u00ad\u00d2V\u00e7\u00e9\u001d{G\u0002\u0000\u0000xp\u0000\u0000\u0000\u0001t\u0000\b[0-9]{9}sr"
+"\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalN"
+"ameq\u0000~\u0000\u001fL\u0000\fnamespaceURIq\u0000~\u0000\u001fxpt\u0000\u000estring-derivedq\u0000~\u0000#sq\u0000~\u0000\fpp"
+"sr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000"
+"\tnameClassq\u0000~\u0000\u000fxq\u0000~\u0000\u0003q\u0000~\u0000\u0013psq\u0000~\u0000\u0015ppsr\u0000\"com.sun.msv.datatype."
+"xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000(q\u0000~\u0000+t\u0000\u0005QNamesr\u00005com.sun.msv.d"
+"atatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000%q\u0000~"
+"\u00002sq\u0000~\u00003q\u0000~\u0000<q\u0000~\u0000+sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000\fnamespaceURIq\u0000~\u0000\u001fxr\u0000\u001dcom.sun.msv"
+".grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2"
+"001/XMLSchema-instancesr\u00000com.sun.msv.grammar.Expression$Eps"
+"ilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0012\u0001q\u0000~\u0000Fsq\u0000~\u0000@t\u0000\u000fNumeroDo"
+"cumentoq\u0000~\u0000#q\u0000~\u0000Fsq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0019"
+"q\u0000~\u0000#pq\u0000~\u0000&\u0000\u0000q\u0000~\u0000*q\u0000~\u0000*q\u0000~\u0000-uq\u0000~\u0000.\u0000\u0000\u0000\u0001t\u0000\b[0-9]{9}q\u0000~\u00002sq\u0000~\u00003"
+"t\u0000\u000estring-derivedq\u0000~\u0000#sq\u0000~\u0000\fppsq\u0000~\u00007q\u0000~\u0000\u0013pq\u0000~\u00009q\u0000~\u0000Bq\u0000~\u0000Fsq\u0000"
+"~\u0000@t\u0000\u0015NumeroDocumento_Plur1q\u0000~\u0000#q\u0000~\u0000Fsq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0013p\u0000sq"
+"\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0019q\u0000~\u0000#pq\u0000~\u0000&\u0000\u0000q\u0000~\u0000*q\u0000~\u0000*q\u0000~\u0000-uq\u0000~\u0000.\u0000\u0000\u0000\u0001t\u0000"
+"\b[0-9]{9}q\u0000~\u00002sq\u0000~\u00003t\u0000\u000estring-derivedq\u0000~\u0000#sq\u0000~\u0000\fppsq\u0000~\u00007q\u0000~\u0000"
+"\u0013pq\u0000~\u00009q\u0000~\u0000Bq\u0000~\u0000Fsq\u0000~\u0000@t\u0000\u0015NumeroDocumento_Plur2q\u0000~\u0000#q\u0000~\u0000Fsq\u0000"
+"~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0019q\u0000~\u0000#pq\u0000~\u0000&\u0000\u0000q\u0000~\u0000*q\u0000"
+"~\u0000*q\u0000~\u0000-uq\u0000~\u0000.\u0000\u0000\u0000\u0001t\u0000\b[0-9]{9}q\u0000~\u00002sq\u0000~\u00003t\u0000\u000estring-derivedq\u0000~"
+"\u0000#sq\u0000~\u0000\fppsq\u0000~\u00007q\u0000~\u0000\u0013pq\u0000~\u00009q\u0000~\u0000Bq\u0000~\u0000Fsq\u0000~\u0000@t\u0000\fNumeroStornoq\u0000"
+"~\u0000#q\u0000~\u0000Fsq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015ppsr\u0000 com.sun.msv"
+".datatype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd"
+".IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetsq\u0000~\u0000\u001dxq\u0000~\u0000(q\u0000~\u0000+t"
+"\u0000\u0003intq\u0000~\u0000>sr\u0000*com.sun.msv.datatype.xsd.MaxInclusiveFacet\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\n"
+"limitValuet\u0000\u0012Ljava/lang/Object;xr\u00009com.sun.msv.datatype.xsd."
+"DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xq\u0000~\u0000\u001cppq\u0000~\u0000>\u0000\u0001sr"
+"\u0000*com.sun.msv.datatype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"zppq\u0000~\u0000>\u0000\u0000sr\u0000!com.sun.msv.datatype.xsd.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq"
+"\u0000~\u0000vq\u0000~\u0000+t\u0000\u0004longq\u0000~\u0000>sq\u0000~\u0000yppq\u0000~\u0000>\u0000\u0001sq\u0000~\u0000~ppq\u0000~\u0000>\u0000\u0000sr\u0000$com.s"
+"un.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000vq\u0000~\u0000+t\u0000\u0007inte"
+"gerq\u0000~\u0000>sr\u0000,com.sun.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexq\u0000~\u0000\u001bppq\u0000~\u0000>\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd.N"
+"umberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000(q\u0000~\u0000+t\u0000\u0007decimalq\u0000~\u0000>q\u0000~\u0000\u008bt\u0000\u000efracti"
+"onDigits\u0000\u0000\u0000\u0000q\u0000~\u0000\u0086t\u0000\fminInclusivesr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000"
+"\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000\u0086t\u0000\fma"
+"xInclusivesq\u0000~\u0000\u008f\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000\u0081q\u0000~\u0000\u008esr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7"
+"\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000\u0090\u0080\u0000\u0000\u0000q\u0000~\u0000\u0081q\u0000~\u0000\u0092sq\u0000~\u0000\u0094\u007f\u00ff\u00ff\u00ffq\u0000~\u00002sq\u0000~\u00003q\u0000~\u0000x"
+"q\u0000~\u0000+sq\u0000~\u0000\fppsq\u0000~\u00007q\u0000~\u0000\u0013pq\u0000~\u00009q\u0000~\u0000Bq\u0000~\u0000Fsq\u0000~\u0000@t\u0000\u0005DocIdq\u0000~\u0000#q"
+"\u0000~\u0000Fsq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000tsq\u0000~\u0000\fppsq\u0000~\u00007q\u0000~\u0000\u0013pq\u0000"
+"~\u00009q\u0000~\u0000Bq\u0000~\u0000Fsq\u0000~\u0000@t\u0000\u0006DocId1q\u0000~\u0000#q\u0000~\u0000Fsq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0013p\u0000s"
+"q\u0000~\u0000\u0000ppq\u0000~\u0000tsq\u0000~\u0000\fppsq\u0000~\u00007q\u0000~\u0000\u0013pq\u0000~\u00009q\u0000~\u0000Bq\u0000~\u0000Fsq\u0000~\u0000@t\u0000\u0006DocI"
+"d2q\u0000~\u0000#q\u0000~\u0000Fsq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015ppq\u0000~\u0000*q\u0000~\u00002s"
+"q\u0000~\u00003q\u0000~\u0000,q\u0000~\u0000+sq\u0000~\u0000\fppsq\u0000~\u00007q\u0000~\u0000\u0013pq\u0000~\u00009q\u0000~\u0000Bq\u0000~\u0000Fsq\u0000~\u0000@t\u0000\tM"
+"essaggioq\u0000~\u0000#q\u0000~\u0000Fsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Clo"
+"sedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7"
+"j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/g"
+"rammar/ExpressionPool;xp\u0000\u0000\u0000\u001f\u0001pq\u0000~\u0000Lq\u0000~\u00006q\u0000~\u0000Sq\u0000~\u0000`q\u0000~\u0000mq\u0000~\u0000\u0098"
+"q\u0000~\u0000\u009fq\u0000~\u0000\u00a6q\u0000~\u0000\u00afq\u0000~\u0000Jq\u0000~\u0000Yq\u0000~\u0000\u00acq\u0000~\u0000\u00aaq\u0000~\u0000\u0007q\u0000~\u0000qq\u0000~\u0000\u009cq\u0000~\u0000\u00a3q\u0000~\u0000\u0005"
+"q\u0000~\u0000fq\u0000~\u0000\tq\u0000~\u0000\nq\u0000~\u0000\u000bq\u0000~\u0000sq\u0000~\u0000\u009eq\u0000~\u0000\u00a5q\u0000~\u0000dq\u0000~\u0000\rq\u0000~\u0000\u0014q\u0000~\u0000\u0006q\u0000~\u0000\b"
+"q\u0000~\u0000Wx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends it.latraccia.entity.sic.risposta.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(it.latraccia.entity.sic.risposta.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------------------");
        }

        protected Unmarshaller(it.latraccia.entity.sic.risposta.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return it.latraccia.entity.sic.risposta.impl.RispostaCreateDelDocumentoTypesImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("NumeroDocumento" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  18 :
                        if (("DocId2" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 19;
                            return ;
                        }
                        state = 21;
                        continue outer;
                    case  6 :
                        if (("NumeroDocumento_Plur2" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  9 :
                        if (("NumeroStorno" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                    case  24 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  15 :
                        if (("DocId1" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 16;
                            return ;
                        }
                        state = 18;
                        continue outer;
                    case  21 :
                        if (("Messaggio" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 22;
                            return ;
                        }
                        state = 24;
                        continue outer;
                    case  3 :
                        if (("NumeroDocumento_Plur1" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  12 :
                        if (("DocId" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 13;
                            return ;
                        }
                        state = 15;
                        continue outer;
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  2 :
                        if (("NumeroDocumento" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  18 :
                        state = 21;
                        continue outer;
                    case  5 :
                        if (("NumeroDocumento_Plur1" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  11 :
                        if (("NumeroStorno" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 12;
                            return ;
                        }
                        break;
                    case  23 :
                        if (("Messaggio" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 24;
                            return ;
                        }
                        break;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  14 :
                        if (("DocId" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 15;
                            return ;
                        }
                        break;
                    case  20 :
                        if (("DocId2" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 21;
                            return ;
                        }
                        break;
                    case  24 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        if (("NumeroDocumento_Plur2" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  21 :
                        state = 24;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  17 :
                        if (("DocId1" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 18;
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  18 :
                        state = 21;
                        continue outer;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  24 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  21 :
                        state = 24;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  12 :
                        state = 15;
                        continue outer;
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  18 :
                        state = 21;
                        continue outer;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  24 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  21 :
                        state = 24;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  12 :
                        state = 15;
                        continue outer;
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
                            state = 5;
                            eatText1(value);
                            return ;
                        case  0 :
                            state = 3;
                            continue outer;
                        case  7 :
                            state = 8;
                            eatText2(value);
                            return ;
                        case  16 :
                            state = 17;
                            eatText3(value);
                            return ;
                        case  18 :
                            state = 21;
                            continue outer;
                        case  22 :
                            state = 23;
                            eatText4(value);
                            return ;
                        case  6 :
                            state = 9;
                            continue outer;
                        case  19 :
                            state = 20;
                            eatText5(value);
                            return ;
                        case  10 :
                            state = 11;
                            eatText6(value);
                            return ;
                        case  9 :
                            state = 12;
                            continue outer;
                        case  24 :
                            revertToParentFromText(value);
                            return ;
                        case  15 :
                            state = 18;
                            continue outer;
                        case  21 :
                            state = 24;
                            continue outer;
                        case  1 :
                            state = 2;
                            eatText7(value);
                            return ;
                        case  3 :
                            state = 6;
                            continue outer;
                        case  13 :
                            state = 14;
                            eatText8(value);
                            return ;
                        case  12 :
                            state = 15;
                            continue outer;
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
                _NumeroDocumentoPlur1 = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _NumeroDocumentoPlur2 = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _DocId1 = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_DocId1 = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Messaggio = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText5(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _DocId2 = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_DocId2 = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText6(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _NumeroStorno = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText7(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _NumeroDocumento = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText8(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _DocId = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_DocId = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
