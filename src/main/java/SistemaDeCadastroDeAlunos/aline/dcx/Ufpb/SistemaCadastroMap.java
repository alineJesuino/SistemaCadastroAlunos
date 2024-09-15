package SistemaDeCadastroDeAlunos.aline.dcx.Ufpb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class SistemaCadastroMap implements SistemaCadastro{

    private Map<String, Aluno> alunos = new HashMap<>();

    @Override
    public void cadastrarAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    @Override
    public Aluno pesquisarAluno(String matricula) {
        return alunos.get(matricula);
    }

    @Override
    public void removerAluno(String matricula) {
        alunos.remove(matricula);
    }

    @Override
    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos.values());
    }
}
