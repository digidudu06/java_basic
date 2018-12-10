package day9;
import java.util.Scanner;
public class ScoreArrey {
	public void test() {
		//정수 3개를 입력 받아라.
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("3명의 점수를 입력하세요.");
//		int a = scanner.nextInt();		
//		int b = scanner.nextInt();		
//		int c = scanner.nextInt();
//		int[] score = {a,b,c};
//		String res = "";
//		for(int i=0;i<score.length;i++) {
//			if(i<score.length-1) {
//				res += score[i]+",";
//			}else {
//				res += score[i];
//			}
//			
//		}
//		System.out.println(res);
		
//		
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
//		System.out.println(res);
		int[] rank = new int[a];
		for(int i=0;i<score.length-1;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i]<score[j]) {
					int t = score[i];
					score[i] = score[j];
					score[j] = t;
				}
			}
		}
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);			
		}
		
	}
	public static void main(String[] args) {
		ScoreArrey scoreArrey = new ScoreArrey();
		scoreArrey.test();
	}

}
