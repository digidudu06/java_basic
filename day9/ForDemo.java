package day9;
import java.util.Scanner;
public class ForDemo {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~n까지의 합 \nn의값 입력.");
		int n = scanner.nextInt();
		String res = "";
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i != n) {
				res += i+"+";				
			}else {
				res += i+"=";
			}
			sum += i;
		}
		System.out.println(res+sum);
		
	}

}
