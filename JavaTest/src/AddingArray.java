import java.util.Scanner;

public class AddingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please provide the amount of number being added " );
		System.out.println("the number has be less than " + Integer.MAX_VALUE);
		System.out.println("greater than zero" );
		System.out.print("Length of the Array: ");
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int counter = num, i=0;
		int[] value = new int[num];
		int total = 0; 
		while(counter > 0){
			System.out.println("Please enter the value: ");
			num = input.nextInt();
			value[i]= num;
			total = num+total;
			i++;
			counter--;
		}
		
		System.out.println("Total is: " + total);
	}

}
