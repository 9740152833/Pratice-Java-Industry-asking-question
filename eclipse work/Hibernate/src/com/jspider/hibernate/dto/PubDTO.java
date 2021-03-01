package com.jspider.hibernate.dto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "pub_table")
public class PubDTO implements Serializable {
	@Id
	@Column(name = "pub_id")
	private int PubId;
	@Column(name = "pub_name")
	private String PubName;
	@Column(name = "drink_type")
	private String DrinkType;
	@Column(name = "entery_fee")
	private double EnteryFee;
	public int getPubId() {
		return PubId;
	}
	public void setPubId(int pubId) {
		PubId = pubId;
	}
	public String getPubName() {
		return PubName;
	}
	public void setPubName(String pubName) {
		PubName = pubName;
	}
	public String getDrinkType() {
		return DrinkType;
	}
	public void setDrinkType(String drinkType) {
		DrinkType = drinkType;
	}
	public double getEnteryFee() {
		return EnteryFee;
	}
	public void setEnteryFee(double enteryFee) {
		EnteryFee = enteryFee;
	}
	
	
	


}
