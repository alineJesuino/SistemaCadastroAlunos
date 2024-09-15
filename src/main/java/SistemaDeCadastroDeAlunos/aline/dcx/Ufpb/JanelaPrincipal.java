package SistemaDeCadastroDeAlunos.aline.dcx.Ufpb;

import javax.swing.*;

public class JanelaPrincipal extends JFrame {
    private SistemaCadastro sistema;


    public JanelaPrincipal (SistemaCadastro sistema){
      this.sistema = sistema;
      setTitle("sistema de cadastro de alunos");
      setSize(400, 300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      criarMenu();

    }
    public void criarMenu(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opções");

        JMenuItem itemCadastrar = new JMenuItem("Cadastrar Aluno");
        itemCadastrar.addActionListener(e -> {
            // Lógica para cadastrar aluno
        });

        JMenuItem itemListar = new JMenuItem("Listar Alunos");
        itemListar.addActionListener(e -> {
            // Lógica para listar alunos
        });

        JMenuItem itemSair = new JMenuItem("Sair");
        itemSair.addActionListener(e -> System.exit(0));

        menu.add(itemCadastrar);
        menu.add(itemListar);
        menu.add(itemSair);
        menuBar.add(menu);

        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SistemaCadastro sistema = new SistemaCadastroMap();
        JanelaPrincipal janela = new JanelaPrincipal(sistema);
        janela.setVisible(true);
    }
}



