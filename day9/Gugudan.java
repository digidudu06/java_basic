package day9;
import java.util.Scanner;
public class Gugudan {
	// 출력할 단..예를 들어 3을 입력하면
	// 3단 출력 3*2 = 6....3*9=27
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 단을 계산할까요?");
		int dan = scanner.nextInt();
		String exp = "";
		String res = "";
		for(int i=1;i<10;i++) {
			exp += dan+" * "+i+" = "+dan*i+"\n";
		}
		System.out.println(exp+res);
	}
}
