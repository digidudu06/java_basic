package day9;
import java.util.Scanner;
import day9.Calc;
import day9.Bmi;
import day9.ForDemo;
import day9.Gugudan;
import day9.LottoNumberGen;
import day9.NameArray;
import day9.NameArray2;
import day9.NameScoreArray;
import day9.Oddsum;
import day9.ScoreArrey;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴]\n"
					+ "0.종료\n"
					+ "1.계산기\n"
					+ "2.BMI\n"
					+ "3.ForDemo\n"
					+ "4.구구단\n"
					+ "5.로또\n"
					+ "6.이름 배열\n"
					+ "7.이름 배열2\n"
					+ "8.이름과 성적배열\n"
					+ "9.홀수 합\n"
					+ "10.등수");
			int select = scanner.nextInt();
			switch(select) {
			case 0: System.out.println("종료");return;
			case 1:
				Calc calc = new Calc();
				calc.calculation();
				break;
			case 2:
				Bmi bmi = new Bmi();
				bmi.bf();
				break;
			case 3:
				ForDemo forDemo = new ForDemo();
				forDemo.test();
				break;
			case 4: 
				Gugudan gugudan = new Gugudan();
				gugudan.test();
				break;
			case 5:
				LottoNumberGen gen = new LottoNumberGen();
				gen.test();
				System.out.println(" "); //메뉴를 다음줄로 바꾸기 위하여
				break;
			case 6:
				NameArray nameArray = new NameArray();
				nameArray.test();
				break;
			case 7:
				NameArray2 nameArray2 = new NameArray2();
				nameArray2.test();
				break;
			case 8: 
				NameScoreArray n = new NameScoreArray();
				n.nsa();
				break;
			case 9:
				Oddsum oddsum = new Oddsum();
				oddsum.odd();
				break;
			case 10:
				ScoreArrey scoreArrey = new ScoreArrey();
				scoreArrey.test();
				break;
			default : System.out.println("다시 입력해주세요.");break;
			}
		}
	}
}
