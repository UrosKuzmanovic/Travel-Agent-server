package rs.ac.bg.fon.silab.TravelAgent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rs.ac.bg.fon.silab.TravelAgent.entity.Favorite;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {

	@Query(value = "select * from favorite where userid = :userID", nativeQuery = true)
	List<Favorite> findFavoritesByUser(@Param("userID") int userID);

	@Query(value = "select * from favorite where tripid = :tripID", nativeQuery = true)
	List<Favorite> findFavoritesByTrip(@Param("tripID") int tripID);

	@Query(value = "select * from favorite where userid = :userID and tripid = :tripID", nativeQuery = true)
	Favorite findFavoritesByIds(@Param("userID") int userID, @Param("tripID") int tripID);

	@Modifying
	@Query(value = "delete from favorite where userid = :userID and tripid = :tripID", nativeQuery = true)
	int deleteByIds(@Param("userID") int userID, @Param("tripID") int tripID);

}
