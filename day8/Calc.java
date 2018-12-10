package day8;
import java.util.Scanner;
public class Calc {
	public void calculation() {
		
		System.out.println("식을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		String op = scanner.next();
		int num2 = scanner.nextInt();
		int result = scanner.nextInt();
		
		switch(op) {
		case "+": result = num1 + num2; break;
		case "-": result = num1 - num2; break;
		case "*": result = num1 * num2; break;
		case "/": result = num1 / num2; break;
		case "%": result = num1 % num2; break;
		}
		System.out.println(num1+op+num2+"="+result);
	}
}
