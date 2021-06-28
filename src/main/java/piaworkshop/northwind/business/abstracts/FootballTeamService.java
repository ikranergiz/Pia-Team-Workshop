package piaworkshop.northwind.business.abstracts;

import java.util.List;

import piaworkshop.northwind.core.utilities.results.DataResult;
import piaworkshop.northwind.core.utilities.results.Result;
import piaworkshop.northwind.entities.concretes.FootballTeam;

public interface FootballTeamService {

	DataResult<List<FootballTeam>> getAll();
	Result add(FootballTeam footballTeam);
}
