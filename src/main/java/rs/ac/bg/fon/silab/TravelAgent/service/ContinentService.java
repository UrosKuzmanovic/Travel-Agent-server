package rs.ac.bg.fon.silab.TravelAgent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.ac.bg.fon.silab.TravelAgent.entity.Continent;
import rs.ac.bg.fon.silab.TravelAgent.repository.ContinentRepository;

@Service
@Transactional
public class ContinentService {

	@Autowired
	private ContinentRepository continentRepository;

	public List<Continent> findAllContinents() {
		return continentRepository.findAll();
	}

}
