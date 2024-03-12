package com.pf.OutPut;

import java.sql.Timestamp;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OutPut {

	private int code;// codigo de respuesta
	private String detail;// detalle de respuesta tecnica
	private String messenger;//detalle de respuesta hacia cliente.
	private Timestamp date;//fecha de la ejecucion.
	private Object json;
	private JSONObject jsonObject;
	
	public JSONObject getJsonObject() {
		return jsonObject;
	}
	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	public Object getJson() {
		return json;
	}
	@JsonSetter("json")
	public void setJson(Object json) {
		this.json = json;
	}
	public int getCode() {
		return code;
	}
	@JsonSetter("code")
	public void setCode(int code) {
		this.code = code;
	}
	public String getDetail() {
		return detail;
	}
	@JsonSetter("detail")
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getMessenger() {
		return messenger;
	}
	@JsonSetter("messenger")
	public void setMessenger(String messenger) {
		this.messenger = messenger;
	}
	public Timestamp getDate() {
		return date;
	}
	@JsonSetter("date")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="America/Santiago")
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	
	
}
