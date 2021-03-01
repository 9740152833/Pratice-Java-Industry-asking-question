package com.pratice.one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "birthdate")
	private String birthdate;

	@Column(name = "accont_id ")
	private String accountid;

	public Owner() {

	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", accountid=" + accountid + "]";
	}

	public Owner(String name, String birthdate, String accountid) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.accountid = accountid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

}
