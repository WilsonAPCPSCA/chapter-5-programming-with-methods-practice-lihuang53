/* Li Huang
 * per.1
 * chapter 5 Programming with methods practice
 * program 2
 * 11/09/2017
 */

import java.util.Scanner;
public class RomanNumerals {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int n=in.nextInt();
		String romanOnes=romanDigit(n%10, "I","V","X");
		n=n/10;
		String romansTen=romanDigit(n%10, "X","L","C");
		if(n>=10){
			System.out.println("C"+romansTen+romanOnes);
		}else System.out.println(romansTen+romanOnes);
	}
	
	public static String romanDigit(int num, String one, String five, String ten){
		String roman="";
		if(num<4){
			for(int i=0; i<num; i++)roman+=one;
		}
		else if (num==4)roman=one+five;
		else if (num==9)roman=one+ten;
		else{
			roman+=five;
			for(int i=0; i<num-5; i++)roman+=one;
		}
		return roman;
	}

}
