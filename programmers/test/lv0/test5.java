package lv0;


// 배열 뒤집기
public class test5 {
	
	 public int[] solution(int[] num_list) {
		 
		 int[] answer = new int[num_list.length];
	        
	     for(int i = 0; i<num_list.length; i++){
	         answer[i]= num_list[num_list.length-i-1];
	     }
	     
	     
	     return answer;
	    
	 }
}

