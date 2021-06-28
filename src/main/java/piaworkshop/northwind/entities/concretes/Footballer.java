package piaworkshop.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "footballers")
public class Footballer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "football_team_id")
	private int footballerTeamId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "uniform_number")
	private String uniformNumber;
	
	/*@ManyToOne()
	@JoinColumn(name = "football_team_id")
	private FootballTeam footballTeam;*/

}
