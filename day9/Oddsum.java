package day9;
import java.util.Scanner;
public class Oddsum {
	//odd 홀수
	//even 짝수
	//1부터 입력받은 숫자까지의 중에 홀수 합
	public void odd() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 n까지의 홀수의 합 \n"
				+ "n의 값을 입력해주세요.");
		int num = scanner.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.println("홀수의 합 "+sum);
				
	}

}
