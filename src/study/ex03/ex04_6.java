package study.ex03;

public class ex04_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i = 1; i <=5; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
				if( k == i ) {
					System.out.println();
				}
			}
		}

	}

}
