package rs.ac.bg.fon.silab.TravelAgent.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookingKey implements Serializable {

	@Column(name = "bookingid")
	private int bookingID;

	@Column(name = "userid")
	private int userID;

	@Column(name = "tripid")
	private int tripID;

	public BookingKey() {
		super();
	}

	public BookingKey(int userID, int tripID) {
		super();
		this.userID = userID;
		this.tripID = tripID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}

}
