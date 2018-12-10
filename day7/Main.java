package day7;
import java.util.Scanner;
import day7.Calc;
import day7.Bmi;
public class Main {

	public static void main(String[] args) {
	
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("[메뉴] 0.종료 1.계산기 2.BMI 3.윤년 4.성별 판별기 5.등수구하기 ");
			int select = scanner.nextInt();
			switch(select) {
			case 0: 
				System.out.println("종료");
				return;
			case 1: 
				Calc calc = new Calc();
				calc.calculation();
				break;
			case 2: 
				Bmi bmi = new Bmi();
				bmi.bf();
				break;
			case 3:
				
				break;
			case 4: break;
			case 5: break;
			
			}
			
		}


	}

}
