package piaworkshop.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import piaworkshop.northwind.entities.concretes.FootballTeam;

public interface FootballTeamDao extends JpaRepository<FootballTeam, Integer>{

}
