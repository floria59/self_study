package lv0;

// �迭 ������ ����
public class test2 {
	
	public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int length = strlist.length;
        
        for ( int i = 0; i < length; i ++){
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }

}
