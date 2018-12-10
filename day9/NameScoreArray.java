package day9;
import java.util.Scanner;
public class NameScoreArray {
	public void nsa() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생수 몇 명?");
		int count = scanner.nextInt();
		String[] names = new String[count];
		int[] scores = new int[count];
//		int iter = 0;
			System.out.println("[종료 0, 진행 1] 학생이름, 점수를 입력하세요.");
			int flag = scanner.nextInt();
			
			switch(flag){
			case 0:System.out.println("종료"); return;
			case 1: 
				for(int i=0;i<names.length;i++) {
					names[i] = scanner.next();
					scores[i] = scanner.nextInt();
				}
				for(int i=0;i<names.length;i++) {
					System.out.println(names[i]+" "+scores[i]);
				}
				break;
			default: System.out.println("잘 못 입력하셨습니다.");break;
			}
/*			if(!flag.equals("0") && iter != count) {
				names[iter] = scanner.next();
				scores[iter] = scanner.nextInt();
				iter++;				
			}else {
				System.out.println("종료");	
				for(int i=0; i<names.length; i++) {
					System.out.println(names[i]+":"+scores[i]);
				}
			}*/
		
	}

}
