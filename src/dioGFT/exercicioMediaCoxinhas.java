package dioGFT;
import java.util.Scanner;

public class exercicioMediaCoxinhas {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int cox = scan.nextInt();
	    
	    int part = scan.nextInt();

	    double media = (double)cox / (double)part;

	    System.out.printf("%.2f", media);
	  }
}
