package piaworkshop.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@NoArgsConstructor
@AllArgsConstructor

@Table(name = "football_teams")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","footballers"})
public class FootballTeam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "foundation_year")
	private String foundationYear;
	
	@Column(name = "colors")
	private String colors;
	
	@OneToMany(mappedBy = "footballTeam")
	private List<Footballer> footballers;

}
