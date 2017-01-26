package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Garage implements Serializable {
	private static final long serialVersionUID = 1L;


	public Garage() {
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public String address;
	public String zipCode;
	public String city;
	public int acreage;
	public String nbBike;
	public String photo;
	
	/*@OneToMany
	@JoinColumn(name="id_user", referencedColumnName="id_user")
	public List<User> user;*/
	
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setIdZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getCity() {
		return city;
	}
	public void setIdCity(String city) {
		this.city = city;
	}
	
	public int getAcreage() {
		return acreage;
	}
	public void setIdAcreage(int acreage) {
		this.acreage = acreage;
	}
	
	public String getPhoto() {
		return photo;
	}
	public void setId(String photo) {
		this.photo = photo;
	}
	
	public Garage(int id, String address, String zipCode, String city, int acreage, String nbBike, String photo) {
		super();
		this.id = id;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.acreage = acreage;
		this.nbBike = nbBike;
		this.photo = photo;
	}
	
	
}
