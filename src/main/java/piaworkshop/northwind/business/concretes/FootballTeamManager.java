package piaworkshop.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piaworkshop.northwind.business.abstracts.FootballTeamService;
import piaworkshop.northwind.core.utilities.results.DataResult;
import piaworkshop.northwind.core.utilities.results.Result;
import piaworkshop.northwind.core.utilities.results.SuccessDataResult;
import piaworkshop.northwind.dataAccess.abstracts.FootballTeamDao;
import piaworkshop.northwind.entities.concretes.FootballTeam;
import piaworkshop.northwind.entities.concretes.Footballer;

@Service
public class FootballTeamManager implements FootballTeamService{

	private FootballTeamDao footballTeamDao;

	@Autowired
	public FootballTeamManager(FootballTeamDao footballTeamDao) {
		super();
		this.footballTeamDao = footballTeamDao;
	}

	@Override
	public DataResult<List<FootballTeam>> getAll() {
		return new SuccessDataResult<List<FootballTeam>>(
				this.footballTeamDao.findAll(), "Futbol takımları listelendi");
	}

	@Override
	public Result add(FootballTeam footballTeam) {
		// TODO Auto-generated method stub
		return null;
	}

}
