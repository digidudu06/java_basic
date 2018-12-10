package day8;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		int[] grade = new int[limit];
		int[] rank = new int[limit];

		for(int a=0; a<grade.length ; a++) {
			int score = scanner.nextInt();
			grade[a]=score;
		}
		
		for(int i=0; i<grade.length;i++) {
			for(int j=1;j<grade.length;j++) {
				if(grade[i] > grade[j]) {
					rank[i] = grade[i];
				}else {
					rank[i] = grade[j];
				}
								
			}
			System.out.println(rank[i]);
		}
				
	}

}
