package lv0;

// �迭 �ι� �����
class test1 {
    public int[] solution(int[] numbers) {
        
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}