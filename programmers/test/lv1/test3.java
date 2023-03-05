package lv1;

//짝수와 홀수
public class test3 {
	
	 public String solution(int num) {
	        String answer = "";
	        
	        if( num % 2 == 0){
	            answer = "Even";
	        }else{
	            answer ="Odd";
	        }
	        
	        
	        return answer;
	    }

	 
	 // 삼항연산자로 코드작성하면 짧다..! 조건 ? 참 : 거짓
	 // return (num % 2 == 0) ? "Even" : "Odd";
}
