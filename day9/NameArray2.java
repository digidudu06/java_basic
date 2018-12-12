package day9;
public class NameArray2 {
	public String test() {
		String[] name = {"홍길동","유관순","이순신"}; //CPU를 자주 가지 않아도 되기 때문에 속도가 빠르다. String만 가능!
		String res = "";
		for(int i=0;i<name.length;i++) {
			if(i<name.length -1) {
				res += name[i]+",";
			}else {
				res += name[i];
			}
		}
		return res;
	}

}

