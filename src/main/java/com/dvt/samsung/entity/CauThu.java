package com.dvt.samsung.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cauthu")
public class CauThu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "ten")
	private String ten;
	@Column(name = "doi")
	private String doi;
	@Column(name = "image")
	private String image;
	@Column(name = "social")
	private String social;
	
	public CauThu() {
		super();
	}
	public CauThu(int id, String ten, String doi, String image, String social) {
		super();
		this.id = id;
		this.ten = ten;
		this.doi = doi;
		this.image = image;
		this.social = social;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	
}
