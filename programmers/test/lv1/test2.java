package lv1;

// 수박수박수박수박수박수?
public class test2 {
	
	public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++){
            if( i % 2 == 0) {
                answer += "수";
            }
            
            if( i % 2 == 1) {
                answer += "박";
            }
        }
        
        return answer;
    }

}
