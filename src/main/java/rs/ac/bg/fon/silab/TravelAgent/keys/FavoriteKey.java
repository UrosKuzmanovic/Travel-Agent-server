package rs.ac.bg.fon.silab.TravelAgent.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FavoriteKey implements Serializable {

	@Column(name = "userid")
	private int userID;

	@Column(name = "tripid")
	private int tripID;

	public FavoriteKey() {
		super();
	}

	public FavoriteKey(int userID, int tripID) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tripID;
		result = prime * result + userID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FavoriteKey other = (FavoriteKey) obj;
		if (tripID != other.tripID)
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}

}
