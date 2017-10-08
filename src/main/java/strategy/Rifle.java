package strategy;

public class Rifle implements AccionesArma {
    
    private int municion = 60;

    @Override
    public void disparar() {
        this.municion -= 3;
    }

    @Override
    public void recargar() {
        this.municion = 60;
    }

    @Override
    public int municion() {
        return this.municion;
    }

}
