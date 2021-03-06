package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HojaSprites {
	//Una hoja de sprites es una imagen con los movimientos de cada grafico, donde cada movimiento es un sprite, googlear para mas info
	private final int ancho;
	private final int alto;
	public final int[] pixeles;
	
	public HojaSprites(final String ruta, final int ancho, final int alto){
		this.ancho = ancho; 	//ancho (en pixeles) de la imagen
		this.alto = alto;		//alto (en pixeles) de la imagen
		
		pixeles = new int[ancho * alto];         //Pixeles totales que va a tener la imagen(la hoja de sprite)
		
		BufferedImage imagen;
		try {
			imagen = ImageIO.read(HojaSprites.class.getResource(ruta)); //Le asignamos a imagen el valor de una ruta. La ruta es la direccion donde estan las imagenes.
			
			imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho); //Guardo los colores de cada pixel en el array pixeles
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public int obtenAncho() {
		return ancho;
	}
	
}
