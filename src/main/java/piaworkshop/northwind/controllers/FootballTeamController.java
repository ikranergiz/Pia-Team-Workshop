package piaworkshop.northwind.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import piaworkshop.northwind.business.abstracts.FootballTeamService;
import piaworkshop.northwind.core.utilities.results.DataResult;
import piaworkshop.northwind.core.utilities.results.Result;
import piaworkshop.northwind.core.utilities.results.SuccessResult;
import piaworkshop.northwind.entities.concretes.FootballTeam;
import piaworkshop.northwind.entities.concretes.Footballer;

@RestController
@RequestMapping("/api/footballteams")
public class FootballTeamController {
	
	private FootballTeamService footballTeamService;

	@Autowired
	public FootballTeamController(FootballTeamService footballTeamService) {
		super();
		this.footballTeamService = footballTeamService;
	}
	
	@GetMapping("/getall")
	DataResult<List<FootballTeam>> getAll(){
		return this.footballTeamService.getAll();
	}
	
	
}
