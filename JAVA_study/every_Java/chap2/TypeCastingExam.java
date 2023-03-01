package chap2;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
        long y = x;
        System.out.println(y);
        
        long x2 = 5;
        int y2 = (int) x2;
        System.out.println(y2);
        
        int intValue = 200;
        long longValue = intValue;               
        System.out.println(longValue);
        
        long longValue2 = 20;
        int intValue2 = (int) longValue2;                      
        System.out.println(intValue2);

	}

}
