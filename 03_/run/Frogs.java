package run;

import java.util.Random;

public class Frogs extends Thread{
	
	public static int maxJump = 5;
	
	private Random random = new Random();
	
	private String name;
	
	private int currentPosition;
	
	public Frogs(String name) {
		this.name = name;
		this.currentPosition = 0;
	}

	@SuppressWarnings("deprecation")
	public void run() {
		System.out.println(this.getName_() + " | " + this.getCurrentPosition());
		while(this.newJump() <= Run.distance){
			System.out.println(this.getName_() + " | " + this.getCurrentPosition());
			this.newJump();
			if(this.getCurrentPosition() == Run.distance)
				break;
			
		}

		this.suspend();
		
	}
	
	public String getName_() {
		return this.name;
	}
	
	public int newJump() {
		int value = this.random.nextInt(Frogs.maxJump); // jump interval: 0 - 5
		value = value + this.getCurrentPosition() >= Run.distance ?  Run.distance : value + this.getCurrentPosition();
		this.setCurrentPosition(value);
		return value;
	}
	
	public void jump(int newJump) {
		if(newJump > Frogs.maxJump || newJump < 0)
			return;
		this.currentPosition += newJump;
		
	}
	
	public void setCurrentPosition(int pos) {
		this.currentPosition = pos;
	}
	
	public int getCurrentPosition() {
		return this.currentPosition;
	}
	
	
	public String toString() {
		return  "\nName....: " +this.getName_() +
				"\nposition: " + this.getCurrentPosition();
	}
	
	
}
