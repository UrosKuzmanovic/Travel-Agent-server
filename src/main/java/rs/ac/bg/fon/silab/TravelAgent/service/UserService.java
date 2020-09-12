package rs.ac.bg.fon.silab.TravelAgent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.ac.bg.fon.silab.TravelAgent.entity.User;
import rs.ac.bg.fon.silab.TravelAgent.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	public User siginUser(String email, String password) {
		return userRepository.loginUser(email, password);
	}

	public User sigupUser(User user) {
		return userRepository.save(user);
	}

}
