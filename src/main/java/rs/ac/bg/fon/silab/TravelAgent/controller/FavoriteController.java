package rs.ac.bg.fon.silab.TravelAgent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.silab.TravelAgent.entity.Favorite;
import rs.ac.bg.fon.silab.TravelAgent.entity.Trip;
import rs.ac.bg.fon.silab.TravelAgent.entity.User;
import rs.ac.bg.fon.silab.TravelAgent.keys.FavoriteKey;
import rs.ac.bg.fon.silab.TravelAgent.service.FavoriteService;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;

	@GetMapping
	public List<Favorite> getAllFavorites() {
		return this.favoriteService.getAllFavorites();
	}

	@GetMapping("/user/{userid}")
	public List<Favorite> getFavoritesByUserId(@PathVariable("userid") int userid) {
		return favoriteService.getFavoritesByUserId(userid);
	}

	@GetMapping("/trip/{tripid}")
	public List<Favorite> getFavoritesByTripId(@PathVariable("tripid") int tripid) {
		return favoriteService.getFavoritesByTripId(tripid);
	}

	@GetMapping("/{userid}/{tripid}")
	public Favorite getFavoritesByIds(@PathVariable("userid") int userid, @PathVariable("tripid") int tripid) {
		return favoriteService.getFavoriteByIds(userid, tripid);
	}

	@CrossOrigin(origins = "http://localhost:8100")
	@PostMapping("/{userid}/{tripid}")
	public Favorite addFavorite(@PathVariable("userid") int userid, @PathVariable("tripid") int tripid) {
		Favorite favorite = new Favorite(new FavoriteKey(userid, tripid),
				new User(userid, null, null, null, null, null, null, null, null), new Trip(tripid, null, null, null,
						null, null, 0, null, null, null, null, null, null, null, null, null, null, null));
		return favoriteService.addFavorite(favorite);
	}

	@CrossOrigin(origins = "http://localhost:8100")
	@DeleteMapping("/{userid}/{tripid}")
	public int removeFavorite(@PathVariable("userid") int userid, @PathVariable("tripid") int tripid) {
		return favoriteService.removeFavorite(userid, tripid);
	}

}
