package lv0;

// ���̽��Ƹ޸�ī��
public class test9 {
	public int[] solution(int money) {
	        
	        // �䱸����
	        // �Ƹ޸�ī�� ���� 5500��
	        // 1. �Ӿ��̰� �ִ�� ���Ǽ��ִ� �Ƹ޸�ī�� �ܼ�
	        // 2. ���µ�
	        // 3. ������� �����迭
	        // 4. ��ȯ
	        
	        
	        int[] answer = new int[2];
	        
	        // 1. �Ӿ��̰� �ִ�� ���Ǽ��ִ� �Ƹ޸�ī�� �ܼ�
	        answer[0] = money / 5500;
	        
	        // 2. ���µ�
	        answer[1] = money % 5500;
	        
	        return answer;
	    }

}
