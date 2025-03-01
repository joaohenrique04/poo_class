

import java.util.ArrayList;

public class FolhaDePagamento {
    double valorFolha;
    private ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();

    void adicionarFuncionario(Funcionario funcionarioAdicionar) {
        if (funcionarioAdicionar != null) {
            this.listaDeFuncionarios.add(funcionarioAdicionar);
        } else {
            System.out.println("Objeto não instanciado!");
        }
        
    }

    void calcularFolhaDePagamento() {
        for (Funcionario funcionario : listaDeFuncionarios) {
            this.valorFolha += funcionario.getSalario();
        }
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("F1");
        Funcionario f2 = new Funcionario("F2");

        f1.calculaSalario(20);
        f2.calculaSalario(30);


        FolhaDePagamento folha = new FolhaDePagamento();
        folha.adicionarFuncionario(f2);
        folha.adicionarFuncionario(f1);

        folha.calcularFolhaDePagamento();
        System.out.println("Valor da folha: " + folha.valorFolha);


    }
}
