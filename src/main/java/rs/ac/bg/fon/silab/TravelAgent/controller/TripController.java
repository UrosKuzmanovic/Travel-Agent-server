package rs.ac.bg.fon.silab.TravelAgent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.silab.TravelAgent.entity.Trip;
import rs.ac.bg.fon.silab.TravelAgent.service.TripService;

@RestController
@RequestMapping("/api/trips")
public class TripController {

	@Autowired
	private TripService tripService;

	@GetMapping
	public List<Trip> getAllTrips() {
		return this.tripService.getAllTrips();
	}

	@GetMapping("/{id}")
	public Trip getTripById(@PathVariable("id") int tripID) {
		return this.tripService.getTripById(tripID);
	}

	@GetMapping("/listedtrips")
	public List<Trip> getListedTrips() {
		return this.tripService.getListedTrips();
	}

	@GetMapping("/favoritetrips")
	public List<Trip> getUserFavoriteTrips(@RequestBody int userID) {
		return this.tripService.getUsersFavoriteTrips(userID);
	}

	@CrossOrigin(origins = "http://localhost:8100")
	@PostMapping
	public Trip insertTrip(@RequestBody Trip trip) {
		return this.tripService.insertTrip(trip);
	}

	@CrossOrigin(origins = "http://localhost:8100")
	@PutMapping
	public Trip updateTrip(@RequestBody Trip trip) {
		return this.tripService.insertTrip(trip);
	}

}
