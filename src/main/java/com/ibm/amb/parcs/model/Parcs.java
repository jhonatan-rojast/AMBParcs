package com.ibm.amb.parcs.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class Parcs implements Serializable {

	private String id;
	private String incidencia;
	private String municipi;
	private String parc;
	private String ambit;
	private String objecte;
	private String parametre;
	private String descripcio;
	@JsonProperty("data_alta")
	@Field(value="data_alta")
	private String dataAlta;
	private String estatamb;
	private String estat;
	private String origen;
	private String wkt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}

	public String getMunicipi() {
		return municipi;
	}

	public void setMunicipi(String municipi) {
		this.municipi = municipi;
	}

	public String getParc() {
		return parc;
	}

	public void setParc(String parc) {
		this.parc = parc;
	}

	public String getAmbit() {
		return ambit;
	}

	public void setAmbit(String ambit) {
		this.ambit = ambit;
	}

	public String getObjecte() {
		return objecte;
	}

	public void setObjecte(String objecte) {
		this.objecte = objecte;
	}

	public String getParametre() {
		return parametre;
	}

	public void setParametre(String parametre) {
		this.parametre = parametre;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public String getDataAlta() {
		return dataAlta;
	}

	public void setDataAlta(String dataAlta) {
		this.dataAlta = dataAlta;
	}

	public String getEstatamb() {
		return estatamb;
	}

	public void setEstatamb(String estatamb) {
		this.estatamb = estatamb;
	}

	public String getEstat() {
		return estat;
	}

	public void setEstat(String estat) {
		this.estat = estat;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getWkt() {
		return wkt;
	}

	public void setWkt(String wkt) {
		this.wkt = wkt;
	}
}
