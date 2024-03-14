package projetocorrida;

public abstract class Carro {
    protected String modelo;
    protected double velocidade_atual;
    protected double potencia;
    protected double velocidade_max;

    public Carro(String modelo, double potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidade_atual = 0;
    }
    
    public abstract void acelerar();
    
    public abstract void frear();
    
    public void imprimirDados() {
        System.out.print(modelo + ": " + velocidade_atual);
    }

    /*
    Função para criar uma representação em forma de String do objeto
    com objetivo de imprimir todos os dados da classe
    */

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", potencia=" + potencia + ", velocidade_max=" + velocidade_max + '}';
    }
    
    
    
    
    
}
