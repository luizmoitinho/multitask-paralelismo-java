
public class App {

	/*
	 * 	Elabore um programa que imprima os números primos existentes entre 1 e 100000. UTILIZE THREADS. 
	 *	Dica: para cada faixa de mil valores crie um thread e dispare o processo para cada uma delas
	 * */
	
	public static void main(String []args) {
		for(int i = 1; i <= 100; i++) {
			Display d = new Display(i*1000-999, i*1000);
			d.run();
		}	
	}
}
