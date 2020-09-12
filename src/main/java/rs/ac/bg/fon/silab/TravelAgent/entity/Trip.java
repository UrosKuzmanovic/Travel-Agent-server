package rs.ac.bg.fon.silab.TravelAgent.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trip")
public class Trip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tripid")
	private int tripID;

	@Column(name = "city")
	private String city;

	@ManyToOne
	@JoinColumn(name = "countryid")
	private Country country;

	@Column(name = "traveldate")
	private Date travelDate;

	@Column(name = "returndate")
	private Date returnDate;

	@Column(name = "postdate")
	private Date postDate;

	@Column(name = "price")
	private int price;

	@Column(name = "hotel")
	private String hotel;

	@Column(name = "hotellatitude")
	private Integer hotelLatitude;

	@Column(name = "hotellongitude")
	private Integer hotelLongitude;

	@ManyToOne
	@JoinColumn(name = "airportid")
	private Airport airport;

	@Column(name = "baggage")
	private String baggage;

	@Column(name = "quote")
	private String quote;

	@Column(name = "author")
	private String author;

	@Column(name = "meal")
	private String meal;

	@Column(name = "description")
	private String description;

	@Column(name = "imagesrc")
	private String imageSrc;

	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;

	public Trip() {
		super();
	}

	public Trip(int tripID, String city, Country country, Date travelDate, Date returnDate, Date postDate, int price,
			String hotel, Integer hotelLatitude, Integer hotelLongitude, Airport airport, String baggage, String quote,
			String author, String meal, String description, String imageSrc, User user) {
		super();
		this.tripID = tripID;
		this.city = city;
		this.country = country;
		this.travelDate = travelDate;
		this.returnDate = returnDate;
		this.postDate = postDate;
		this.price = price;
		this.hotel = hotel;
		this.hotelLatitude = hotelLatitude;
		this.hotelLongitude = hotelLongitude;
		this.airport = airport;
		this.baggage = baggage;
		this.quote = quote;
		this.author = author;
		this.meal = meal;
		this.description = description;
		this.imageSrc = imageSrc;
		this.user = user;
	}

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public Integer getHotelLatitude() {
		return hotelLatitude;
	}

	public void setHotelLatitude(Integer hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	public Integer getHotelLongitude() {
		return hotelLongitude;
	}

	public void setHotelLongitude(Integer hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public String getBaggage() {
		return baggage;
	}

	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
