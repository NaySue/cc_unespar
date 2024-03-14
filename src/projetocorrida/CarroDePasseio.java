package projetocorrida;

public class CarroDePasseio extends Carro {

    public CarroDePasseio(String modelo, double potencia, double vel_max) {
        super(modelo, potencia);
        velocidade_max = vel_max;
    }

    @Override
    public void acelerar() {
        velocidade_atual = velocidade_atual + potencia;
        if (velocidade_atual>velocidade_max) {
            velocidade_atual = velocidade_max;
        }
    }

    @Override
    public void frear() {
        velocidade_atual = velocidade_atual - potencia;
        if (velocidade_atual<0) {
            velocidade_atual = 0;
        }
    }
    
}
