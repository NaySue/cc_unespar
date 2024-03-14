package projetocorrida;

public class CarroDeCorrida extends Carro {
    
    public CarroDeCorrida(String modelo, double potencia, double vel_max) {
        super(modelo, potencia);
        velocidade_max = vel_max;
    }

    @Override
    public void acelerar() {
        if (velocidade_atual==0) {
            velocidade_atual = 1;
        }
        velocidade_atual = velocidade_atual*potencia;
        if (velocidade_atual>velocidade_max) {
            velocidade_atual = velocidade_max;
        }
    }

    @Override
    public void frear() {
        velocidade_atual = velocidade_atual/potencia;
        if (velocidade_atual<1) {
            velocidade_atual = 0;
        }
    }
    
}
