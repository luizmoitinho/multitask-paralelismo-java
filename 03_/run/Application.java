package run;


public class Application {
	
	public static void main(String[] args) {
		Run run = new Run("Corrida maluca", 15,2);
		System.out.println(run.getName().toUpperCase());
		System.out.printf("\n##### Participantes #####");
		run.showRunners();
		
		System.out.println("Start em 3..2..1 - GO!");
		run.start();
		
	}
	
}
