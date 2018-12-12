package day9;

public class GenderCheck {
	public String check(String name,String num) {
        

        char ch = num.charAt(7);
        String result = ""; 

        if(ch=='1'||ch=='3'){
            result = "남자";
        }else if(ch=='2'||ch=='4'){
            result = "여자";
        }else if(ch=='5'||ch=='6'){
            result = "외국인";
        }else {
            result = "다시 입력하세요.";
        }
        return result;

	}
}
