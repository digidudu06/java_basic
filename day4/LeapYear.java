package day4;

import java.util.Scanner;

public class LeapYear {
	  public static void main(String[] args){
			System.out.println("년도 : ");
			Scanner scan = new Scanner(System.in);
			String year = scan.next();
			int y = Integer.parseInt(year);
				

			String result = "";
				
			if(y%4==0 && y%100!=0 || y%400==0) {
				result = "윤년";
			}else{
				result = "평년";
			}

			System.out.print(y+"년도 : "+result);
	  }

}
