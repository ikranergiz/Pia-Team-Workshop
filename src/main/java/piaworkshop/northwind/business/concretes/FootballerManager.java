package piaworkshop.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piaworkshop.northwind.business.abstracts.FootballerService;
import piaworkshop.northwind.core.utilities.results.DataResult;
import piaworkshop.northwind.core.utilities.results.Result;
import piaworkshop.northwind.core.utilities.results.SuccessDataResult;
import piaworkshop.northwind.dataAccess.abstracts.FootballerDao;
import piaworkshop.northwind.entities.concretes.Footballer;

@Service
public class FootballerManager implements FootballerService{

	private FootballerDao footballerDao;
	
	@Autowired
	public FootballerManager(FootballerDao footballerDao) {
		super();
		this.footballerDao = footballerDao;
	}

	@Override
	public DataResult<List<Footballer>> getAll() {
		return new SuccessDataResult<List<Footballer>>(this.footballerDao.findAll()
				,"Futbolcular listelendi");
	}

	@Override
	public Result add(Footballer footballer) {
		// TODO Auto-generated method stub
		return null;
	}

}
