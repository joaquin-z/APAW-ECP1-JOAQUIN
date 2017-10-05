package strategy;

public class Pistola implements AccionesArma {
    
    private int municion = 15;

    @Override
    public void disparar() {
        this.municion -= 1;
    }

    @Override
    public void recargar() {
        this.municion = 15;
    }
    
    @Override
    public int municion() {
        return this.municion;
    }

}
