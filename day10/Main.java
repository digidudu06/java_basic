package day10;
import java.util.Scanner;
import day9.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴]\n"
					+ "0.종료\n"
					+ "1.BMI\n"
					+ "2.계산기\n"
					+ "3.시퀀스 합\n"
					+ "4.구구단\n"
					+ "5.로또\n"
					+ "6.이릅 배열\n"
					+ "7.이름 배열2\n"
					+ "8.이름 성적 배열\n"
					+ "9.홀수 합\n"
					+ "10.점수 배열\n"
					+ "11.성별체크\n");
			switch(scanner.next()) {
			case "0" : System.out.println("종료"); return;
			case "1" :
				Bmi bmi = new Bmi();
				
				System.out.println("몸무게와 키 순으로 입력");
				System.out.println(bmi.bf(
						scanner.nextDouble(),
						scanner.nextDouble()));
				break;
			case "2":
				Calc calc = new Calc();
				System.out.println("연산식을 입력하세요.");
				System.out.println(calc.calculation
						(scanner.nextInt(),
						scanner.next(),
						scanner.nextInt()));
				break;
			case "3" :
				Sequence seq = new Sequence();
				System.out.println("1~n까지의 합 \nn의값 입력.");
				System.out.println(seq.test(scanner.nextInt()));
				break;
			case "4" : 
				Gugudan gugudan = new Gugudan();
				System.out.println("몇 단을 계산할까요?");
				System.out.println(gugudan.test
						(scanner.nextInt()));
				break;
			case "5" : 
				LottoNumberGen lotto = new LottoNumberGen();
				System.out.println(lotto.test());
				break;
			case "6" :
				NameArray namearr = new NameArray();
				System.out.println(namearr.test());
				break;
			case "7" :
				NameArray2 namearr2 = new NameArray2();
				System.out.println(namearr2.test());
				break;
			case "8" :
				NameScoreArray arr = new NameScoreArray();
				System.out.println("학생수 몇 명?");
				int count = scanner.nextInt();
				System.out.println("이름   점수");
				String[] names = new String[count];
				int[] scores = new int[count];
				for(int i=0;i<names.length;i++) {
					names[i] = scanner.next();
					scores[i] = scanner.nextInt();
				}
				System.out.println(arr.nsa(names,scores));
				break;
			case "9" :
				Oddsum oddsum = new Oddsum();
				System.out.println("1부터 n까지의 홀수의 합 \n"
						+ "n의 값을 입력해주세요.");
				System.out.println(oddsum.odd(scanner.nextInt()));
				break;
			case "10" : 
				ScoreArrey scorearr = new ScoreArrey();
				System.out.println("몇 명의 성적을 입력하시겠습니까?");
				int a = scanner.nextInt();
				int[] score = new int[a];
				System.out.println(a+"명의 점수를 입력해주세요.");
				
				String res = "";
				for(int i=0;i<score.length;i++) {
					score[i] = scanner.nextInt();		
					if(i<score.length-1) {
						res += score[i]+", ";
					}else {
						res += score[i];
					}
				}
				System.out.println(scorearr.test(score));
				break;
			case "11" : 
				GenderCheck checker = new GenderCheck();
				System.out.println("이름.");
		        System.out.println("주민등록번호");
				System.out.println(checker.check
						(scanner.next(),
						scanner.next()));
				break;
			}
		}

	}

}
