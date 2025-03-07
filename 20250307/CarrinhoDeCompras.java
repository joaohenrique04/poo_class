import java.util.ArrayList;

public class CarrinhoDeCompras {
    static int proximoId = 1;
    int idVenda; // autoincremento
    double totalVenda;

    ArrayList<Robo> carrinho = new ArrayList<>();

    CarrinhoDeCompras () {
        this.idVenda = proximoId;
        proximoId += 1;
    }

    void adicionaRoboAoCarrinho (Robo roboAdicionar, Loja lojaVendendo) {
        // SO PODE POR NO CARRINHO ROBO QUE TA A VENDA
        if (roboAdicionar != null) {
            if (lojaVendendo.robosParaVenda.contains(roboAdicionar)) {
                this.carrinho.add(roboAdicionar);
                lojaVendendo.removeRoboVenda(roboAdicionar);
            } else {
                System.out.println("Esse robo não esta disponivel na Loja");
            }
        } else {
            System.out.println("Objeto nao instanciado!");
        }
    }

    void calculaValorTotal () {
        this.totalVenda = 0;
        for (Robo robo : carrinho) {
            this.totalVenda += robo.getPreco();
        }
    }

    public static void main(String[] args) {
        Loja lojaMixTadeus = new Loja();

        Robo roboLimpador = new Robo();
        Robo roboLimpadorAzul = new Robo();

        lojaMixTadeus.adicionaRoboAVenda(roboLimpador);
        lojaMixTadeus.adicionaRoboAVenda(roboLimpadorAzul);

        lojaMixTadeus.removeRoboVenda(roboLimpadorAzul);

        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();

        meuCarrinho.adicionaRoboAoCarrinho(roboLimpador, lojaMixTadeus);
        meuCarrinho.adicionaRoboAoCarrinho(roboLimpadorAzul, lojaMixTadeus);


        meuCarrinho.calculaValorTotal();

        System.out.println("total atual: " + meuCarrinho.totalVenda);

    }
}
