package jaywu.com.marimo;

import java.util.ArrayList;
import java.util.List;

public class Game {
	public Marimo marimo;
	public int maxx;
	public int maxy;
	public List<GameObject> objectList = new ArrayList<GameObject>();
	
	public Game(int boundaryX, int boundaryY) {
		maxx = boundaryX;
		maxy = boundaryY;
		marimo = new Marimo(0, maxx/2, maxy/2, 0, 0, Marimo.GrowthStage.LVL1);
		objectList.add(marimo);
	}
}
