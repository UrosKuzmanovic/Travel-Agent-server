package rs.ac.bg.fon.silab.TravelAgent.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import rs.ac.bg.fon.silab.TravelAgent.keys.FavoriteKey;

@Entity
@Table(name = "favorite")
public class Favorite {

	@EmbeddedId
	FavoriteKey key;

	@ManyToOne
	@MapsId("userID")
	@JoinColumn(name = "userid")
	private User user;

	@ManyToOne
	@MapsId("tripID")
	@JoinColumn(name = "tripid")
	private Trip trip;

	public Favorite() {
		super();
	}

	public Favorite(FavoriteKey key, User user, Trip trip) {
		super();
		this.key = key;
		this.user = user;
		this.trip = trip;
	}

	public FavoriteKey getKey() {
		return key;
	}

	public void setKey(FavoriteKey key) {
		this.key = key;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

}
