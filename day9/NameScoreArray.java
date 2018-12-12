package day9;

public class NameScoreArray {
	public String nsa(String[] names, int[] scores) {
		String res = "";
		for(int i=0;i<names.length;i++) {
			res += names[i]+" "+scores[i]+"\n";
		}
		return res;
	}

}
