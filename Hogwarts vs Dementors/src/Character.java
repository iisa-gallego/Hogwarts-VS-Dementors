import processing.core.PApplet;
import processing.core.PImage;

public class Character {
	public int x;
	public int y;
	PImage harry;
	PImage dementor;
	PImage patronus;
	//PImage game;

	public Character(int x, int y, PApplet app) {
		this.x = x;
		this.y = y;
		harry = app.loadImage("Potter.png");
		dementor = app.loadImage("Dementorcito.png");
		patronus = app.loadImage("Patronus.png");

	}
}
