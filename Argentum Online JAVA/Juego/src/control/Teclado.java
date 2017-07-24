package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Teclado implements KeyListener{


	private final static int numeroTeclas = 120;
	private final boolean[] teclas = new boolean[numeroTeclas];
	
	public boolean arriba;
	public boolean abajo;
	public boolean izquierda;
	public boolean derecha;
	
	public void actualizar() {
		arriba = teclas[KeyEvent.VK_W]; //Le asigno a arriba la letra W del tecla y asi con las otras...
		abajo = teclas[KeyEvent.VK_S];
		izquierda = teclas[KeyEvent.VK_A];
		derecha = teclas[KeyEvent.VK_D];
	}
	
	public void keyPressed(KeyEvent e) {	//Tecla pulsada: cuando pulsamos una tecla pero no la hemos soltado.
		teclas[e.getKeyCode()] = true;	//Le asigna true a la tecla pulsada
		
	}


	public void keyReleased(KeyEvent e) {	//Tecla liberada: cuando soltamos la tecla que habiamos pulsado
		teclas[e.getKeyCode()] = false;	//Le asigna false si la deje de apretar
		
	}


	public void keyTyped(KeyEvent e) {	//Tecla tipeada: pulsar y soltar la tecla(accion completa).
	
		
	}

}
