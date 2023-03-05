package lv0;

//머쓱이보다 키 큰 사람
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
