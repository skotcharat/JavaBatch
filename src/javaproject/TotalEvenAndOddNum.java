package javaproject;
/**
 * For Array - 20,45,34,23,25,36,25... find total even and odd numbers
 * */
public class TotalEvenAndOddNum {

	public static void main(String[] args) {
		int num[] = {20,45,34,23,25,36,25};
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				sumEven += num[i];
				
			} else {
				sumOdd += num[i];
			
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);

	}

}
