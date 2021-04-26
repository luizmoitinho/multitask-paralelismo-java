import java.util.Random;


public class matrizesThread {

	public static int[][] m = new int[3][5];
 	
	public static void main(String[] args) {
		Random r = new Random();
		
		//preenchimento de valores aleatórios na matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				m[i][j] = r.nextInt(100);
			}
		}

		System.out.println("Inicio da soma da linhas pelas thread");
		
		//Rotina para criar 3 threads e inciálizá-las
		for (int i = 0; i < 3; i++) {
			SomaLinhas t1 = new SomaLinhas(i);
			t1.start();

		}

	}

}
