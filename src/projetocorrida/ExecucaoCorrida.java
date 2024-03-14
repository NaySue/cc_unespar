package projetocorrida;

import java.util.Scanner;

public class ExecucaoCorrida {
    
    public static void main(String args[]) {
    
        Scanner scan = new Scanner(System.in);
        int opcao, opcao_carro;
        int qtd_carros;
        double distancia;
        
        System.out.print("Quantos carros? ");
        qtd_carros = scan.nextInt();
        
        System.out.print("Qual a distância? ");
        distancia = scan.nextDouble();
        
        Pista pista_corrida = new Pista(qtd_carros, distancia);
        
        do {
            // Imprimir a tela do menu
            System.out.println(" (1) Adicionar um carro");
            System.out.println(" (2) Listar todos os carros");
            System.out.print(" Opção: ");
            opcao = scan.nextInt();
            
            // Gerenciador de menus
            switch (opcao) {
                case 1:
                    if (pista_corrida.temVaga()) {
                        System.out.println(" - Qual o tipo do carro?");
                        System.out.println("    (1) Passeio");
                        System.out.println("    (2) Corrida");
                        System.out.print("    Opção: ");
                        opcao_carro = scan.nextInt();
                        Carro carro;
                        String modelo;
                        double potencia, vel_max;
                        scan.nextLine();
                        System.out.print(" - Modelo: ");
                        modelo = scan.nextLine();
                        System.out.print(" - Potência: ");
                        potencia = scan.nextDouble();
                        System.out.print(" - Vel. máxima: ");
                        vel_max = scan.nextDouble();

                        // Instanciando o objeto da classe Carro, de acordo com o seu tipo
                        if (opcao_carro==1) {
                            carro = new CarroDePasseio(modelo, potencia,vel_max);
                        }
                        else {
                            carro = new CarroDeCorrida(modelo, potencia, vel_max);
                        }
                        // Adicionar o objeto carro dentro da pista
                        pista_corrida.addCarro(carro);
                    } else {
                        System.out.println("Não é possível adicionar mais carros!");
                    }
                    break;

               
                case 2:
                    pista_corrida.listarTodosCarros();
                    break;
                
                case 0:
                    System.out.println("Até logo!");
                    break;
                        
                default:
                    System.out.println("Opção inválida!");
            }
            
            System.out.println("\n\n");
            
        } while (opcao!=0); // Fim do do-while   
        
        
    }
    
}
