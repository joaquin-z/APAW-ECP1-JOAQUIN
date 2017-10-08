package strategy;

public class Jugador {
    
    private Contexto contexto;
    
    public Jugador() {
        contexto = new Contexto();
    }
    
    public void seleccionarRifle() {
        AccionesArma seleccionarRifle = new Rifle();
        contexto.setAccionesArma(seleccionarRifle);
    }
    
    public void seleccionarPistola() {
        AccionesArma seleccionarPistola = new Pistola();
        contexto.setAccionesArma(seleccionarPistola);
    }
    
    public void realizarDisparo() {
        contexto.dispararArma();
    }
    
    public void realizarRecarga() {
        contexto.recargarArma();
    }
    
    public int revisarMunicion() {
        return contexto.obtenerMunicion();
    }

}
