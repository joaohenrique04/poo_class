// CLASSE CRIADA 21/02/2025

import java.util.Scanner;

public class Robo {
    String nome;
    String[] cores;
    int cargaBateria = 10;
    String tipo;
    
    Robo() {}
    
    Robo(String nome, String[] cor) {
        this.setNome(nome);
        this.setCor(cor);
    }
    
    
    Robo(int cargaInicialBateria, String[] cor) {
        this.setBateria(cargaInicialBateria);
        this.setCor(cor);
    }
    
    Robo(String nome, int cargaInicialBateria, String[] cor) {
        this.setNome(nome);
        this.setBateria(cargaInicialBateria);
        this.setCor(cor);
    }
    
    
    void falarNome() {
        System.out.println("Olá, sou "+this.nome);
        this.cargaBateria -= 1;
    }
    
    void setNome(String nome) {
        if(nome != "") {
            this.nome = nome;
        }
        else {
            this.nome = "Robo de fábrica";
        }
    }

    void setCor(String[] cor) {
        this.cor = cor;
    }

    void setBateria(int bateria) {
        if (bateria < 0 || bateria > 100) {
            System.out.println("Carga inválida");
        } else {
            this.bateria = bateria;
        }
    }
   
    int getCargaBateria() {
        return this.cargaBateria;
    }
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Robo roboLutador = new Robo("Megazord", new String[]{"azul", "vermelho"});
        Robo roboAspirador;

        System.out.println("Digite o nome do robo: ");
        String nome = entrada.next();
       
        roboAspirador = new Robo(nome, new String[]{"preto"});
       
        roboLutador.falarNome();
        System.out.println("Bateria do Lutador: " + roboLutador.getCargaBateria());
        
        System.out.println("Bateria do Aspirador: " + roboAspirador.getCargaBateria());
       
   }
}