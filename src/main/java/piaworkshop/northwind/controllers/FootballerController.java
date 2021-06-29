package piaworkshop.northwind.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import piaworkshop.northwind.business.abstracts.FootballerService;
import piaworkshop.northwind.core.utilities.results.DataResult;
import piaworkshop.northwind.core.utilities.results.Result;
import piaworkshop.northwind.core.utilities.results.SuccessResult;
import piaworkshop.northwind.entities.concretes.Footballer;

@RestController
@RequestMapping("/api/footballers")
public class FootballerController {
	
	private FootballerService footballerService;

	@Autowired
	public FootballerController(FootballerService footballerService) {
		super();
		this.footballerService = footballerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Footballer>> getAll(){
		return this.footballerService.getAll();
	}
	
	@GetMapping("/getByFootballerTeamId")
	public DataResult<List<Footballer>> getByFootballerTeamId(
			@RequestParam("footballerTeamId") int footballerTeamId){
		return this.footballerService.getByFootballerTeamId(footballerTeamId);
	}
	
	@DeleteMapping("/delete/{id}")
	public Footballer deleteById(@PathVariable("id") int id) {
		return this.footballerService.deleteById(id);
	}
	
	@PostMapping("/add")
	public Result add(Footballer footballer) {
		return this.footballerService.add(footballer);
	}
	
	

}
