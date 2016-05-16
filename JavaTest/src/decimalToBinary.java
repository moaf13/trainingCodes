import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first binary Number: ");
		
		String firstNum = in.nextLine();
		
		System.out.println("Please enter the second binary number ");
		String secondNum = in.nextLine();
		
		int num1 = convertToInt(firstNum);
		System.out.print("num1:  " + num1+ "  , ");
		int num2 = convertToInt(secondNum);
		System.out.print("num2:  "+ num2+ "  ,  ");
		int total = num1 + num2;
		
		System.out.println("The Total is " +convertToDecimal(total));
		
	}
	
	public static int convertToInt(String bin){
		int counter = 0;
		int value=0;
	
		while(counter < bin.length()){
			
			if(bin.charAt(bin.length()-1-counter) == '1'){
				value = value + powerOfTwo(counter);
			}
			counter++;
		}
		return value;
	}
	
	public static int powerOfTwo(int pos){
		int resul = 1;
		for(int i = 0; i < pos; i++){
			resul = resul *2;
		}
		return resul;
	}

	public static String convertToDecimal(int bin){
		int temp = bin; 
		String reverCopy = "";
		String replacment = "";
		
		while(temp > 0){
			
			if(temp % 2 == 0){
				replacment = replacment + "0";
			}else{
				replacment = replacment + "1";
			}
			temp = temp/2;
		}
		
		
		for(int i = 0; i < replacment.length(); i++){
			reverCopy = reverCopy + replacment.charAt(replacment.length() - 1-i);
		}
	
		return reverCopy;
	}

}
