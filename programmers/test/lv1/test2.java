package lv1;

// ���ڼ��ڼ��ڼ��ڼ��ڼ�?
public class test2 {
	
	public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++){
            if( i % 2 == 0) {
                answer += "��";
            }
            
            if( i % 2 == 1) {
                answer += "��";
            }
        }
        
        return answer;
    }

}
