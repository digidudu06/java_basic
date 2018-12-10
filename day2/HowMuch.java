package day2;
import java.util.Scanner;
public class HowMuch {

	public static void main(String[] args) {
		System.out.println("얼마에요?");
		Scanner scan = new Scanner(System.in);
		String won = scan.next();
		int won1 = Integer.parseInt(won);

		System.out.println(won + "원 입니다.");

		int price = 0;	

		if(1000<=won1){
			price = won1*8/10;
		}else if(500<=won1){
			price = won1*9/10;
		}else{
			price = won1;
		}

		System.out.println("몇개 드릴까요?");
		String num = scan.next();
		int num1 = Integer.parseInt(num);

		System.out.println(num + "개 주세요.");
		System.out.print("총 금액은 "+price*num1+"입니다.");
	}

}
