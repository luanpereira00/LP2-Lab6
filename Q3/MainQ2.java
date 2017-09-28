import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MainQ2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<NotaAluno> sala = new ArrayList<NotaAluno>();
		
		sala.add(new NotaAluno(1, "Aluno 1", 4.0, 5.0, 8.0));
		sala.add(new NotaAluno(2, "Aluno 2", 9.0, 10.0, 7.0));
		sala.add(new NotaAluno(3, "Aluno 3", 1.0, 5.0, 10.0));
		sala.add(new NotaAluno(4, "Aluno 4", 7.0, 7.0, 8.0));
		sala.add(new NotaAluno(5, "Aluno 5", 6.0, 5.0, 7.0));
		
		Collections.sort(sala);
		
		for (NotaAluno a : sala) {
			System.out.println(a.toString());
		}
	}

}
