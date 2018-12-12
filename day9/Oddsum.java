package day9;
public class Oddsum {
	//odd 홀수
	//even 짝수
	//1부터 입력받은 숫자까지의 중에 홀수 합
	public String odd(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		return "홀수의 합 "+sum;
				
	}

}
