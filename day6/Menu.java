package day6;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴] \n0.종료 \n"
					+ "1.계산기 \n"
					+ "2.BMI \n"
					+ "3.윤년계산 \n"
					+ "4.주민번호 \n"
					+ "5.등수나가기");
			int select = scanner.nextInt();
			
			switch(select) {
			case 0: //종료
				System.out.println("종료");
				return; //break는 일시 정지, return은 작동 중지!!(자동차 키를 뽑는것과 동일!)
			
			case 1: //계산기
				System.out.println("수식을 입력하세요.\n0을 누르면 종료.");
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int res = 0;
				
				switch(op) {
				case "+": res = a+b; break;
				case "-": res = a-b; break;
				case "*": res = a*b; break;
				case "/": res = a/b; break;
				case "%": res = a%b; break;
				case "0": res = 00000; break;							
				}
				System.out.println("="+res);
				break;
			
			case 2: //BMI
				System.out.println("몸무게 : ");
				double w = scanner.nextDouble();
				System.out.println("키 : ");
				double h = scanner.nextDouble();
				
				double bmi = w/(h*h*0.0001);
				System.out.println("BMI : "+bmi);
				String bf = "";
				
				if(bmi>=40) {
					bf = "고도비만";
				}else if(bmi>=35) {
					bf = "중등도 비만";
				}else if(bmi>=30) {
					bf = "경도비만";
				}else if(bmi>=25) {
					bf = "과체중";
				}else if(bmi>=20) {
					bf = "정상";
				}else {
					bf = "저체중";
				}
				System.out.println(bf);
				break;
				
			case 3: //윤년
				System.out.println("년도 : ");
				int year = scanner.nextInt();
				String res3 = "";
				if((year%4==0 && year%100!=0)||year%400==0) {
					res3 = "윤년";
				}else {
					res3 = "평년";
				}
				System.out.println(res3);
				break;
				
			case 4: //주민번호
				System.out.println("이름과 주민번호 입력 : ");
				String name = scanner.next();
				String ssn = scanner.next();
				
				char ch = ssn.charAt(7);
				String gender = "";
				
				if(ch=='1' ||ch=='3') {
					gender = "납자";
				}else if(ch=='2' ||ch=='4') {
					gender = "여자";
				}else if(ch=='5' ||ch=='6') {
					gender = "외국인";
				}else {
					gender = "다시 입력하세요.";
				}
				System.out.println(gender);
				break;
				
			case 5: //등수
				System.out.println("이름    점수");
				String name1 = scanner.next();
				int f = scanner.nextInt();
				String name2 = scanner.next();
				int s = scanner.nextInt();
				String name3 = scanner.next();
				int t = scanner.nextInt();
				String grade = "";
				
				if(f>s && f>t) {
					if(s>t) {
						grade="1등:"+ name1
								+"\n2등:"+ name2 
								+"\n3등:"+ name3;
					}else {
						grade="1등:"+ name1
								+"\n2등:"+ name3 
								+"\n3등:"+ name2;
					}
				}else if(s>f && s>t) {
					if(f>t) {
						grade="1등:"+ name2
								+"\n2등:"+ name1 
								+"\n3등:"+ name3;
					}else {
						grade="1등:"+ name2
								+"\n2등:"+ name3
								+"\n3등:"+ name1;
					}
				}else {//t>f && t>s
					if(f>s) {
						grade="1등:"+ name3
								+"\n2등:"+ name1 
								+"\n3등:"+ name2;
					}else {
						grade="1등:"+ name3
								+"\n2등:"+ name2
								+"\n3등:"+ name1;
					}
				}
				System.out.println(grade);			
				break;
			}
		}
	}
}
