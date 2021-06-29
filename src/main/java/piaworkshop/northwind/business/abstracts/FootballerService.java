package piaworkshop.northwind.business.abstracts;

import java.util.List;

import piaworkshop.northwind.core.utilities.results.DataResult;
import piaworkshop.northwind.core.utilities.results.Result;
import piaworkshop.northwind.entities.concretes.Footballer;

public interface FootballerService {

	DataResult<List<Footballer>> getAll();
	Result add(Footballer footballer);

	DataResult<List<Footballer>> getByFootballerTeamId(int footballerTeamId);
	
	Footballer deleteById(int id);
}
