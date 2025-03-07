import java.util.ArrayList;

public class Loja {
    String nomeDaLoja;

    ArrayList<Robo> robosParaVenda = new ArrayList<>();

    void adicionaRoboAVenda(Robo roboAdicionar) {
        // NAO PERMITIR VENDER ROBO QUE JA ESTA A VENDA
        // NAO PERMITIR VENDER ROBO QUE JA FOI VENDIDO / ESTA NO CARRINHO DE ALGUEM
        if (roboAdicionar != null) {
            this.robosParaVenda.add(roboAdicionar);
        } else {
            System.out.println("Objeto não instanciado!");
        }
        
    }

    void removeRoboVenda(Robo roboRemover) {
        if (roboRemover != null) {
            if (this.robosParaVenda.contains(roboRemover)) {
                this.robosParaVenda.remove(roboRemover);
            }
        }
    }
}
