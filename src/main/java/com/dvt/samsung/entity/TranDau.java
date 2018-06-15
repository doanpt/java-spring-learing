package com.dvt.samsung.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lichthidau")
public class TranDau {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "doi1")
	private String doi1;
	@Column(name = "quocky1")
	private String quocky1;
	@Column(name = "doi2")
	private String doi2;
	@Column(name = "quocky2")
	private String quocky2;
	@Column(name = "ngay")
	private String ngay;
	@Column(name = "gio")
	private String gio;
	@Column(name = "vong")
	private String vong;
	@Column(name = "kenh")
	private String kenh;

	public TranDau() {
		super();
	}

	public TranDau(int id, String doi1, String quocky1, String doi2, String quocky2, String ngay, String gio,
			String vong, String kenh) {
		super();
		this.id = id;
		this.doi1 = doi1;
		this.quocky1 = quocky1;
		this.doi2 = doi2;
		this.quocky2 = quocky2;
		this.ngay = ngay;
		this.gio = gio;
		this.vong = vong;
		this.kenh = kenh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoi1() {
		return doi1;
	}

	public void setDoi1(String doi1) {
		this.doi1 = doi1;
	}

	public String getQuocky1() {
		return quocky1;
	}

	public void setQuocky1(String quocky1) {
		this.quocky1 = quocky1;
	}

	public String getDoi2() {
		return doi2;
	}

	public void setDoi2(String doi2) {
		this.doi2 = doi2;
	}

	public String getQuocky2() {
		return quocky2;
	}

	public void setQuocky2(String quocky2) {
		this.quocky2 = quocky2;
	}

	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public String getGio() {
		return gio;
	}

	public void setGio(String gio) {
		this.gio = gio;
	}

	public String getVong() {
		return vong;
	}

	public void setVong(String vong) {
		this.vong = vong;
	}

	public String getKenh() {
		return kenh;
	}

	public void setKenh(String kenh) {
		this.kenh = kenh;
	}
	

}
