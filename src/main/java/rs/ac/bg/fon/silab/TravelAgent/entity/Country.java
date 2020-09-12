package rs.ac.bg.fon.silab.TravelAgent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "countryid")
	private int countryID;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "continentid")
	private Continent continent;

	@Column(name = "flagsrc")
	private String flagSrc;

	public Country() {
		super();
	}

	public Country(int countryID, String name, Continent continent, String flagSrc) {
		super();
		this.countryID = countryID;
		this.name = name;
		this.continent = continent;
		this.flagSrc = flagSrc;
	}

	public int getCountryID() {
		return countryID;
	}

	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public String getFlagSrc() {
		return flagSrc;
	}

	public void setFlagSrc(String flagSrc) {
		this.flagSrc = flagSrc;
	}

}
