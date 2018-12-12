package day9;

public class ScoreArrey {
	public String test(int[] score) {
		//정수 3개를 입력 받아라.		

		for(int i=0;i<score.length-1;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i]<score[j]) {
					int t = score[i];
					score[i] = score[j];
					score[j] = t;
				}
			}
		}
		System.out.println("등수");
		String res = "";
		for(int i=0;i<score.length;i++) {
			res += (i+1)+"등 "+score[i]+"\n";			
		}
		return res;
	}

}
