package lv0;

import java.util.Arrays;

// �迭 �ڸ���
public class test4 {
	
	public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

	// copyOfRange() �迭���� �������
}
