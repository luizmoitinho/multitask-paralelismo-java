
public class SomaLinhas extends Thread{

	int linha;
	
	public SomaLinhas(int linha)
	{
		this.linha = linha;
	}
	
	public void run()
	{	
 	   int soma = 0;
       for (int j = 0; j < 5; j++) {
    	  soma = soma + matrizesThread.m[linha][j]; 
       }

		System.out.println(" Soma da linha "+(linha+1)+": " + soma);
	}
	

}
