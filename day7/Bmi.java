package day7;
import java.util.Scanner;
public class Bmi {
	public void bf() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게 : ");
		double w = scanner.nextDouble();
		System.out.println("키 : ");
		double h = scanner.nextDouble();
		
		double bmi = w/(h*h*0.0001);
		System.out.println("BMI : "+bmi);
		String res = "";
		if(bmi>=40) {
			res = "비만";
		}else if(bmi>=25) {
			res = "정상";
		}else {
			res = "저체중";
		}
		System.out.println(res);
		
	}

}