package JavaProgm;
import java.util.Scanner;


public class LeftPyramidinArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//get input for no.of.rows
		System.out.println("enter no of rows:");
		int n=scan.nextInt();
		//create jagged array to store left pyramid
		
		char[][] pyramid=new char[n][];
		//initialize jagged array with no of stars in each rows
		for(int i=0;i<n;i++) {
			pyramid[i] =new char[i+1];  //i+1 is star in each row
		}
		//fill jagged array with star
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				pyramid[i][j]='*';
			}
		}
		//print the pyramid pattern
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(pyramid[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();

	}

}
