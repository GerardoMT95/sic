/**
 * Creato il 22 Settembre 2008
 * Modificato il 07 Dicembre 2011
 */
package it.latraccia.ws;

import java.math.BigInteger;


import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;

import java.io.ByteArrayInputStream;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import it.latraccia.utility.*;
import it.latraccia.entity.sic.richiesta.*;
import it.latraccia.entity.sic.risposta.*;
import it.latraccia.entity.sic.risposta.impl.COGTypeImpl;
import it.latraccia.entity.sic.risposta.impl.ListaCOGTypeImpl;
import it.latraccia.entity.sic.risposta.impl.PCFTypeImpl;
import it.latraccia.entity.sic.risposta.impl.RispostaDisponibilitaImpegnoTypesImpl;
import it.latraccia.entity.sic.risposta.impl.RispostaDisponibilitaImpegnoTypesImpl.BeneficiarioTypeImpl.InfoAggiuntiveBeneficiarioTypeImpl;
import it.latraccia.entity.sic.risposta.impl.RispostaInterrogaBeneficiariLiqTypesImpl.BeneficiarioTypeImpl;
import it.latraccia.entity.sic.risposta.impl.RispostaInterrogaCapitoloEntrataTypesImpl.CapitoloTypeImpl;
import it.latraccia.entity.sic.risposta.impl.RispostaInterrogaCodiceSiopeTypesImpl.SiopeTypeImpl;
import it.latraccia.entity.sic.risposta.impl.RispostaInterrogaReversaliCollegabiliTypesImpl.ReversaleTypeImpl;
import it.latraccia.entity.sic.risposta.impl.RispostaInterrogaTipologiaRedditoTypesImpl.TipologiaTypeImpl;


/**
 *
 * Web Service che consente di interfacciarsi con il SIC
 *
 * @author Vincenzo Gioviale
 *  
 */
public class SICInterface 
{

	int modificate = -1;


	//modificato da Angelo: tolto il tipo documento PRE-IMP
	Collection tipiDocConCOGObbl = new ArrayList(){
		{
			//add("PRE-IMP");
			add("IMP-DEF");
			add("IMP-PER");
		}
	};

	Collection tipiDocConTerzePartiObbl = new ArrayList(){
		{
			add("LIQ");
			add("MAND");
			add("REV");
			add("ACC");
			add("IMP");
			add("IMP-DEF");
			add("IMP-PER");
		}
	};

	/**
	 * Metodo per la richiesta al SIC
	 *
	 * @return String - risposta xml
	 * @param  q  - stringa contenente lo xml della richiesta 
	 * 
	 */
	public String querySIC(String q) 
	{
		String res = null;
		MessaggioRichiesta sicRequest=null;
		DB db = new DB();

		try 
		{
			ByteArrayInputStream bAIS = new ByteArrayInputStream(q.getBytes("UTF-8"));

			it.latraccia.entity.sic.richiesta.ObjectFactory objFactory = new it.latraccia.entity.sic.richiesta.ObjectFactory();
			Unmarshaller unmarshaller = objFactory.createUnmarshaller();

			sicRequest = (MessaggioRichiesta) unmarshaller.unmarshal(bAIS);

			if (sicRequest.getIntestazione().getApplicazione().length()==0)
			{
				return esitoNegativo(new BigInteger("1"),"Nome applicazione non indicato","SIC","Regione Basilicata");
			}

			if (sicRequest.getIntestazione().getInfoMittDest().length()==0)
			{
				return esitoNegativo(new BigInteger("1"),"Informazioni del mittente e destinatario non fornite","SIC","Regione Basilicata");
			}
			/*
			if (sicRequest.getRichiesta().getGenerazioneImpegno()!=null)
			{
				NumeroDocumentoResult gir = db.generazioneImpegno(sicRequest.getRichiesta().getGenerazioneImpegno());
				if (gir.getCodiceRisposta()!=0) //SE c'è stato qualche problema restituisco l'eccezione
				{
					res = esitoNegativo(new BigInteger(String.valueOf(gir.getCodiceRisposta())),gir.getDescrizioneRisposta(),"SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaGenerazioneImpegnoTypes rgit = objFactory1.createRispostaGenerazioneImpegnoTypes();

					rgit.setNumeroDocumento(gir.getNumeroDocumento());

					st.setRispostaGenerazioneImpegno(rgit);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getGenerazioneLiquidazione()!=null)
			{
				NumeroDocumentoResult glr = db.generazioneLiquidazione(sicRequest.getRichiesta().getGenerazioneLiquidazione());
				if (glr.getCodiceRisposta()!=0) //SE c'è stato qualche problema restituisco l'eccezione
				{
					res = esitoNegativo(new BigInteger(String.valueOf(glr.getCodiceRisposta())),glr.getDescrizioneRisposta(),"SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaGenerazioneLiquidazioneTypes rglt = objFactory1.createRispostaGenerazioneLiquidazioneTypes();

					rglt.setNumeroDocumento(glr.getNumeroDocumento());

					st.setRispostaGenerazioneLiquidazione(rglt);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}
			 */			
			if (sicRequest.getRichiesta().getDisponibilitaPreImpegno()!=null)
			{
				DisponibilitaResult dr = db.getDisponibilitaPreImp(sicRequest.getRichiesta().getDisponibilitaPreImpegno().getNumeroPreimpegno(), sicRequest.getRichiesta().getDisponibilitaPreImpegno().getStruttura());

				if (dr == null)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					if (dr.getCodiceRisposta()!=0) //SE c'è stato qualche problema restituisco l'eccezione
					{
						res = esitoNegativo(new BigInteger(String.valueOf(dr.getCodiceRisposta())),dr.getDescrizioneRisposta(),"SIC","Regione Basilicata");
					}
					else
					{
						JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
						it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
						MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
						it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
						it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

						iti.setApplicazione("SIC");
						iti.setInfoMittDest("Regione Basilicata");
						mr.setIntestazione(iti);
						it.latraccia.entity.sic.risposta.RispostaDisponibilitaPreImpegnoTypes rdpit = objFactory1.createRispostaDisponibilitaPreImpegnoTypes();

						rdpit.setDisponibilita(dr.getDisponibilita());

						//Modifica Michele
						Calendar cal = Calendar.getInstance();
						cal.setTime(dr.getDataPreimpegno());
						rdpit.setDataPreimpegno(cal);
						rdpit.setCodiceCapitolo(dr.getCodiceCapitolo());
						rdpit.setUPB(dr.getUPB());
						rdpit.setMissioneProgramma(dr.getMissioneProgramma());

						if (dr.getTipoAtto() == null)
						{
							rdpit.setTipoAtto("");
						}
						else
						{
							rdpit.setTipoAtto(dr.getTipoAtto());
						}


						Calendar cal2 = Calendar.getInstance();
						cal2.setTime(dr.getDataAtto());
						rdpit.setDataAtto(cal2);
						rdpit.setNumeroAtto(dr.getNumeroAtto());

						if (dr.getOggettoPreimpegno()==null)
						{
							rdpit.setOggettoPreimpegno("");
						}
						else
						{
							rdpit.setOggettoPreimpegno(dr.getOggettoPreimpegno());
						}
						//Modifica Michele Fine

						st.setRispostaDisponibilitaPreImpegno(rdpit);
						mr.setSuccesso(st);

						Marshaller marshaller = jaxbContext.createMarshaller();
						marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						marshaller.marshal(mr, baos);
						res = baos.toString("UTF-8");
					}
				}
			}

			/*				
			if (sicRequest.getRichiesta().getGenerazionePreImpegno()!=null)
			{
				NumeroDocumentoResult gpir = db.generazionePreImpegno(sicRequest.getRichiesta().getGenerazionePreImpegno());
				if (gpir.getCodiceRisposta()!=0) //SE c'è stato qualche problema restituisco l'eccezione
				{
					res = esitoNegativo(new BigInteger(String.valueOf(gpir.getCodiceRisposta())),gpir.getDescrizioneRisposta(),"SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaGenerazionePreImpegnoTypes rgpit = objFactory1.createRispostaGenerazionePreImpegnoTypes();

					rgpit.setNumeroDocumento(gpir.getNumeroDocumento());

					st.setRispostaGenerazionePreImpegno(rgpit);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getEliminazionePreImpegno()!=null)
			{
				NumeroDocumentoResult epir = db.eliminazionePreImpegno(sicRequest.getRichiesta().getEliminazionePreImpegno().getNumeroPreimpegno());
				if (epir.getCodiceRisposta()!=0) //SE c'è stato qualche problema restituisco l'eccezione
				{
					res = esitoNegativo(new BigInteger(String.valueOf(epir.getCodiceRisposta())),epir.getDescrizioneRisposta(),"SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaEliminazionePreImpegnoTypes repit = objFactory1.createRispostaEliminazionePreImpegnoTypes();

					repit.setNumeroDocumento(epir.getNumeroDocumento());

					st.setRispostaEliminazionePreImpegno(repit);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}
			 */			
			if (sicRequest.getRichiesta().getInterrogazioneBilancio()!=null)
			{
				//modifica by leo: aggiunge il parametro struttura leggendolo dalla request
				InterrogaBilancioResult ibr = db.interrogaBilancio(sicRequest.getRichiesta().getInterrogazioneBilancio().getAnnoBilancio(), sicRequest.getRichiesta().getInterrogazioneBilancio().getCodiceCapitolo(), sicRequest.getRichiesta().getInterrogazioneBilancio().getStruttura());

				if (ibr.getCodiceRisposta()!=0) //SE c'è stato qualche problema restituisco l'eccezione
				{
					res = esitoNegativo(new BigInteger(String.valueOf(ibr.getCodiceRisposta())),ibr.getDescrizioneRisposta(),"SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogazioneBilancioTypes ribt = objFactory1.createRispostaInterrogazioneBilancioTypes();

					ribt.setAnnoBilancio(String.valueOf(ibr.getAnnoBilancio()));
					ribt.setCassa(ibr.getCassa());
					ribt.setCodiceCapitolo(ibr.getCodiceCapitolo());
					ribt.setCompetenza(ibr.getCompetenza());
					ribt.setContoEconomica1(ibr.getContoEconomica1()==null?"":ibr.getContoEconomica1());
					ribt.setContoEconomica2(ibr.getContoEconomica2()==null?"":ibr.getContoEconomica2());
					ribt.setContoEconomica3(ibr.getContoEconomica3()==null?"":ibr.getContoEconomica3());
					ribt.setContoEconomica4(ibr.getContoEconomica4()==null?"":ibr.getContoEconomica4());
					ribt.setContoEconomica5(ibr.getContoEconomica5()==null?"":ibr.getContoEconomica5());
					ribt.setDescrizioneCapitolo(ibr.getDescrizioneCapitolo());
					ribt.setDispCassa(ibr.getDispCassa());
					ribt.setDispCompetenza(ibr.getDispCompetenza());
					ribt.setImpegni(ibr.getImpegni());
					ribt.setMandati(ibr.getMandati());
					ribt.setPOR(ibr.getPor());
					ribt.setPreImpegni(ibr.getPreImpegni());
					ribt.setResiduo(ibr.getResiduo());
					ribt.setPerenti(ibr.getPerenti());
					//modifica by leo: setta la lista COG leggendolo dall'oggetto ritornato dal DB
					ribt.setListaCOG(ibr.getListaCOG());
					
					/** simonebrunox 07/02/2018: aggiungo missione_programma e verifica blocco */
					ribt.setMissioneProgramma(ibr.getMissioneProgramma());
					ribt.setCodiceRisposta(String.valueOf(ibr.getCodiceRispostaBlocco()));
					ribt.setDescrizioneRisposta(ibr.getDescrizioneRispostaBlocco());
					/** simonebrunox 07/02/2018: aggiungo missione_programma e verifica blocco */

					st.setRispostaInterrogazioneBilancio(ribt);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogazioneCapitoli()!=null)
			{
				List icrl = db.interrogaCapitolo(sicRequest.getRichiesta().getInterrogazioneCapitoli().getAnnoBilancio(), sicRequest.getRichiesta().getInterrogazioneCapitoli().getStruttura());
				ListIterator li = icrl.listIterator();
				if (li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogazioneCapitoliTypes rict = objFactory1.createRispostaInterrogazioneCapitoliTypes();
					List caps = rict.getCapitolo();

					while (li.hasNext()) 
					{
						InterrogaCapitoloResult icr = (InterrogaCapitoloResult)li.next();    
						it.latraccia.entity.sic.risposta.RispostaInterrogazioneCapitoliTypes.CapitoloType cc = objFactory1.createRispostaInterrogazioneCapitoliTypesCapitoloType();
						cc.setAnnoBilancio(String.valueOf(icr.getAnnoBilancio()));
						cc.setCodiceCapitolo(icr.getCodiceCapitolo());
						cc.setDescrizioneCapitolo(icr.getDescrizioneCapitolo());
						cc.setUPB(icr.getUPB());
						cc.setMissioneProgramma(icr.getMissioneProgramma());
						cc.setPerenti(icr.getPerenti());

						//Modifica Michele
						cc.setDisponibilitaCassa(icr.getDisponibilitaCassa());
						cc.setDisponibilitaCompetenza(icr.getDisponibilitaCompetenza());						
						//Modifica Michele Fine
						
						cc.setCodiceRisposta(icr.getCodiceRisposta());
						cc.setDescrizioneRisposta(icr.getDescrizioneRisposta());

						caps.add(cc);
					}
					st.setRispostaInterrogazioneCapitoli(rict);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogazioneCapitoliLiquidazioni()!=null)
			{
				List icrl = db.interrogaCapitoliLiq(sicRequest.getRichiesta().getInterrogazioneCapitoliLiquidazioni().getAnnoBilancio(), sicRequest.getRichiesta().getInterrogazioneCapitoliLiquidazioni().getStruttura());
				ListIterator li = icrl.listIterator();
				if (li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();
					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogazioneCapitoliTypes rict = objFactory1.createRispostaInterrogazioneCapitoliTypes();
					List caps = rict.getCapitolo();

					while (li.hasNext()) 
					{
						InterrogaCapitoloResult icr = (InterrogaCapitoloResult)li.next();    
						it.latraccia.entity.sic.risposta.RispostaInterrogazioneCapitoliTypes.CapitoloType cc = objFactory1.createRispostaInterrogazioneCapitoliTypesCapitoloType();
						cc.setAnnoBilancio(String.valueOf(icr.getAnnoBilancio()));
						cc.setCodiceCapitolo(icr.getCodiceCapitolo());
						cc.setDescrizioneCapitolo(icr.getDescrizioneCapitolo());
						cc.setUPB(icr.getUPB());
						cc.setMissioneProgramma(icr.getMissioneProgramma());
						cc.setPerenti(icr.getPerenti());

						//Modifica Michele
						cc.setDisponibilitaCassa(icr.getDisponibilitaCassa());
						cc.setDisponibilitaCompetenza(icr.getDisponibilitaCompetenza());						
						//Modifica Michele Fine
						
						cc.setCodiceRisposta(icr.getCodiceRisposta());
						cc.setDescrizioneRisposta(icr.getDescrizioneRisposta());

						caps.add(cc);
					}
					st.setRispostaInterrogazioneCapitoliLiquidazioni(rict);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogazioneImpegniAperti()!=null) //Michele
			{
				////Modifica Leo: aggiungere il parametro struttura leggendolo dalla request
				List icrl = db.getImpegniAperti(sicRequest.getRichiesta().getInterrogazioneImpegniAperti().getAnnoFinanziario(),sicRequest.getRichiesta().getInterrogazioneImpegniAperti().getCodiceCapitolo(),sicRequest.getRichiesta().getInterrogazioneImpegniAperti().getStruttura());
				ListIterator li = icrl.listIterator();
				if(li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else 
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogazioneImpegniApertiTypes riiat = objFactory1.createRispostaInterrogazioneImpegniApertiTypes();
					List imps = riiat.getImpegno();
					while(li.hasNext())
					{
						InterrogaImpegniApertiResult iiar = (InterrogaImpegniApertiResult)li.next();
						it.latraccia.entity.sic.risposta.RispostaInterrogazioneImpegniApertiTypes.ImpegnoType it = objFactory1.createRispostaInterrogazioneImpegniApertiTypesImpegnoType();

						if (iiar.getDataAtto() == null)
						{
							Calendar c = Calendar.getInstance();
							c.set(1000, 0, 1);
							it.setDataAtto(c);
						}
						else
						{
							Calendar cal = Calendar.getInstance();
							cal.setTime(iiar.getDataAtto());
							it.setDataAtto(cal);

						}

						if (iiar.getDataImpegno() == null)
						{
							Calendar c = Calendar.getInstance();
							c.set(1000, 0, 1);
							it.setDataImpegno(c);
						}
						else
						{
							Calendar cal2 = Calendar.getInstance();
							cal2.setTime(iiar.getDataImpegno());
							it.setDataImpegno(cal2);
						}

						it.setImportoDisponibile(iiar.getImportoDisponibile());
						it.setImportoIniziale(iiar.getImportoIniziale());

						it.setUtilizzabile(iiar.getUtilizzabile());
						it.setMotivoNonUtilizzabile(iiar.getMotivoNonUtilizzabile());
						
						it.setTipoImpegno(iiar.getTipoImpegno());
						it.setNumeroImpegno(iiar.getNumeroImpegno());

						if (iiar.getNumeroAtto()==null)
						{
							it.setNumeroAtto("");
						}
						else
						{
							it.setNumeroAtto(iiar.getNumeroAtto());
						}

						if (iiar.getOggettoImpegno()==null)
						{
							it.setOggettoImpegno("");
						}
						else
						{
							it.setOggettoImpegno(iiar.getOggettoImpegno());
						}

						if (iiar.getTipoAtto() == null)
						{
							it.setTipoAtto("");
						}
						else
						{
							it.setTipoAtto(iiar.getTipoAtto());
						}

						//Modifica Leo: settare alla response il valore di COG
						if(iiar.getCOG() == null)
						{
							it.setCOGSemplice("");
						}
						else
						{
							it.setCOGSemplice(iiar.getCOG());
						}
						
						PCFType pcf=objFactory1.createPCFType();
						
						if(iiar.getCodicePCF()==null){
							pcf.setCodice("");	
						}
						else{
							pcf.setCodice(iiar.getCodicePCF());
							
						}
						
						pcf.setDescrizione(iiar.getDescrizionePCF());
						
						it.setPCF(pcf);

						imps.add(it);
					}
					st.setRispostaInterrogazioneImpegniAperti(riiat);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}if (sicRequest.getRichiesta().getInterrogazionePreimpegniAperti()!=null) //Michele
			{
				List icrl = db.getPreimpegniAperti(sicRequest.getRichiesta().getInterrogazionePreimpegniAperti().getAnnoFinanziario(),sicRequest.getRichiesta().getInterrogazionePreimpegniAperti().getCodiceCapitolo(), sicRequest.getRichiesta().getInterrogazionePreimpegniAperti().getStruttura());
				ListIterator li = icrl.listIterator();
				if(li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}else{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogazionePreimpegniApertiTypes ripa = objFactory1.createRispostaInterrogazionePreimpegniApertiTypes();
					List imps = ripa.getPreimpegno();
					while(li.hasNext())
					{
						InterrogaPreimpegniApertiResult ipar = (InterrogaPreimpegniApertiResult)li.next();
						it.latraccia.entity.sic.risposta.RispostaInterrogazionePreimpegniApertiTypes.PreimpegnoType it = objFactory1.createRispostaInterrogazionePreimpegniApertiTypesPreimpegnoType();

						if (ipar.getDataAtto() == null)
						{
							Calendar c = Calendar.getInstance();
							c.set(1000, 0, 1);
							it.setDataAtto(c);
						}
						else
						{
							Calendar cal = Calendar.getInstance();
							cal.setTime(ipar.getDataAtto());
							it.setDataAtto(cal);
						}

						Calendar cal2 = Calendar.getInstance();
						cal2.setTime(ipar.getDataPreimpegno());
						it.setDataPreimpegno(cal2);
						it.setImportoDisponibile(ipar.getImportoDisponibile());
						it.setImportoIniziale(ipar.getImportoIniziale());
						it.setNumeroPreimpegno(ipar.getNumeroPreimpegno());

						if (ipar.getNumeroAtto()==null)
						{
							it.setNumeroAtto("");
						}
						else
						{
							it.setNumeroAtto(ipar.getNumeroAtto());
						}

						if (ipar.getOggettoPreimpegno()==null)
						{
							it.setOggettoPreimpegno("");
						}
						else
						{
							it.setOggettoPreimpegno(ipar.getOggettoPreimpegno());
						}

						if (ipar.getTipoAtto()==null)
						{
							it.setTipoAtto("");
						}
						else
						{
							it.setTipoAtto(ipar.getTipoAtto());
						}

						it.setTipoAtto(ipar.getTipoAtto());
						
						PCFType pcf=objFactory1.createPCFType();
						
						if(ipar.getCodicePCF()==null){
							
							pcf.setCodice("");
							
						}
						else{
							pcf.setCodice(ipar.getCodicePCF());
								
						}
						
						pcf.setDescrizione(ipar.getDescrizionePCF());
						
						it.setPCF(pcf);

						imps.add(it);
					}
					st.setRispostaInterrogazionePreimpegniAperti(ripa);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res=baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogazioneLiquidazioniAperte()!=null)
			{
				List icrl = db.getLiquidazioniAperte(sicRequest.getRichiesta().getInterrogazioneLiquidazioniAperte().getAnnoFinanziario(),sicRequest.getRichiesta().getInterrogazioneLiquidazioniAperte().getCodiceCapitolo());
				ListIterator li = icrl.listIterator();
				if(li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogazioneLiquidazioniAperteTypes rila = objFactory1.createRispostaInterrogazioneLiquidazioniAperteTypes();
					List imls = rila.getLiquidazione();
					while(li.hasNext())
					{
						InterrogaLiquidazioniAperteResult ilar = (InterrogaLiquidazioniAperteResult)li.next();
						it.latraccia.entity.sic.risposta.RispostaInterrogazioneLiquidazioniAperteTypes.LiquidazioneType lt = objFactory1.createRispostaInterrogazioneLiquidazioniAperteTypesLiquidazioneType();

						lt.setImporto(ilar.getImportoLiquidazione());
						lt.setImportoResiduo(ilar.getResiduoLiquidazione());
						lt.setNumero(ilar.getNumeroLiquidazione());
						if (ilar.getOggettoLiquidazione()==null)
						{
							lt.setOggetto("");
						}
						else
						{
							lt.setOggetto(ilar.getOggettoLiquidazione());
						}
						lt.setCapitolo(ilar.getCapitoloLiquidazione());

						imls.add(lt);
					}
					st.setRispostaInterrogazioneLiquidazioniAperte(rila);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res=baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogazioneImpegniPerenti()!=null)
			{
				List icrl = db.getImpegniPerenti(sicRequest.getRichiesta().getInterrogazioneImpegniPerenti().getAnnoFinanziario(),sicRequest.getRichiesta().getInterrogazioneImpegniPerenti().getCodiceCapitolo());
				ListIterator li = icrl.listIterator();
				if(li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else 
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogazioneImpegniPerentiTypes riipt = objFactory1.createRispostaInterrogazioneImpegniPerentiTypes();
					List imps = riipt.getImpegnoPerente();
					while(li.hasNext())
					{
						InterrogaImpegniPerentiResult iipr = (InterrogaImpegniPerentiResult)li.next();
						it.latraccia.entity.sic.risposta.RispostaInterrogazioneImpegniPerentiTypes.ImpegnoPerenteType ipt = objFactory1.createRispostaInterrogazioneImpegniPerentiTypesImpegnoPerenteType();

						ipt.setCapitoloAttuale(iipr.getCapitoloAttuale());
						ipt.setCapitoloOriginario(iipr.getCapitoloOriginario());
						ipt.setImportoOriginario(iipr.getImportoOriginario());
						ipt.setImportoResiduo(iipr.getImportoResiduo());
						ipt.setNumero(iipr.getNumeroImpegno());
						if (iipr.getOggettoImpegno()==null)
						{
							ipt.setOggetto("");
						}
						else
						{
							ipt.setOggetto(iipr.getOggettoImpegno());
						}
						
						PCFType pcf = objFactory1.createPCFType();
						
						if (iipr.getCodicePCF()==null){
							pcf.setCodice("");
						}
						else{
							pcf.setCodice(iipr.getCodicePCF());
							
						}
						pcf.setDescrizione(iipr.getDescrizionePCF());
						
						ipt.setPCF(pcf);

						imps.add(ipt);
					}
					st.setRispostaInterrogazioneImpegniPerenti(riipt);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getPrenotazionePreimpegni()!=null) //Michele
			{
				PrenotazionePreimpegnoResult ppr  = db.getPrenotazionePreimpegno(sicRequest.getRichiesta().getPrenotazionePreimpegni().getTipoOperazione(),sicRequest.getRichiesta().getPrenotazionePreimpegni().getNumeroPreimpegno(),sicRequest.getRichiesta().getPrenotazionePreimpegni().getImporto());
				if (ppr.getCodiceRisposta()!=0) //SE c'è stato qualche problema restituisco l'eccezione
				{
					res = esitoNegativo(new BigInteger(String.valueOf(ppr.getCodiceRisposta())),ppr.getDescrizioneRisposta(),"SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaPrenotazionePreimpegniTypes rppt = objFactory1.createRispostaPrenotazionePreimpegniTypes();

					rppt.setCodice(new BigInteger(String.valueOf(ppr.getCodiceRisposta())));
					rppt.setDescrizione(ppr.getDescrizioneRisposta());

					st.setRispostaPrenotazionePreimpegni(rppt);
					mr.setSuccesso(st);


					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res=baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getCreateDelDocumento()!=null)
			{
				//TODO esce con esito negativo se il cog è null nel caso di tipo documento = PRE-IMP, IMP-DEF, IMP-PER (mofificare gli xsd)
				//eliminando i servizi GeneraImpegno, GeneraPreImpegno e GeneraLiquidazione e far restare solo CreateDelDocumento, con l'aggiunta del
				//campo COG opzionale

				String tipoDocumento = sicRequest.getRichiesta().getCreateDelDocumento().getTipoDocumento();
				if (tipiDocConCOGObbl.contains(tipoDocumento) && sicRequest.getRichiesta().getCreateDelDocumento().getCOG()==null)
					return esitoNegativo(new BigInteger("1"),"Campo COG obbligatorio per il tipo documento "  + tipoDocumento,"SIC","Regione Basilicata");

				//Modificato da Angelo: se il tipo documento è pre-imp allora faccio dei controlli sui campi COG e Importo
				if(tipoDocumento.equalsIgnoreCase("PRE-IMP")){
					if(sicRequest.getRichiesta().getCreateDelDocumento().getCOG()==null && sicRequest.getRichiesta().getCreateDelDocumento().getCOGPlur1()==null && sicRequest.getRichiesta().getCreateDelDocumento().getCOGPlur2()==null){
						return esitoNegativo(new BigInteger("1"),"Almeno uno dei campi COG, COGPlur1, COGPlur2 è obbligatorio per il tipo documento "  + tipoDocumento,"SIC","Regione Basilicata");
					}
					else{
						if(sicRequest.getRichiesta().getCreateDelDocumento().getImporto()!=0 && sicRequest.getRichiesta().getCreateDelDocumento().getCOG()==null){
							return esitoNegativo(new BigInteger("1"),"Campo Importo non nullo e campo COG non presente per il tipo documento "  + tipoDocumento,"SIC","Regione Basilicata");
						}
						if(sicRequest.getRichiesta().getCreateDelDocumento().getImportoPlur1()!=0 && sicRequest.getRichiesta().getCreateDelDocumento().getCOGPlur1()==null){
							return esitoNegativo(new BigInteger("1"),"Campo ImportoPlur1 non nullo e campo COGPlur1 non presente per il tipo documento "  + tipoDocumento,"SIC","Regione Basilicata");
						}
						if(sicRequest.getRichiesta().getCreateDelDocumento().getImportoPlur2()!=0 && sicRequest.getRichiesta().getCreateDelDocumento().getCOGPlur2()==null){
							return esitoNegativo(new BigInteger("1"),"Campo ImportoPlur2 non nullo e campo COGPlur2 non presente per il tipo documento "  + tipoDocumento,"SIC","Regione Basilicata");
						}
					}

				}

				//esce con esito negativo se mancano le terze parti nel caso di tipo documento = LIQ, MAND, REV, ACC, IMP, IMP-DEF, IMP-PER
				if (tipiDocConTerzePartiObbl.contains(tipoDocumento) && (sicRequest.getRichiesta().getCreateDelDocumento().getBeneficiari()==null || sicRequest.getRichiesta().getCreateDelDocumento().getBeneficiari().getBeneficiario().size()==0))
					return esitoNegativo(new BigInteger("1"),"Lista dei Beneficiari obbligatoria per il tipo documento "  + tipoDocumento,"SIC","Regione Basilicata");				

				//esce con esito negativo se ci sono reversali collegate ad un documento diverso da MAND
				if (!tipoDocumento.equals("MAND") && sicRequest.getRichiesta().getCreateDelDocumento().getReversaliColl()!=null)
					return esitoNegativo(new BigInteger("1"),"Non è possibile indicare Reversali collegate per il tipo documento "  + tipoDocumento,"SIC","Regione Basilicata");				

				//esce con esito negativo se mancano le terze parti nel caso di tipo documento = LIQ, MAND, REV, ACC, IMP, IMP-DEF, IMP-PER
				if (!tipiDocConTerzePartiObbl.contains(tipoDocumento) && sicRequest.getRichiesta().getCreateDelDocumento().getBeneficiari()!=null)
					return esitoNegativo(new BigInteger("1"),"Non è possibile indicare la lista dei Beneficiari per il tipo documento "  + tipoDocumento,"SIC","Regione Basilicata");				

				NumeroDocumentoResult gir = db.createDelDocumento(sicRequest.getRichiesta().getCreateDelDocumento());

				if (gir.getCodiceRisposta()!=0) { 
					//SE c'è stato qualche problema restituisco l'eccezione 
					res = esitoNegativo(new BigInteger(String.valueOf(gir.getCodiceRisposta())),gir.getDescrizioneRisposta(),"SIC","Regione Basilicata");
				} else {
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaCreateDelDocumentoTypes rcddt = objFactory1.createRispostaCreateDelDocumentoTypes();


					rcddt.setNumeroDocumento(gir.getNumeroDocumento());

					//Aggiunti da Angelo numeri documenti pluriennali
					rcddt.setNumeroDocumentoPlur1(gir.getNumeroDocumentoPlur1());
					rcddt.setNumeroDocumentoPlur2(gir.getNumeroDocumentoPlur2());
					rcddt.setDocId(gir.getDocId());
					rcddt.setDocId1(gir.getDocId1());
					rcddt.setDocId2(gir.getDocId2());
					
					/** simonebrunox 16/12/2019: mostra sempre codice e messaggio risposta */
					rcddt.setMessaggio(gir.getDescrizioneRisposta());
					/** simonebrunox 16/12/2019: mostra sempre codice e messaggio risposta */

					st.setRispostaCreateDelDocumento(rcddt);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getDisponibilitaImpegno()!=null)
			{
				DisponibilitaImpResult dr = db.getDisponibilitaImp(sicRequest.getRichiesta().getDisponibilitaImpegno().getNumeroImpegno());

				if (dr == null)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{

					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaDisponibilitaImpegnoTypes rdpit = objFactory1.createRispostaDisponibilitaImpegnoTypes();

					rdpit.setCodiceCapitolo(dr.getCodiceCapitolo());
					rdpit.setDisponibilita(dr.getImportoResiduo());
					rdpit.setImporto(dr.getImportoImpegno());		
					if(dr.getOggetto()==null)
						rdpit.setOggettoImpegno("");
					else rdpit.setOggettoImpegno(dr.getOggetto());
					rdpit.setPerenti(dr.getPerente());
					//modifica leo: aggiunto COG per dispImpiego
					rdpit.setCOGSemplice(dr.getCOG());
					
					/* simonebrunox 16/06/2017: esposizione beneficiari dell'impegno */
					List ibi = db.interrogaBeneficiariImp(sicRequest.getRichiesta().getDisponibilitaImpegno().getNumeroImpegno());
					ListIterator li = ibi.listIterator();
					List beneficiari = rdpit.getBeneficiario();
					while (li.hasNext()) 
					{
						InterrogaBeneficiariImpResult ibir = (InterrogaBeneficiariImpResult)li.next();    
						RispostaDisponibilitaImpegnoTypesImpl.BeneficiarioTypeImpl bti = new RispostaDisponibilitaImpegnoTypesImpl.BeneficiarioTypeImpl();
						bti.setIdBeneficiario(ibir.getIdBeneficiario());
						bti.setDescrizioneBeneficiario(ibir.getDescrizioneBeneficiario());
						bti.setIdSede(ibir.getIdSede());
						bti.setImportoOriginario(ibir.getImportoOriginario());
						bti.setImportoResiduo(ibir.getImportoResiduo());
						
						InfoAggiuntiveBeneficiarioTypeImpl iabti = new InfoAggiuntiveBeneficiarioTypeImpl();	
						iabti.setTipoAnagrafica(ibir.getInfoAggiuntiveBeneficiarioType().getTipoAnagrafica());
						iabti.setCodiceFiscale(ibir.getInfoAggiuntiveBeneficiarioType().getCodiceFiscale());
						iabti.setPartitaIva(ibir.getInfoAggiuntiveBeneficiarioType().getPartitaIva());
						iabti.setNomeSede(ibir.getInfoAggiuntiveBeneficiarioType().getNomeSede());
						iabti.setIndirizzoSede(ibir.getInfoAggiuntiveBeneficiarioType().getIndirizzoSede());
						iabti.setNomeMetodoPagamento(ibir.getInfoAggiuntiveBeneficiarioType().getNomeMetodoPagamento());
						iabti.setInfoAggiuntive(ibir.getInfoAggiuntiveBeneficiarioType().getInfoAggiuntive());
						iabti.setMetodoPagamento(ibir.getInfoAggiuntiveBeneficiarioType().getMetodoPagamento());
						iabti.setContoBancario(ibir.getInfoAggiuntiveBeneficiarioType().getContoBancario());
						iabti.setIban(ibir.getInfoAggiuntiveBeneficiarioType().getIban());
						iabti.setIdDelegato(ibir.getInfoAggiuntiveBeneficiarioType().getIdDelegato());
						iabti.setAnagraficaDelegato(ibir.getInfoAggiuntiveBeneficiarioType().getAnagraficaDelegato());
						iabti.setCodiceFiscaleDelegato(ibir.getInfoAggiuntiveBeneficiarioType().getCodiceFiscaleDelegato());
						iabti.setIdSedeDelegato(ibir.getInfoAggiuntiveBeneficiarioType().getIdSedeDelegato());
						iabti.setContoBancarioDelegato(ibir.getInfoAggiuntiveBeneficiarioType().getContoBancarioDelegato());
						iabti.setIbanDelegato(ibir.getInfoAggiuntiveBeneficiarioType().getIbanDelegato());
						iabti.setCommissioni(ibir.getInfoAggiuntiveBeneficiarioType().getCommissioni());
						iabti.setBollo(ibir.getInfoAggiuntiveBeneficiarioType().getBollo());
						iabti.setCodiceCup(ibir.getInfoAggiuntiveBeneficiarioType().getCodiceCup());
						iabti.setCodiceCig(ibir.getInfoAggiuntiveBeneficiarioType().getCodiceCig());
						iabti.setDatoSensibile(ibir.getInfoAggiuntiveBeneficiarioType().getDatoSensibile());						
						bti.setInfoAggiuntiveBeneficiario(iabti);
						
						beneficiari.add(bti);
					}
					/* simonebrunox 16/06/2017: esposizione beneficiari dell'impegno */
					
					st.setRispostaDisponibilitaImpegno(rdpit);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);
					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogazioneObiettiviGestionali()!=null)
			{
				List iogl = db.interrogaObiettiviGestionali(sicRequest.getRichiesta().getInterrogazioneObiettiviGestionali().getAnno(), sicRequest.getRichiesta().getInterrogazioneObiettiviGestionali().getCodiceCapitolo(), sicRequest.getRichiesta().getInterrogazioneObiettiviGestionali().getUfficio());
				ListIterator li = iogl.listIterator();
				if (li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogazioneObiettiviGestionaliTypes riogt = objFactory1.createRispostaInterrogazioneObiettiviGestionaliTypes();
					List ogps = riogt.getObiettivoGestionale();
					COGType cog = null;
					while (li.hasNext()) 
					{
						InterrogaObiettivoGestionaleResult iogr = (InterrogaObiettivoGestionaleResult)li.next();    
						//						it.latraccia.entity.sic.risposta.RispostaInterrogazioneObiettiviGestionaliTypes og = objFactory1.createRispostaInterrogazioneObiettiviGestionaliTypes();

						cog = new COGTypeImpl();

						cog.setDescrizione(iogr.getDescrizione());
						cog.setCodice(iogr.getCOG());

						//						og.setASP(iogr.getASP());
						//						og..setDescrizione(iogr.getDescrizione());
						//						og.setDirettrice(iogr.getDirettrice());
						//						og.setOG1(iogr.getOG1());
						//						og.setOG2(iogr.getOG2());
						//						og.setOG3(iogr.getOG3());
						//						og.setRisultato(iogr.getRisultato());

						ogps.add(cog);
					}
					st.setRispostaInterrogazioneObiettiviGestionali(riogt);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogazioneTipologiaReddito()!=null)
			{
				List itrl = db.interrogaTipologiaReddito();
				ListIterator li = itrl.listIterator();
				if (li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogaTipologiaRedditoTypes ritrt = objFactory1.createRispostaInterrogaTipologiaRedditoTypes();
					List tip = ritrt.getTipologia();
					while (li.hasNext()) 
					{
						InterrogaTipologiaResult itr = (InterrogaTipologiaResult)li.next();    
						TipologiaTypeImpl tr = new TipologiaTypeImpl();
						tr.setCodice(itr.getCodice());
						tr.setDescrizione(itr.getDescrizione());
						tip.add(tr);
					}
					st.setRispostaInterrogaTipologiaReddito(ritrt);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogaCodiceSiope()!=null)
			{
				List icsl = db.interrogaCodiceSiope(sicRequest.getRichiesta().getInterrogaCodiceSiope().getAnnoBilancio(), sicRequest.getRichiesta().getInterrogaCodiceSiope().getCodiceCapitolo());
				ListIterator li = icsl.listIterator();
				if (li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogaCodiceSiopeTypes ricst = objFactory1.createRispostaInterrogaCodiceSiopeTypes();
					List siope = ricst.getSiope();
					while (li.hasNext()) 
					{
						InterrogaCodiceSiopeResult icsr = (InterrogaCodiceSiopeResult)li.next();    
						SiopeTypeImpl sti = new SiopeTypeImpl();
						sti.setCodice(icsr.getCodice());
						sti.setDescrizione(icsr.getDescrizione());
						siope.add(sti);
					}
					st.setRispostaInterrogaCodiceSiope(ricst);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogaCapitoloEntrate()!=null)
			{
				List icsl = db.interrogaCapitoloEntrate(sicRequest.getRichiesta().getInterrogaCapitoloEntrate().getAnnoBilancio());
				ListIterator li = icsl.listIterator();
				if (li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogaCapitoloEntrataTypes ricet = objFactory1.createRispostaInterrogaCapitoloEntrataTypes();
					List capitoli = ricet.getCapitolo();
					while (li.hasNext()) 
					{
						InterrogaCapitoloEntrateResult icer = (InterrogaCapitoloEntrateResult)li.next();    
						CapitoloTypeImpl cti = new CapitoloTypeImpl();
						cti.setAnnoBilancio(icer.getAnnoBilancio());
						cti.setCodiceCapitolo(icer.getCodiceCapitolo());
						cti.setDescrizioneCapitolo(icer.getDescrizioneCapitolo());
						capitoli.add(cti);
					}
					st.setRispostaInterrogaCapitoloEntrata(ricet);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogaReversaliCollegabili()!=null)
			{
				List ircl = db.interrogaReversaliCollegabili(sicRequest.getRichiesta().getInterrogaReversaliCollegabili().getAnnoBilancio());
				ListIterator li = ircl.listIterator();
				if (li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogaReversaliCollegabiliTypes rirct = objFactory1.createRispostaInterrogaReversaliCollegabiliTypes();
					List reversali = rirct.getReversale();
					while (li.hasNext()) 
					{
						InterrogaReversaliCollegabiliResult ircr = (InterrogaReversaliCollegabiliResult)li.next();    
						ReversaleTypeImpl rcti = new ReversaleTypeImpl();
						rcti.setNumero(ircr.getNumero());
						rcti.setImporto(ircr.getImporto());
						reversali.add(rcti);
					}
					st.setRispostaInterrogaReversaliCollegabili(rirct);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");
				}
			}


			if (sicRequest.getRichiesta().getInterrogaBeneficiariLiq()!=null)
			{
				List ibll = db.interrogaBeneficiariLiq(sicRequest.getRichiesta().getInterrogaBeneficiariLiq().getNumeroLiquidazione());
				ListIterator li = ibll.listIterator();
				if (li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogaBeneficiariLiqTypes riblt = objFactory1.createRispostaInterrogaBeneficiariLiqTypes();
					List beneficiari = riblt.getBeneficiario();
					while (li.hasNext()) 
					{
						InterrogaBeneficiariLiqResult iblr = (InterrogaBeneficiariLiqResult)li.next();    
						BeneficiarioTypeImpl bti = new BeneficiarioTypeImpl();
						bti.setIdBeneficiario(iblr.getIdBeneficiario());
						bti.setIdSede(iblr.getIdSede());
						bti.setImportoOriginario(iblr.getImportoOriginario());
						bti.setImportoResiduo(iblr.getImportoResiduo());
						beneficiari.add(bti);
					}
					st.setRispostaInterrogaBeneficiariLiq(riblt);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");
				}
			}

			if (sicRequest.getRichiesta().getInterrogaMandatiBeneficiariAtto()!=null){
				String tipoAtto=sicRequest.getRichiesta().getInterrogaMandatiBeneficiariAtto().getTipoAtto();
				String numeroAtto=sicRequest.getRichiesta().getInterrogaMandatiBeneficiariAtto().getNumeroAtto();
				Calendar dataAtto= sicRequest.getRichiesta().getInterrogaMandatiBeneficiariAtto().getDataAtto();
				String ufficio=sicRequest.getRichiesta().getInterrogaMandatiBeneficiariAtto().getUfficio();
				String numeroLiquidazione=Long.toString(sicRequest.getRichiesta().getInterrogaMandatiBeneficiariAtto().getNumeroLiquidazione());
				RispostaInterrogaMandatiBeneficiariAttoTypes rimbat= db.interrogaMandatiBeneficiariAtto(tipoAtto,numeroAtto,dataAtto,ufficio, numeroLiquidazione);

				//se non ci sono mandati che soddisfano i criteri di ricerca
				if (rimbat.getMandato().isEmpty())
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);

					st.setRispostaInterrogaMandatiBeneficiariAtto(rimbat);

					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");


				}

			}

			if (sicRequest.getRichiesta().getInterrogazioneMandatiTrasparenza()!=null){
				String anno=sicRequest.getRichiesta().getInterrogazioneMandatiTrasparenza().getAnno();

				RispostaInterrogazioneMandatiTrasparenzaTypes rimtt= db.interrogaMandatiTrasparenza(anno);

				//se non ci sono mandati che soddisfano i criteri di ricerca
				if (rimtt.getMandato().isEmpty())
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);

					st.setRispostaInterrogazioneMandatiTrasparenza(rimtt);

					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");


				}

			}

			if (sicRequest.getRichiesta().getInterrogazioneContratti()!=null){

				String numeroContratto=sicRequest.getRichiesta().getInterrogazioneContratti().getNumeroContratto();
				String oggettoContratto=sicRequest.getRichiesta().getInterrogazioneContratti().getOggettoContratto();
				
				RispostaInterrogazioneContrattiTypes rict= db.interrogaContratti(numeroContratto,oggettoContratto);

				//se non ci sono contratti 
				if (rict.getContratto().isEmpty())
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);

					st.setRispostaInterrogazioneContratti(rict);

					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");


				}

			}
			
			if (sicRequest.getRichiesta().getInterrogazioneListaContratti()!=null){

				it.latraccia.entity.sic.richiesta.InterrogazioneListaContrattiTypes listaChiavi= sicRequest.getRichiesta().getInterrogazioneListaContratti();
				
				RispostaInterrogazioneContrattiTypes rict= db.interrogaListaContratti(listaChiavi);

				//se non ci sono contratti 
				if (rict.getContratto().isEmpty())
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);

					st.setRispostaInterrogazioneContratti(rict);

					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");


				}

			}


			//modificato da Angelo
			if (sicRequest.getRichiesta().getInterrogazionePCF()!=null)
			{
				List ipcfl = db.interrogazionePCF(sicRequest.getRichiesta().getInterrogazionePCF().getAnno(), sicRequest.getRichiesta().getInterrogazionePCF().getCodiceCapitolo());
				ListIterator li = ipcfl.listIterator();
				if (li.hasNext()==false)
				{
					res = esitoNegativo(BigInteger.valueOf(1),"Nessun risultato restituito","SIC","Regione Basilicata");
				}
				else
				{
					JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
					it.latraccia.entity.sic.risposta.ObjectFactory objFactory1 = new it.latraccia.entity.sic.risposta.ObjectFactory();
					MessaggioRisposta mr = objFactory1.createMessaggioRisposta();
					it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory1.createIntestazioneTypes();
					it.latraccia.entity.sic.risposta.SuccessoTypes st = objFactory1.createSuccessoTypes();

					iti.setApplicazione("SIC");
					iti.setInfoMittDest("Regione Basilicata");
					mr.setIntestazione(iti);
					it.latraccia.entity.sic.risposta.RispostaInterrogazionePCFTypes ripcft = objFactory1.createRispostaInterrogazionePCFTypes();
					List pcf = ripcft.getPianoDeiContiFina();
					while (li.hasNext()) 
					{
						InterrogazionePCFResult ipcfr = (InterrogazionePCFResult)li.next();    
						PCFTypeImpl pcfti = new PCFTypeImpl();
						pcfti.setCodice(ipcfr.getCodice());
						pcfti.setDescrizione(ipcfr.getDescrizione());
						pcf.add(pcfti);
					}
					st.setRispostaInterrogazionePCF(ripcft);
					mr.setSuccesso(st);

					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );

					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					marshaller.marshal(mr, baos);

					res = baos.toString("UTF-8");
				}
			}


		} 
		catch (JAXBException e) 
		{
			e.printStackTrace();
			return esitoNegativo(new BigInteger("1"),"XML non valido","SIC","Regione Basilicata");
		}
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
			return esitoNegativo(new BigInteger("1"),"UnsupportedEncodingException: "+e.getMessage(),"SIC","Regione Basilicata");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
			return esitoNegativo(new BigInteger("1"),"SQLException: "+e.getMessage(),"SIC","Regione Basilicata");
		}
		finally
		{
			db.closeDB();
		}
		return res;
	}

	/**
	 * Metodo privato per la preparazione di esiti negativi
	 *
	 * @return String - risposta xml
	 * 
	 */
	private String esitoNegativo(BigInteger codiceEsito, String descrizioneEsito, String applicazione, String infomittdest) 
	{
		String ack="";
		try 
		{
			JAXBContext jaxbContext=JAXBContext.newInstance("it.latraccia.entity.sic.risposta");
			it.latraccia.entity.sic.risposta.ObjectFactory objFactory = new it.latraccia.entity.sic.risposta.ObjectFactory();

			MessaggioRisposta mr = objFactory.createMessaggioRisposta();
			it.latraccia.entity.sic.risposta.IntestazioneTypes iti = objFactory.createIntestazioneTypes();
			it.latraccia.entity.sic.risposta.EccezioneTypes et = objFactory.createEccezioneTypes();

			iti.setApplicazione(applicazione);
			iti.setInfoMittDest(infomittdest);
			mr.setIntestazione(iti);
			et.setCodice(codiceEsito);
			et.setDescrizione(descrizioneEsito);
			et.setException(descrizioneEsito);
			mr.setEccezione(et);

			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty( Marshaller.JAXB_ENCODING, "UTF-8" );
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			marshaller.marshal(mr, baos);

			ack = baos.toString("UTF-8");
		} 
		catch (JAXBException e) 
		{
			e.printStackTrace();
			ack = "<?xml version=\"1.0\"?> <Messaggio_Risposta>  <Intestazione> <InfoMittDest>Regione Basilicata</InfoMittDest> <Applicazione>SIC</Applicazione> </Intestazione> <Eccezione> <Codice>1</Codice>  <Descrizione>JAXBException</Descrizione> <Exception>"+e.getMessage()+"</Exception> </Eccezione> </Messaggio_Risposta>";
			return ack;
		}
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
			ack = "<?xml version=\"1.0\"?> <Messaggio_Risposta>  <Intestazione> <InfoMittDest>Regione Basilicata</InfoMittDest> <Applicazione>SIC</Applicazione> </Intestazione> <Eccezione> <Codice>1</Codice>  <Descrizione>UnsupportedEncodingException</Descrizione> <Exception>"+e.getMessage()+"</Exception> </Eccezione> </Messaggio_Risposta>";
			return ack;
		}

		return ack;
	}

}