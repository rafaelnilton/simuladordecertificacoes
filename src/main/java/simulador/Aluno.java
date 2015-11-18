package simulador;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="alunos")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToMany
	private List<Simulado> simulados;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Simulado> getSimulados() {
		return simulados;
	}
	public void setSimulados(List<Simulado> simulados) {
		if(simulados == null) {
			simulados = new ArrayList<Simulado>();
		}
		this.simulados = simulados;
	}
	
	

}