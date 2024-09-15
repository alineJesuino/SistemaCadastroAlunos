package SistemaDeCadastroDeAlunos.aline.dcx.Ufpb;
import java.util.List;

public interface SistemaCadastro {
    void cadastrarAluno(Aluno aluno);
    Aluno pesquisarAluno(String matricula);
    void removerAluno(String matricula);
    List<Aluno> listarAlunos();
}
