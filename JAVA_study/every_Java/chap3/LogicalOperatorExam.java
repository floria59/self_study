package chap3;

public class LogicalOperatorExam {

	public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;
        // 이 아랫줄을 수정하세요.
        if( age <= 19 || age >= 60 ) {
            isDiscount = true;
        }else{
            isDiscount = false;
        }
    
    return isDiscount; // 결과 테스트를 위한 코드입니다.
    }

    // 이 아래는 실행을 위한 코드입니다. 수정하지 마세요.
    public static void main(String[]args) {
        LogicalOperatorExam exam = new LogicalOperatorExam();
        System.out.println(exam.isAgeDiscountable(15));
        System.out.println(exam.isAgeDiscountable(27));
        System.out.println(exam.isAgeDiscountable(61));
    }
}
