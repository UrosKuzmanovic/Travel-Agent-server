package rs.ac.bg.fon.silab.TravelAgent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.silab.TravelAgent.entity.Booking;
import rs.ac.bg.fon.silab.TravelAgent.repository.BookingRepository;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

	@Autowired
	private BookingRepository bookingRepository;

	// get all users API
	@GetMapping
	public List<Booking> getAllBookings() {
		return this.bookingRepository.findAll();
	}

	// get user by id
	@GetMapping("/{id}")
	public Booking getBookingById(@PathVariable("id") int bookingID) throws Exception {
		return this.bookingRepository.findById(bookingID).orElseThrow(() -> new Exception("User not found"));
	}

}
