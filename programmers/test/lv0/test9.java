package lv0;

// 아이스아메리카노
public class test9 {
	public int[] solution(int money) {
	        
	        // 요구사항
	        // 아메리카노 한잔 5500원
	        // 1. 머쓱이가 최대로 마실수있는 아메리카노 잔수
	        // 2. 남는돈
	        // 3. 순서대로 담은배열
	        // 4. 반환
	        
	        
	        int[] answer = new int[2];
	        
	        // 1. 머쓱이가 최대로 마실수있는 아메리카노 잔수
	        answer[0] = money / 5500;
	        
	        // 2. 남는돈
	        answer[1] = money % 5500;
	        
	        return answer;
	    }

}
