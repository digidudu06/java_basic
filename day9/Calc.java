package day9;
public class Calc {
	public String calculation(int a, String op, int b) {
		
		int res = 0;
		
		switch(op){
		case "+": res = a+b; break;
		case "-": res = a-b;break;
		case "*": res = a*b; break;
		case "/": res = a/b;break;
		case "%": res = a%b;break;
		}
		return a+op+b+"="+res;
	}
}
