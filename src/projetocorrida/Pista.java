package projetocorrida;

public class Pista {
    private Carro lista_carro[];
    private int qtd_carros;
    private double distancia;
    private int qtd_atual;

    public Pista(int qtd_carros, double distancia) {
        this.qtd_carros = qtd_carros;
        this.distancia = distancia;
        // Definir a dimensão do vetor de acordo com qtd_carros
        lista_carro = new Carro[qtd_carros];
        qtd_atual = 0;
    }
    
    public boolean temVaga(){
        
    }
    
    public void addCarro(Carro carro) {
        if (qtd_atual<lista_carro.length){
            lista_carro[qtd_atual] = carro;
            qtd_atual++;  
            System.out.println("Carro adicionado com sucesso!");
        } else {
            System.out.println("Limite de carros atingido!");
        }
        
        
    }
    
    public void listarTodosCarros() {
        for (int i=0; i<qtd_atual; i++) {
            //lista_carro[i].imprimirDados();
            System.out.println(lista_carro[i].toString());
        }
    }
    
    
    
}
