
public class Display extends Thread{

	private int start, end;
	
	public Display(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		for(int i = this.start; i <= this.end; i++) {
			if(!this.isPrimeNumber(i))
				continue;
			System.out.println(i);
		}
	}

	private boolean isPrimeNumber(int numero) {
	    for (int j = 2; j < numero; j++)
	        if (numero % j == 0)
	            return false;   
	    return true;
	}
	
}
