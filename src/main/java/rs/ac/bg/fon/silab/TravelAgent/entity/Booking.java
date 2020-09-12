package rs.ac.bg.fon.silab.TravelAgent.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import rs.ac.bg.fon.silab.TravelAgent.keys.BookingKey;

@Entity
@Table(name = "booking")
public class Booking {

	@EmbeddedId
	BookingKey id;

	@ManyToOne
	@MapsId("userID")
	@JoinColumn(name = "userid")
	private User user;

	@ManyToOne
	@MapsId("tripID")
	@JoinColumn(name = "tripid")
	private Trip trip;

	@Column(name = "date")
	private Date date;

	public Booking() {
		super();
	}

	public Booking(BookingKey id, User user, Trip trip, Date date) {
		super();
		this.id = id;
		this.user = user;
		this.trip = trip;
		this.date = date;
	}

	public BookingKey getId() {
		return id;
	}

	public void setId(BookingKey id) {
		this.id = id;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
