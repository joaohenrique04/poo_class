public class Carro {
    // Para cada atributo, é necessário definir o tipo
    // Java é uma linguagem FORTEMENTE tipada
    String cor;   
    int numeroDePortas;
    String marca;
    String modelo;
    String chassi;
    String placa;
    char tipoCambio; // M - MANUAL, A - AUTOMATICO
    int anoFabricacao;
    double velocidade;

    
    public void acelerar() { // asinatura do método
        
        velocidade += 5;
        System.out.println("Acelerando para: " + velocidade);
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

    public static void main(String[] args) {
        // acelerar(); não é possivel chamar um metodo nao estatico sem criar o objeto

        Carro carroPopular; // aqui voce criou um TIPO de carro *
        Carro carroDeLuxo;

        carroPopular = new Carro(); // é necessário CRIAR a instância
        carroDeLuxo = new Carro();

        carroPopular.acelerar();
        carroDeLuxo.frear();

    }

}

// *No Java, na construção de um objeto você pode determinar como quer construí-lo, por isso é feito a parte.