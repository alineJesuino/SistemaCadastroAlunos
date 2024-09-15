package SistemaDeCadastroDeAlunos.aline.dcx.Ufpb;

public class Aluno{
   private String nome;
   private String matricula;
   private Curso curso;

   public Aluno(String nome, String matricula, Curso curso){
       this.nome = nome;
       this.matricula = matricula;
       this.curso = curso;
   }
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso=" + curso +
                '}';
    }


}//Fim do codigo