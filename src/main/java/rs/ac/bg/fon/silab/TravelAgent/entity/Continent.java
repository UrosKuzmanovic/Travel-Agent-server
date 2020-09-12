package rs.ac.bg.fon.silab.TravelAgent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "continent")
public class Continent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "continentid")
	private int continentID;

	@Column(name = "name")
	private String name;

	public Continent() {
		super();
	}

	public Continent(int continentID, String name) {
		super();
		this.continentID = continentID;
		this.name = name;
	}

	public int getContinentID() {
		return continentID;
	}

	public void setContinentID(int continentID) {
		this.continentID = continentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
