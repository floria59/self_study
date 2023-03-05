package lv1;


// 두 정수 사이의 합
public class test4 {
	
	  public long solution(int a, int b) {
	        long answer = 0;
	        
	        
	        // 최댓값, 최솟값구하기
	        int max = Math.max(a,b);
	        int min = Math.min(a,b);
	        
	        // 최댓값 최솟값 사이의 수 더하기
	        for(int i= min; i<=max; i++){
	            answer += i;
	        }
	        
	        return answer;
	    }

}
