package rs.ac.bg.fon.silab.TravelAgent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import rs.ac.bg.fon.silab.TravelAgent.entity.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Integer> {

	@Query(value = "select * from trip where userID in (select userID from user where role = 'admin')", nativeQuery = true) /**/
	List<Trip> getListedTrips();

	@Query(value = "select * from trip where tripID in (select tripID from favorite where userID = ?1)", nativeQuery = true)
	List<Trip> getUsersFavoritTrips(int userID);

}
