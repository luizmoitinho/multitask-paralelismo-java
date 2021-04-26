package run;

import java.util.Random;

public class Run {
	
	private String name;
	
	public static int distance;
	
	private int numRunners;
	
	private Frogs[] frogs;
	
	public String getName() {
		return this.name;
	}
	
	public Run(String name, int distance, int numRunners) {
		this.name = name;
		this.distance = distance > 0 ? distance : 0;
		this.numRunners = numRunners >= 1 ? numRunners : 1 ;
		
		this.prepareRunners();
	}
	
	public void prepareRunners() {
		this.frogs = new Frogs[this.numRunners];
		
		for(int i = 0; i < this.numRunners ; i++ ) {
			this.frogs[i] = new Frogs("Frog #"+i);
		}
		
	}
	
	public void start() {
		for(int i = 0; i < this.numRunners; i++) {
			this.frogs[i].start();
		}
		System.out.println("##### Colocação #####");
	}
	
	public void showRunners() {
		for(int i = 0; i < this.numRunners ; i++ ) 
			System.out.println(this.frogs[i].toString());
			
		
	}
	
}
