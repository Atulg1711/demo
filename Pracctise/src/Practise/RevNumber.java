package Practise;

public class RevNumber {

	public static void main(String[] args) {
		int i = 1234;
		int count = 0;
		int rev;
		while (i != 0) {

			rev = i % 10;
			System.out.println(rev);
			
			count= rev+count*10;
			i = i / 10;
		

		}
		System.out.println(count);

	}

}
