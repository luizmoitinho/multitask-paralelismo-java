package run;

import java.util.ArrayList;

public class Run {
	
	private String name;
	
	public static int distance;
	
	public static ArrayList<String> podio;
 	
	private int numRunners;
	
	private Frogs[] frogs;
	
	public String getName() {
		return this.name;
	}
	
	public Run(String name, int distance, int numRunners) {
		this.name = name;
		Run.distance = distance > 0 ? distance : 0;
		this.numRunners = numRunners >= 1 ? numRunners : 1 ;
		Run.podio = new ArrayList<String>();
		
		this.prepareRunners();
	}
	
	public void prepareRunners() {
		this.frogs = new Frogs[this.numRunners];
		
		for(int i = 0; i < this.numRunners ; i++ ) {
			this.frogs[i] = new Frogs("Frog #"+(i+1));
		}
		
	}
	
	
	
	
	public void start() {
		
		for(int i = 0; i < this.numRunners; i++) {
			this.frogs[i].start();
		}
		
		while(!end());
		System.out.println("\n\n##### Pódio ######");
		this.showPodio();
		
		
	}
	
	public Boolean end() {
		for(int i = 0; i < this.numRunners; i++)
			if(this.frogs[i].isAlive())
				return false;
		
		return true;
	}

	public void showPodio() {
		for(int i = 0 ; i < Run.podio.size(); i++ )
			System.out.println((i+1)+"º - "+Run.podio.get(i));
	}
	
	public void showRunners() {
	
		for(int i = 0; i < this.numRunners ; i++ ) 
			System.out.println(this.frogs[i].toString());
			
		
	}
	
}
