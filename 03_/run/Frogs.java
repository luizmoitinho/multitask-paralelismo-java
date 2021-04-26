package run;

import java.util.Random;

public class Frogs {
	
	public static int maxJump = 5;
	
	private Random random = new Random();
	
	private String name;
	
	private int currentPosition;
	
	public Frogs(String name) {
		this.name = name;
		this.currentPosition = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int newJump() {
		return this.random.nextInt(Frogs.maxJump); // jump interval: 0 - 5
	}
	
	public void jump(int newJump) {
		if(newJump > Frogs.maxJump || newJump < 0)
			return;
		this.currentPosition += newJump;
	}
	
	public int getCurrentPosition() {
		return this.currentPosition;
	}
	
	
	public String toString() {
		return  "\nName....: " +this.getName() +
				"\nposition: " + this.getCurrentPosition();
	}
	
	
}
