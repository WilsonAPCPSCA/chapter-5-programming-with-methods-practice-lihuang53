/* Li Huang
 * per.1
 * chapter 5 Programming with methods practice
 * program 1
 * 11/09/2017
 */

import java.util.Scanner;
public class TimeEnglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the time(hh:mm): ");
		String time = in.nextLine();
		int hour=Integer.valueOf(time.substring(0,2));
		int min=Integer.valueOf(time.substring(3,5));
		System.out.println(englishTime(hour,min));
		
	}
	public static String englishTime(int hrs, int mins){
		String time="";
		if(mins==45){
			if(hrs==12)hrs=1;
			else hrs++;
		}
		
		String hour="";
		if(hrs==1)hour+="one ";
		else if(hrs==2)hour+="two ";
		else if(hrs==3)hour+="three ";
		else if(hrs==4)hour+="four ";
		else if(hrs==5)hour+="five ";
		else if(hrs==6)hour+="six ";
		else if(hrs==7)hour+="seven ";
		else if(hrs==8)hour+="eight ";
		else if(hrs==9)hour+="nine ";
		else if(hrs==10)hour+="ten ";
		else if(hrs==11)hour+="eleven ";
		else if(hrs==12)hour+="twelve ";	
		else return "hour not within 1 and 12";
		
		if(mins==0)time=hour+"o'clock";
		else if (mins==15)time="a quarter after "+hour;
		else if(mins==30)time="half past "+hour;
		else if (mins==45)time="a quarter till "+hour;
		else time = Integer.toString(mins)+" mins past "+hour;
		
		return time;
	}
}
