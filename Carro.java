public class Carro {
    /* 
    Para cada atributo, é necessário definir o tipo
    Java é uma linguagem FORTEMENTE tipada
    */
    String cor;   
    int numeroDePortas;
    String marca;
    String modelo;
    String chassi;
    String placa;
    char tipoCambio; // M - MANUAL, A - AUTOMATICO
    int anoFabricacao;
    int velocidade;
    int velocidadeMaxima;

    
    public void acelerar() { // asinatura do método
        if (velocidade + 10 > velocidadeMaxima) {
            velocidade = 30;
            System.out.println("Velocidade Maxima atingida");
        } else {
            velocidade += 10;
            System.out.println("Acelerando para: " + velocidade);
        }
    }

    public void frear() {
        if (velocidade > 0) {
            velocidade -= 5;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("Freando para: " + velocidade);
        } else {
            System.out.println("Carro esta parado!!!!");
        }
        
    }

    void velocidadeAtual() {
        System.out.println("Velocidade atual: " + velocidade);
    }

    int getNumeroDePortas() {
        return numeroDePortas;
    }

    public static void main(String[] args) {
        // acelerar(); não é possivel chamar um metodo nao estatico sem criar o objeto

        Carro carroPopular; // aqui voce criou um TIPO de carro *
        Carro carroDeLuxo;

        carroPopular = new Carro(); // é necessário CRIAR a instância
        carroDeLuxo = new Carro();


        carroPopular.cor = "Prata";
        carroPopular.modelo = "Uno";

        carroDeLuxo.modelo = "Ferrari";
        carroDeLuxo.cor = "Vermelho";
        carroDeLuxo.velocidadeMaxima = 30;

        carroDeLuxo.acelerar();
        carroDeLuxo.acelerar();
        carroDeLuxo.acelerar();
        carroDeLuxo.acelerar();

        System.out.println("Numero de portas: " + carroDeLuxo.getNumeroDePortas());

        System.out.println("Modelo: " + carroPopular.modelo);
        System.out.println("Modelo: " + carroDeLuxo.modelo);

        System.out.println("Cor: " + carroPopular.cor);
        System.out.println("Cor: " + carroDeLuxo.cor);

    }

}

// *No Java, na construção de um objeto você pode determinar como quer construí-lo, por isso é feito a parte.