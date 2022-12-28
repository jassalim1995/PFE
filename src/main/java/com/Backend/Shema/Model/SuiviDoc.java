package com.Backend.Shema.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "suividoc")
public class SuiviDoc {
	@Id
	private String id;
	private String suivi;
	private String coutlabel;
	private String coutok;
	private List<String>coutinfo=new ArrayList<>();
	private String integ1label;
	private String integok1;
	private List<String>integ1info=new ArrayList<>();
	private String integ2label;
	private String inte2ok;
	private List<String>integ2info=new ArrayList<>();
	private String controlelabel;
	private String controleok;
	private List<String>controleinfo=new ArrayList<>();
	private String veriflabel;
	private String verifok;
	private List<String>verifinfo=new ArrayList<>();
	private String validlabel;
	private String validok;
	private List<String>validinfo=new ArrayList<>();
	private String contenulabel;
	private String contenuok;
	private List<String>contenuinfo=new ArrayList<>();
	private String commlabel;
	private String commok;
	private List<String>comminfo=new ArrayList<>();
	private String delaislabel;
	private String delaisok;
	private List<String>delaisinfo=new ArrayList<>();
	private String aprolabel;
	private String aprook;
	private List<String>aproinfo=new ArrayList<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCoutlabel() {
		return coutlabel;
	}
	public void setCoutlabel(String coutlabel) {
		this.coutlabel = coutlabel;
	}
	public String getCoutok() {
		return coutok;
	}
	public void setCoutok(String coutok) {
		this.coutok = coutok;
	}
	public List<String> getCoutinfo() {
		return coutinfo;
	}
	public void setCoutinfo(List<String> coutinfo) {
		this.coutinfo = coutinfo;
	}
	public String getInteg1label() {
		return integ1label;
	}
	public void setInteg1label(String integ1label) {
		this.integ1label = integ1label;
	}
	public String getIntegok1() {
		return integok1;
	}
	public void setIntegok1(String integok1) {
		this.integok1 = integok1;
	}
	public List<String> getInteg1info() {
		return integ1info;
	}
	public void setInteg1info(List<String> integ1info) {
		this.integ1info = integ1info;
	}
	public String getInteg2label() {
		return integ2label;
	}
	public void setInteg2label(String integ2label) {
		this.integ2label = integ2label;
	}
	public String getInte2ok() {
		return inte2ok;
	}
	public void setInte2ok(String inte2ok) {
		this.inte2ok = inte2ok;
	}
	public List<String> getInteg2info() {
		return integ2info;
	}
	public void setInteg2info(List<String> integ2info) {
		this.integ2info = integ2info;
	}
	public String getControlelabel() {
		return controlelabel;
	}
	public void setControlelabel(String controlelabel) {
		this.controlelabel = controlelabel;
	}
	public String getControleok() {
		return controleok;
	}
	public void setControleok(String controleok) {
		this.controleok = controleok;
	}
	public List<String> getControleinfo() {
		return controleinfo;
	}
	public void setControleinfo(List<String> controleinfo) {
		this.controleinfo = controleinfo;
	}
	public String getVeriflabel() {
		return veriflabel;
	}
	public void setVeriflabel(String veriflabel) {
		this.veriflabel = veriflabel;
	}
	public String getVerifok() {
		return verifok;
	}
	public void setVerifok(String verifok) {
		this.verifok = verifok;
	}
	public List<String> getVerifinfo() {
		return verifinfo;
	}
	public void setVerifinfo(List<String> verifinfo) {
		this.verifinfo = verifinfo;
	}
	public String getValidlabel() {
		return validlabel;
	}
	public void setValidlabel(String validlabel) {
		this.validlabel = validlabel;
	}
	public String getValidok() {
		return validok;
	}
	public void setValidok(String validok) {
		this.validok = validok;
	}
	public List<String> getValidinfo() {
		return validinfo;
	}
	public void setValidinfo(List<String> validinfo) {
		this.validinfo = validinfo;
	}
	public String getContenulabel() {
		return contenulabel;
	}
	public void setContenulabel(String contenulabel) {
		this.contenulabel = contenulabel;
	}
	public String getContenuok() {
		return contenuok;
	}
	public void setContenuok(String contenuok) {
		this.contenuok = contenuok;
	}
	public List<String> getContenuinfo() {
		return contenuinfo;
	}
	public void setContenuinfo(List<String> contenuinfo) {
		this.contenuinfo = contenuinfo;
	}
	public String getCommlabel() {
		return commlabel;
	}
	public void setCommlabel(String commlabel) {
		this.commlabel = commlabel;
	}
	public String getCommok() {
		return commok;
	}
	public void setCommok(String commok) {
		this.commok = commok;
	}
	public List<String> getComminfo() {
		return comminfo;
	}
	public void setComminfo(List<String> comminfo) {
		this.comminfo = comminfo;
	}
	public String getDelaislabel() {
		return delaislabel;
	}
	public void setDelaislabel(String delaislabel) {
		this.delaislabel = delaislabel;
	}
	public String getDelaisok() {
		return delaisok;
	}
	public void setDelaisok(String delaisok) {
		this.delaisok = delaisok;
	}
	public List<String> getDelaisinfo() {
		return delaisinfo;
	}
	public void setDelaisinfo(List<String> delaisinfo) {
		this.delaisinfo = delaisinfo;
	}
	public String getAprolabel() {
		return aprolabel;
	}
	public void setAprolabel(String aprolabel) {
		this.aprolabel = aprolabel;
	}
	public String getAprook() {
		return aprook;
	}
	public void setAprook(String aprook) {
		this.aprook = aprook;
	}
	public List<String> getAproinfo() {
		return aproinfo;
	}
	public void setAproinfo(List<String> aproinfo) {
		this.aproinfo = aproinfo;
	}
	public SuiviDoc(String id, String coutlabel, String coutok, List<String> coutinfo, String integ1label,
			String integok1, List<String> integ1info, String integ2label, String inte2ok, List<String> integ2info,
			String controlelabel, String controleok, List<String> controleinfo, String veriflabel, String verifok,
			List<String> verifinfo, String validlabel, String validok, List<String> validinfo, String contenulabel,
			String contenuok, List<String> contenuinfo, String commlabel, String commok, List<String> comminfo,
			String delaislabel, String delaisok, List<String> delaisinfo, String aprolabel, String aprook,
			List<String> aproinfo) {
		super();
		this.id = id;
		
		this.coutlabel = coutlabel;
		this.coutok = coutok;
		this.coutinfo = coutinfo;
		this.integ1label = integ1label;
		this.integok1 = integok1;
		this.integ1info = integ1info;
		this.integ2label = integ2label;
		this.inte2ok = inte2ok;
		this.integ2info = integ2info;
		this.controlelabel = controlelabel;
		this.controleok = controleok;
		this.controleinfo = controleinfo;
		this.veriflabel = veriflabel;
		this.verifok = verifok;
		this.verifinfo = verifinfo;
		this.validlabel = validlabel;
		this.validok = validok;
		this.validinfo = validinfo;
		this.contenulabel = contenulabel;
		this.contenuok = contenuok;
		this.contenuinfo = contenuinfo;
		this.commlabel = commlabel;
		this.commok = commok;
		this.comminfo = comminfo;
		this.delaislabel = delaislabel;
		this.delaisok = delaisok;
		this.delaisinfo = delaisinfo;
		this.aprolabel = aprolabel;
		this.aprook = aprook;
		this.aproinfo = aproinfo;
	}
	public SuiviDoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSuivi() {
		return suivi;
	}
	public void setSuivi(String suivi) {
		this.suivi = suivi;
	}
	
	
	
	
	

}
