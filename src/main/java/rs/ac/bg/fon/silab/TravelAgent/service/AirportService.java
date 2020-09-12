package rs.ac.bg.fon.silab.TravelAgent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.ac.bg.fon.silab.TravelAgent.entity.Airport;
import rs.ac.bg.fon.silab.TravelAgent.repository.AirportRepository;

@Service
@Transactional
public class AirportService {

	@Autowired
	private AirportRepository airportRepository;

	public List<Airport> getAllAirports() {
		return airportRepository.findAll();
	}

}
