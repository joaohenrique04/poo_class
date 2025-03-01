
public class CaixaEletronico {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        //System.out.println(conta1.saldo);

        // não é correto permitir que outras classes mexam em atributos de uma classe
        // para encapsular tudo isso existem os modificadores de acesso
        // conta1.saldo = 100000;

        //System.out.println(conta1.saldo);
    }   
}
