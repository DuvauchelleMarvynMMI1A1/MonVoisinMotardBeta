package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Moto implements Serializable{
	
	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	public String model;
	public Integer DateConstruction;
	public String picture;
	
	//Methodes
//	public String model = "^[a-zA-Z0-9]+$";
//	public LocalDate DateConstruction = "^ [0-9 && ^\W]+$";
//	public String picture = " ([.]+\.(jpg|jpeg|png))$";
//	Pattern p = Pattern.compile(model);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public Integer getDateConstruction() {
		return DateConstruction;
	}

	public void setDateConstruction(Integer DateConstruction) {
		this.DateConstruction = DateConstruction;
	}
	
	public String getPicture() {
		return picture;
	}

	public void setNom(String picture) {
		this.picture = picture;
	}

}
