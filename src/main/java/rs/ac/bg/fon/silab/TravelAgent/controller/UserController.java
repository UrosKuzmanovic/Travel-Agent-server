package rs.ac.bg.fon.silab.TravelAgent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.bg.fon.silab.TravelAgent.entity.User;
import rs.ac.bg.fon.silab.TravelAgent.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAllUsers() {
		return this.userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") int userID) {
		return this.userService.getUserById(userID);
	}

	@CrossOrigin(origins = "http://localhost:8100")
	@PostMapping("/signin")
	public User signinUser(@RequestBody User user) {
		return this.userService.siginUser(user.getEmail(), user.getPassword());
	}

	@CrossOrigin(origins = "http://localhost:8100")
	@PostMapping("/signup")
	public User createUser(@RequestBody User user) {
		return this.userService.sigupUser(user);
	}

}
