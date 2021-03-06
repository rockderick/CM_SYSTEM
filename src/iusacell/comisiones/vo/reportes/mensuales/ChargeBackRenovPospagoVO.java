package iusacell.comisiones.vo.reportes.mensuales;

import java.util.Map;

import iusacell.comisiones.vo.ValueObject;

public class ChargeBackRenovPospagoVO extends ValueObject{
	
	private String[] campos = {"NOMBRE_CANAL","BAJA_MES","ESN","REGION","DESC_LARGA_PLAN","CUENTA","CVE_CONTRATO",
			"NUM_TELEFONO","FECHA_VENTA","FECHA_BAJA","COMISION","MONTO_SERV","DIAS","POBLACION","DIVISION",
			"ESTADO","RAZON_MOV","ORIGEN_EQPO","MONTO_EQPO"};
	
	private int[] longitudes = {5000,5000,5000,5000,5000,5000,5000,
			5000,5000,5000,5000,5000,5000,5000,5000,
			5000,5000,5000,5000};
	
	private String NOMBRE_CANAL;
	private String BAJA_MES;
	private String ESN;
	private String REGION;
	private String DESC_LARGA_PLAN;
	private String CUENTA;
	private String CVE_CONTRATO;
	private String NUM_TELEFONO;
	private String FECHA_VENTA;
	private String FECHA_BAJA;
	private String COMISION;
	private String MONTO_SERV;
	private String DIAS;
	private String POBLACION;
	private String DIVISION;
	private String ESTADO;
	private String RAZON_MOV;
	private String ORIGEN_EQPO;
	private String MONTO_EQPO;
	
	public ChargeBackRenovPospagoVO() {}
	
	public ChargeBackRenovPospagoVO(Map<String, Object> dato) {
		this.NOMBRE_CANAL = String.valueOf(dato.get("NOMBRE_CANAL"));
		this.BAJA_MES = String.valueOf(dato.get("BAJA_MES"));
		this.ESN = String.valueOf(dato.get("ESN"));
		this.REGION = String.valueOf(dato.get("REGION"));
		this.DESC_LARGA_PLAN = String.valueOf(dato.get("DESC_LARGA_PLAN"));
		this.CUENTA = String.valueOf(dato.get("CUENTA"));
		this.CVE_CONTRATO = String.valueOf(dato.get("CVE_CONTRATO"));
		this.NUM_TELEFONO = String.valueOf(dato.get("NUM_TELEFONO"));
		this.FECHA_VENTA = String.valueOf(dato.get("FECHA_VENTA"));
		this.FECHA_BAJA = String.valueOf(dato.get("FECHA_BAJA"));
		this.COMISION = String.valueOf(dato.get("COMISION"));
		this.MONTO_SERV = String.valueOf(dato.get("MONTO_SERV"));
		this.DIAS = String.valueOf(dato.get("DIAS"));
		this.POBLACION = String.valueOf(dato.get("POBLACION"));
		this.DIVISION = String.valueOf(dato.get("DIVISION"));
		this.ESTADO = String.valueOf(dato.get("ESTADO"));
		this.RAZON_MOV = String.valueOf(dato.get("RAZON_MOV"));
		this.ORIGEN_EQPO = String.valueOf(dato.get("ORIGEN_EQPO"));
		this.MONTO_EQPO = String.valueOf(dato.get("MONTO_EQPO"));
	}
	
	public String[] getCampos() {
		return campos;
	}
	public void setCampos(String[] campos) {
		this.campos = campos;
	}
	public int[] getLongitudes() {
		return longitudes;
	}
	public void setLongitudes(int[] longitudes) {
		this.longitudes = longitudes;
	}

	public String getNOMBRE_CANAL() {
		return NOMBRE_CANAL;
	}

	public void setNOMBRE_CANAL(String nombre_canal) {
		NOMBRE_CANAL = nombre_canal;
	}

	public String getBAJA_MES() {
		return BAJA_MES;
	}

	public void setBAJA_MES(String baja_mes) {
		BAJA_MES = baja_mes;
	}

	public String getESN() {
		return ESN;
	}

	public void setESN(String esn) {
		ESN = esn;
	}

	public String getREGION() {
		return REGION;
	}

	public void setREGION(String region) {
		REGION = region;
	}

	public String getDESC_LARGA_PLAN() {
		return DESC_LARGA_PLAN;
	}

	public void setDESC_LARGA_PLAN(String desc_larga_plan) {
		DESC_LARGA_PLAN = desc_larga_plan;
	}

	public String getCUENTA() {
		return CUENTA;
	}

	public void setCUENTA(String cuenta) {
		CUENTA = cuenta;
	}

	public String getCVE_CONTRATO() {
		return CVE_CONTRATO;
	}

	public void setCVE_CONTRATO(String cve_contrato) {
		CVE_CONTRATO = cve_contrato;
	}

	public String getNUM_TELEFONO() {
		return NUM_TELEFONO;
	}

	public void setNUM_TELEFONO(String num_telefono) {
		NUM_TELEFONO = num_telefono;
	}

	public String getFECHA_VENTA() {
		return FECHA_VENTA;
	}

	public void setFECHA_VENTA(String fecha_venta) {
		FECHA_VENTA = fecha_venta;
	}

	public String getFECHA_BAJA() {
		return FECHA_BAJA;
	}

	public void setFECHA_BAJA(String fecha_baja) {
		FECHA_BAJA = fecha_baja;
	}

	public String getCOMISION() {
		return COMISION;
	}

	public void setCOMISION(String comision) {
		COMISION = comision;
	}

	public String getMONTO_SERV() {
		return MONTO_SERV;
	}

	public void setMONTO_SERV(String monto_serv) {
		MONTO_SERV = monto_serv;
	}

	public String getDIAS() {
		return DIAS;
	}

	public void setDIAS(String dias) {
		DIAS = dias;
	}

	public String getPOBLACION() {
		return POBLACION;
	}

	public void setPOBLACION(String poblacion) {
		POBLACION = poblacion;
	}

	public String getDIVISION() {
		return DIVISION;
	}

	public void setDIVISION(String division) {
		DIVISION = division;
	}

	public String getESTADO() {
		return ESTADO;
	}

	public void setESTADO(String estado) {
		ESTADO = estado;
	}

	public String getRAZON_MOV() {
		return RAZON_MOV;
	}

	public void setRAZON_MOV(String razon_mov) {
		RAZON_MOV = razon_mov;
	}

	public String getORIGEN_EQPO() {
		return ORIGEN_EQPO;
	}

	public void setORIGEN_EQPO(String origen_eqpo) {
		ORIGEN_EQPO = origen_eqpo;
	}

	public String getMONTO_EQPO() {
		return MONTO_EQPO;
	}

	public void setMONTO_EQPO(String monto_eqpo) {
		MONTO_EQPO = monto_eqpo;
	}
	
}
