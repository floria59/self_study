package lv0;

import java.util.Arrays;

// 배열 자르기
public class test4 {
	
	public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

	// copyOfRange() 배열복사 사용하자
}
