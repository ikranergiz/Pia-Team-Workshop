package piaworkshop.northwind.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import piaworkshop.northwind.business.abstracts.FootballerService;
import piaworkshop.northwind.core.utilities.results.DataResult;
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
	
	

}
