package rs.ac.bg.fon.silab.TravelAgent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.silab.TravelAgent.entity.Continent;
import rs.ac.bg.fon.silab.TravelAgent.repository.ContinentRepository;

@RestController
@RequestMapping("/api/continents")
public class ContinentController {

	@Autowired
	private ContinentRepository continentRepository;

	// get all users API
	@GetMapping
	public List<Continent> getAllContinents() {
		return this.continentRepository.findAll();
	}

	// get user by id
	@GetMapping("/{id}")
	public Continent getContinentById(@PathVariable("id") int continentID) throws Exception {
		return this.continentRepository.findById(continentID).orElseThrow(() -> new Exception("User not found"));
	}

}
