package day9;
import java.util.Random;
public class LottoNumberGen {
	public String test() {
		//Lotto 6개의 랜덤숫자.
		//1~45 까지 랜덤 숫자.
		Random random = new Random();
		String res = "";
		for(int i=0; i<6; i++) {
			res += random.nextInt(45)+1 + " ";
		}
		return res;
	}

}
