package rs.ac.bg.fon.silab.TravelAgent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.ac.bg.fon.silab.TravelAgent.entity.Favorite;
import rs.ac.bg.fon.silab.TravelAgent.repository.FavoriteRepository;

@Service
@Transactional
public class FavoriteService {

	@Autowired
	private FavoriteRepository favoriteRepository;

	public List<Favorite> getAllFavorites() {
		return favoriteRepository.findAll();
	}

	public List<Favorite> getFavoritesByUserId(int userID) {
		return favoriteRepository.findFavoritesByUser(userID);
	}

	public List<Favorite> getFavoritesByTripId(int tripID) {
		return favoriteRepository.findFavoritesByTrip(tripID);
	}

	public Favorite getFavoriteByIds(int userID, int tripID) {
		return favoriteRepository.findFavoritesByIds(userID, tripID);
	}

	public Favorite addFavorite(Favorite favorite) {
		return favoriteRepository.save(favorite);
	}

	public int removeFavorite(int userID, int tripID) {
		return favoriteRepository.deleteByIds(userID, tripID);
	}

}
