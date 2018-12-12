package day9;
public class Bmi {
	public String bf(double w,double h) {
	
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
		return res;
		
		
	}

}
