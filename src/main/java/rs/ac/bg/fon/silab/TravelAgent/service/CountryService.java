package rs.ac.bg.fon.silab.TravelAgent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.ac.bg.fon.silab.TravelAgent.entity.Country;
import rs.ac.bg.fon.silab.TravelAgent.repository.CountryRepository;

@Service
@Transactional
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	public List<Country> findAllCountries() {
		return countryRepository.findAll();
	}

	public Country findCountryById(int id) {
		return countryRepository.findById(id).get();
	}

}
