package piaworkshop.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import piaworkshop.northwind.entities.concretes.Footballer;

public interface FootballerDao extends JpaRepository<Footballer, Integer>{

}
