package lv0;

//옷가게 할인 받기
public class test8 {

	 public int solution(int price) {
	        int answer = 0;
	        
	        if( price >= 500000) {
	            answer = (int)(price*0.8);
	        } else if( price >= 300000){
	            answer = (int)(price * 0.9);
	        }else if (price >= 100000){
	            answer = (int)(price * 0.95);
	        } else {
	            answer = price;
	        }
	        
	        return answer;
	    }
	
	
}
