package day3;

import java.util.Scanner;

/**
[문제04] 다음 BMI  지수를 이용해서 비만 여부를 체크하는 프로그램입니다. 아래 정보를 이용해서 첨부된 결과처럼 보이도록 코딩을 완성하세요.

https://ko.wikipedia.org/wiki/%EC%B2%B4%EC%A7%88%EB%9F%89_%EC%A7%80%EC%88%98 (edited)
Wikipedia
체질량 지수
체질량 지수(體質量指數, Body Mass Index, BMI)는 인간의 비만도를 나타내는 지수로, 체중과 키의 관계로 계산된다.
키가 t 미터, 체중이 w 킬로그램일 때, BMI는 다음과 같다. (키의 단위가 센티미터가 아닌 미터임에 유의해야 한다.)
 */
public class Bmi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게 : ");
		double w = scanner.nextDouble();
		System.out.println("키 : ");
		double h = scanner.nextDouble();
		double bmi = 0.0;
		bmi = w/(h*h*0.0001);
		System.out.println("BMI : "+bmi);
		
		String res = "";
		if(40<=bmi){
			res = "고도비만";
		}else if(35<=bmi){
			res = "중등도 비만";
		}else if(30<=bmi){
			res = "경도비만";
		}else if(25<=bmi){
			res = "과체중";
		}else if(18.5<=bmi){
			res = "정상";
		}else{
			res = "저체중";
		}
		System.out.println(res);

	}

}
