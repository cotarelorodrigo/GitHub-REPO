package graficos;

public final class Sprite {
	private final int lado;
	
	private int x;
	private int y;
	
	public int[] pixeles;
	private final HojaSprites hoja;
	
	public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja) {
		this.lado = lado; //Dentro de la hoja de sprites, cada sprite tiene un tamaño(cuadrado) de lado x lado
		
		pixeles = new int[lado * lado];
		this.x = columna * lado;
		this.y = fila * lado;
		this.hoja = hoja;
		
		for(int y = 0; y < lado; y++) {                         //Recorres la hoja de sprite De izq a derecha
			for(int x = 0; x < lado; x++) {						//Recorremos la hoja de sprite De arriba hacia abajo
				pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.obtenAncho()]; //En una hoja de sprite hay muchos sprites
				 						//Entonces aca estoy agarrando los pixeles que le corresponden a un sprite en particular. Me estoy quedando con un solo sprite.
			}
		}
	
	}
	
	
}
