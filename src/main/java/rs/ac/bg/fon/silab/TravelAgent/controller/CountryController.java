package rs.ac.bg.fon.silab.TravelAgent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.silab.TravelAgent.entity.Country;
import rs.ac.bg.fon.silab.TravelAgent.repository.CountryRepository;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;

	// get all users API
	@GetMapping
	public List<Country> getAllCountries() {
		return this.countryRepository.findAll();
	}

	// get user by id
	@GetMapping("/{id}")
	public Country getCountryById(@PathVariable("id") int countryID) throws Exception {
		return this.countryRepository.findById(countryID).orElseThrow(() -> new Exception("User not found"));
	}

}
