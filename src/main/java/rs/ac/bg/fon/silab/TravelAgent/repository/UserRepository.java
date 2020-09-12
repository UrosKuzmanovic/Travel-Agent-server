package rs.ac.bg.fon.silab.TravelAgent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.*;

import rs.ac.bg.fon.silab.TravelAgent.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select * from user where email = ?1 and password = ?2", nativeQuery = true)
	User loginUser(String email, String password);

}
