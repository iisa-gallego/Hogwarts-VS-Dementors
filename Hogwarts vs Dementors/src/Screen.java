import processing.core.PApplet;
import processing.core.PImage;

public class Screen {
	public int x;
	public int y;
	PImage start;
	PImage instructions;
	PImage results;
	PImage game;
	PImage varita;
	
	public Screen(int x, int y, PApplet app) {
		this.x = x;
		this.y = y;
		start = app.loadImage("Pantalla Inicio.png");
		instructions = app.loadImage("Pantalla Instrucciones.png");
		results = app.loadImage("Pantalla Resumen.png");
		game = app.loadImage("Pantalla Juego.png");
		varita = app.loadImage("Varita de Selección.png");
	}
	public void DrawStart(PApplet app) { 
		app.image(start, x, y);
	}
	public void DrawInstructions(PApplet app) { 
		app.image(instructions, x, y);
	}
	public void DrawResults(PApplet app) { 
		app.image(results, x, y);
	}
	public void DrawGame(PApplet app) { 
		app.image(game, x, y);
	}
	public void DrawVarita(PApplet app) { 
		app.image(varita, x, y);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
