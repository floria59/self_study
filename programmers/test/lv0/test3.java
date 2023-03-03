package lv0;

// 문자열 뒤집기
public class test3 {

    public String solution(String my_string) {
        String answer = "";
        
        for(int i = my_string.length() -1; i >=0; i--){
            answer += my_string.substring(i, i+1);
        }
        
        return answer;
        
    }
    
    
}
