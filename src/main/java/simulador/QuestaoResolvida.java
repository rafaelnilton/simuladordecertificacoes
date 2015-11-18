package simulador;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class QuestaoResolvida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSimulado;
	private List<Integer> respostas;
	
	public int getIdSimulado() {
		return idSimulado;
	}
	public void setIdSimulado(int idSimulado) {
		this.idSimulado = idSimulado;
	}
	public List<Integer> getRespostas() {
		return respostas;
	}
	public void setRespostas(List<Integer> respostas) {
		if(respostas == null) {
			respostas = new ArrayList<Integer>();
		}
		this.respostas = respostas;
	}

}
