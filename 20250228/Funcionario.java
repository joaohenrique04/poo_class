public class Funcionario {
    static double valorHora = 40.00;
    
    String nome;
    String cpf;
    double salario;

    Funcionario (String nome) {
        this.nome = nome;
    }

    Funcionario (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    void calculaSalario(int horasTrabalhadas) {
        if (horasTrabalhadas > 0) {
            this.salario = Funcionario.valorHora * horasTrabalhadas;
        } else {
            System.out.println("Horas trabalhadas deve ser maior que 0");
        }
        
    }

    double getSalario() {
        return this.salario;
    }

    public static void main(String[] args) {

        Funcionario eike = new Funcionario("Eike");
        Funcionario pedro = new Funcionario("Pedro Chicuta", "44455566678");

        pedro.calculaSalario(110);
        eike.calculaSalario(158);

        System.out.println("eike ganhou " + eike.salario);
        System.out.println("pedro ganhou " + pedro.salario);
    }
}
