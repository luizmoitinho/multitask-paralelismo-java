package run;


public class Run {
	
	private String name;
	
	private int distance;
	
	private int numRunners;
	
	private Frogs[] frogs;
	
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
	
	public void showRunners() {
		for(int i = 0; i < this.numRunners ; i++ ) {
			System.out.println(this.frogs[i].toString());
		}
		
	}
	
	
}
