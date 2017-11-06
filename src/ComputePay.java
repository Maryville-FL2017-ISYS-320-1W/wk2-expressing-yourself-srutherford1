/**
Original:
public class ComputePay {
	public static void main(String[] args) {
		System.out.println("My total hours worked:");
		System.out.println(4 + 5 + 8 + 4);
		
		System.out.println("My hourly salary:");
		System.out.println("$8.75");
		
		System.out.println("My total pay:");
		System.out.println((4 + 5 + 8 + 4) * 8.75);
	}
}
**/
/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: Nov 5th, 2017
*/

public class ComputePay {
	public static void main(String[] args) {
		int hoursWorked = 4 + 5 + 8 + 4;
		double wages = 8.75;
		System.out.println("My total hours worked:");
		System.out.println(hoursWorked);

		System.out.println("My hourly salary:");
		System.out.println("$" + wages);

		System.out.println("My total pay:");
		System.out.println("$" + (hoursWorked) * wages);
	}
	/**
		Output:
				My total hours worked:
				21
				My hourly salary:
				$8.75
				My total pay:
				$183.75
	**/
}
