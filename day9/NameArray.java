package day9;

public class NameArray {
	public void test() {
		String[] name = new String[3];
		name[0] = "홍길동";
		name[1] = "유관순";
		name[2] = "이순신";
		String res = "";
		for(int i=0;i<3;i++) {
			if(i<=1) {
				res += name[i]+",";
			}else {
				res += name[i];
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		NameArray nameArray = new NameArray();
		nameArray.test();
		
	}

}
