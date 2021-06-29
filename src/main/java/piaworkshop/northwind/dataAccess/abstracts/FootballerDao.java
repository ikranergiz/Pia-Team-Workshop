package piaworkshop.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import piaworkshop.northwind.entities.concretes.Footballer;

public interface FootballerDao extends JpaRepository<Footballer, Integer>{

	//@Query("From Footballer where footballerTeam.id =: footballerTeamId")
	List<Footballer> getByFooballerTeamId(int footballerTeamId);
	
	@Query("From Footballer where id =: id")
	Footballer deleteById(int id);
}
