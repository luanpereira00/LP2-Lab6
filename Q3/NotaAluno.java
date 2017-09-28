
import java.lang.Comparable;

public class NotaAluno implements Comparable<NotaAluno> {
	private int matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public NotaAluno(int matricula, String nome, double nota1, double nota2, double nota3) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public double getMedia() {
		return (getNota1()+getNota2()+getNota3())/3;
	}
	public int compareTo(NotaAluno outro) {
		double resultado = getMedia()-outro.getMedia();
		if (resultado > 0) return 1;
		else if (resultado == 0 ) return 0;
		else return -1;
	}
	public String toString() {
		return "Nome: " + getNome() + " Media: " + getMedia();
	}
}
