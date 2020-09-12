package rs.ac.bg.fon.silab.TravelAgent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.silab.TravelAgent.entity.Airport;
import rs.ac.bg.fon.silab.TravelAgent.repository.AirportRepository;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

	@Autowired
	private AirportRepository airportRepository;

	// get all users API
	@GetMapping
	public List<Airport> getAllAirports() {
		return this.airportRepository.findAll();
	}

	// get user by id
	@GetMapping("/{id}")
	public Airport getAirportById(@PathVariable("id") int airportID) throws Exception {
		return this.airportRepository.findById(airportID).orElseThrow(() -> new Exception("User not found"));
	}

}
