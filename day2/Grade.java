package day2;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		System.out.println("이름");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		System.out.println("국영수사과 순으로 점수 입력");
		String kor = scan.next();
		String eng = scan.next();
		String mat = scan.next();
		String soc = scan.next();
		String sci = scan.next();

		int k = Integer.parseInt(kor);
		int e = Integer.parseInt(eng);
		int m = Integer.parseInt(mat);
		int so = Integer.parseInt(soc);
		int sc = Integer.parseInt(sci);

		int sum = k+e+m+so+sc;
		int arg = sum/5;
		String grade;

		if(100<arg){
			grade = "오류";
		}else if(90<=arg){
			grade = "A";
		}else if(80<=arg){
			grade = "B";
		}else if(70<=arg){
			grade = "C";
		}else if(60<=arg){
			grade = "D";
		}else if(50<=arg){
			grade = "E";
		}else{
			grade = "F";
		}

		System.out.print(name + " 총점 "+ sum +"점 "+"평균 "+ arg +"점 "+"성적 "+ grade +"학점");
	 

	}

}
