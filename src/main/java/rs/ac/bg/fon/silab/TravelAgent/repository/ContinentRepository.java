package rs.ac.bg.fon.silab.TravelAgent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.ac.bg.fon.silab.TravelAgent.entity.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Integer> {

}
