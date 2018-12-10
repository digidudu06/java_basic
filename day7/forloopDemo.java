package day7;
import java.util.Scanner;
public class forloopDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("n값 입력:");
		int n = scanner.nextInt();
		String res ="";
		int sum =0;
		
		for(int i=1;i<=n;i++) {
			if(i<=(n-1)) {
				res += i+"+";
			}else{
				res += i+"=";
			}
			sum += i;
		}
		System.out.println(res+sum);

	}

}
