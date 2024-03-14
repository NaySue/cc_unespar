package projetocorrida;

public class ProjetoCorrida {

    public static void main(String[] args) {
        Carro carro1 = new CarroDePasseio("Mustang", 2, 249);
        Carro carro2 = new CarroDeCorrida("Ferrari", 2, 250);
        
        System.out.println(" - Acelerando: ");        
        for (int i=0; i<100; i++) {
            carro1.acelerar();
            carro2.acelerar();
            carro1.imprimirDados();
            System.out.print(" ");
            carro2.imprimirDados();
            System.out.println();
        }
        
        System.out.println(" - Frear: ");
        for (int i=0; i<100; i++) {
            carro1.frear();
            carro2.frear();
            carro1.imprimirDados();
            System.out.print(" ");
            carro2.imprimirDados();
            System.out.println();
        }
        
    }
    
}
