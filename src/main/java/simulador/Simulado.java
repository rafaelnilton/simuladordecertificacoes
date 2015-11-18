package simulador;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="simulados")
public class Simulado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	private Aluno aluno;
	private double nota;
	private Date data;
	private Materia materia;
	@OneToMany
	private List<Questao> questoes;
	@OneToMany
	private List<QuestaoResolvida> questoesResolvidas;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public List<Questao> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(List<Questao> questoes) {
		if(questoes == null) {
			questoes = new ArrayList<Questao>();
		}
		this.questoes = questoes;
	}
	public List<QuestaoResolvida> getQuestoesResolvidas() {
		return questoesResolvidas;
	}
	public void setQuestoesResolvidas(List<QuestaoResolvida> questoesResolvidas) {
		if(questoesResolvidas == null) {
			questoesResolvidas = new ArrayList<QuestaoResolvida>();
		}
		this.questoesResolvidas = questoesResolvidas;
	}

}
