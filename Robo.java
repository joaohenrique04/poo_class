// CLASSE CRIADA 21/02/2025

import java.util.Scanner;

public class Robo {
   String nome;
   String[] cores;
   int cargaBateria = 10;
   String tipo;
   
   Robo() {}
   
   Robo(String nome, String[] cor) {
       if(nome != "") {
           this.nome = nome;
       }
       else {
           this.nome = "Robo de fábrica";
       }
   }
   
   
   Robo(int cargaInicialBateria, String[] cor) {
       if(cargaInicialBateria < 0 || cargaInicialBateria > 100) {
           System.out.println("Carga inválida!");
       }
       else {
           this.cargaBateria = cargaInicialBateria;
       }
   }
   
   Robo(String nome, int cargaInicialBateria, String[] cor) {
       if(nome != "") {
           this.nome = nome;
       }
       else {
           this.nome = "Robo de fábrica";
       }
       
       if(cargaInicialBateria < 0 || cargaInicialBateria > 100) {
           System.out.println("Carga inválida!");
           this.cargaBateria = 10;
       }
       else {
           this.cargaBateria = cargaInicialBateria;
       }
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
   
   int getCargaBateria() {
       return this.cargaBateria;
   }
   
   
   
   public static void main(String[] args) {
       Robo roboLutador;
       Robo roboAspirador;
       
       roboLutador = new Robo("Megazord", new String[]{"azul", "vermelho"});
       roboLutador.falarNome();
       System.out.println(roboLutador.getCargaBateria());
       
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite o nome do robo: ");
       String nome = entrada.next();
       
       roboAspirador = new Robo(nome, new String[]{"preto"});
       System.out.println(roboAspirador.getCargaBateria());
       
       Robo roboPolicial = new Robo();
   }
}