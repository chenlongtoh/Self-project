package GameState;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class GameStateManager {

	private ArrayList<GameState> gameStates;
	private int currentState;
	
	public static final int MENU = 0;
	public static final int LEVEL1 = 1;
	public GameStateManager() {
		gameStates = new ArrayList<GameState>();
		
		currentState = MENU;
		gameStates.add(new MenuState(this));
		gameStates.add(new Level1State(this));
	}
	
	public void setState(int State) {
		currentState = State;
		gameStates.get(currentState).init();
	}
	
	public void update() {
		gameStates.get(currentState).update();
	}
	
	public void draw(Graphics2D g) {
		gameStates.get(currentState).draw(g);
	}
	
	public void keyPressed(int k) {
		gameStates.get(currentState).keyPressed(k);
	}
	
	public void keyReleased(int k) {
		gameStates.get(currentState).keyReleased(k);
	}
}
