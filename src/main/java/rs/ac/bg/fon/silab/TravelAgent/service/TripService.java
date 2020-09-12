package rs.ac.bg.fon.silab.TravelAgent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.ac.bg.fon.silab.TravelAgent.entity.Trip;
import rs.ac.bg.fon.silab.TravelAgent.repository.TripRepository;

@Service
@Transactional
public class TripService {

	@Autowired
	private TripRepository tripRepository;

	public List<Trip> getAllTrips() {
		return tripRepository.findAll();
	}

	public Trip getTripById(int id) {
		return tripRepository.findById(id).get();
	}

	public List<Trip> getListedTrips() {
		return tripRepository.getListedTrips();
	}

	public List<Trip> getUsersFavoriteTrips(int userID) {
		return tripRepository.getUsersFavoritTrips(userID);
	}

	public Trip insertTrip(Trip trip) {
		return tripRepository.save(trip);
	}

}
