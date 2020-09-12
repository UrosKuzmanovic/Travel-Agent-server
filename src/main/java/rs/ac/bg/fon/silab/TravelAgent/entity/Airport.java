package rs.ac.bg.fon.silab.TravelAgent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "airportid")
	private int airportID;

	@Column(name = "airportname")
	private String airportName;

	public Airport() {
		super();
	}

	public Airport(int airportID, String airportName) {
		super();
		this.airportID = airportID;
		this.airportName = airportName;
	}

	public int getAirportID() {
		return airportID;
	}

	public void setAirportID(int airportID) {
		this.airportID = airportID;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

}
