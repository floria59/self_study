package lv0;

//�Ӿ��̺��� Ű ū ���
public class test7 {
	
	public int solution(int[] array, int height) {
        int answer = 0;
        
        
        for( int i =0; i< array.length; i++){
            if(array[i] > height){
                answer++;
            }
        }
        
        
        return answer;
    }

}