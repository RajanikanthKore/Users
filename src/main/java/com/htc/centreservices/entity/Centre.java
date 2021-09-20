package com.htc.centreservices.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Centre")
public class Centre {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long centreId;
	@Column
	private String centreAddress;
	@Column
	private Long  pincode;
	
	public Centre() {
		// TODO Auto-generated constructor stub
	}

	public Centre(Long centreId, String centreAddress, Long pincode) {
		super();
		this.centreId = centreId;
		this.centreAddress = centreAddress;
		this.pincode = pincode;
	}

	public Long getCentreId() {
		return centreId;
	}

	public void setCentreId(Long centreId) {
		this.centreId = centreId;
	}

	public String getCentreAddress() {
		return centreAddress;
	}

	public void setCentreAddress(String centreAddress) {
		this.centreAddress = centreAddress;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(centreId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centre other = (Centre) obj;
		return Objects.equals(centreId, other.centreId);
	}

	@Override
	public String toString() {
		return "Centre [centreId=" + centreId + ", centreAddress=" + centreAddress + ", pincode=" + pincode + "]";
	}

	public Centre get() {
		// TODO Auto-generated method stub
		return null;
	}

}