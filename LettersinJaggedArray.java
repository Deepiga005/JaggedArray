package JavaProgm;
import java.util.Scanner;

public class LettersinJaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The array is:");
		sc.close();
		//initialize letter to use in pattern
		char[] letters = {'a','b','f','c','g','j','d','h','k','m','e','i','l','n','o'};
		//variable to keep of current index in letter
		int index=0;
		//create pattern with triangular structure
		for(int row=1;row<=5;row++) {
			//print each row
			for(int col=1;col<=row;col++) {
				// print the current letter
				System.out.print(letters[index]+ "\t");
				index++;
				}
			System.out.println();
		}
		
		
		

	}

}
