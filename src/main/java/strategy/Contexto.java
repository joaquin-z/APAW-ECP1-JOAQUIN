package strategy;

public class Contexto {
    
    private AccionesArma accionesArma;
    
    public void setAccionesArma(AccionesArma accionesArma) {
        this.accionesArma = accionesArma;
    }
    
    public void dispararArma() {
        accionesArma.disparar();
    }
    
    public void recargarArma() {
        accionesArma.recargar();
    }
    
    public int obtenerMunicion() {
        return accionesArma.municion();
    }

}
