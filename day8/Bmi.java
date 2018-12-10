package day8;

import java.util.Scanner;

public class Bmi {
	public void bf() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게 : ");
		double w = scanner.nextDouble();
		System.out.println("키 : ");
		double h = scanner.nextDouble();
		
		double bmi = 0.0;
		bmi = w/(h*h*0.0001);
		System.out.println("BMI : "+bmi);
		
		String res = "";
		if(40<=bmi){
			res = "고도비만";
		}else if(35<=bmi){
			res = "중등도 비만";
		}else if(30<=bmi){
			res = "경도비만";
		}else if(25<=bmi){
			res = "과체중";
		}else if(18.5<=bmi){
			res = "정상";
		}else{
			res = "저체중";
		}
		System.out.println(res);
	}

}
