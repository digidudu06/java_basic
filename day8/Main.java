package day8;
import java.util.Scanner;
import day8.Calc;
import day8.Bmi;
import day8.MyCalender;
import day8.GenderChecker;
import day8.Grade;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴]\n"
					+ "0. 종료\n"
					+ "1. 계산기\n"
					+ "2. BMI\n"
					+ "3. 달력\n"
					+ "4. 성별\n"
					+ "5. 성적표\n");
			String select = scanner.next();
			switch(select) {
			case "0": System.out.println("종료");return;
			case "1":
				Calc calc = new Calc();		
				calc.calculation();
				break;
			case "2":
				Bmi bmi = new Bmi();
				bmi.bf();
				break;
			case "3":
				MyCalender myCalender = new MyCalender();
				
				break;
			case "4": 
				GenderChecker checker = new GenderChecker();
				break;
			case "5":
				Grade grade = new Grade();
				break;
			default : break;
			}
		}

	}

}
