package lv1;


// �� ���� ������ ��
public class test4 {
	
	  public long solution(int a, int b) {
	        long answer = 0;
	        
	        
	        // �ִ�, �ּڰ����ϱ�
	        int max = Math.max(a,b);
	        int min = Math.min(a,b);
	        
	        // �ִ� �ּڰ� ������ �� ���ϱ�
	        for(int i= min; i<=max; i++){
	            answer += i;
	        }
	        
	        return answer;
	    }

}
