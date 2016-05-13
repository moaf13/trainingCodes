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
		
		System.out.println(convertToDecimal(total));
		
	}
	
	public static int convertToInt(String bin){
		int counter = 0;
		int value=0;
		while(counter < bin.length()){
			if(bin.charAt(bin.length()-1-counter) == '1'){
				value = value + powerOfTwo(counter);
				//System.out.println("poweroftwo: "+ powerOfTwo(counter));
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
		StringBuffer b = new StringBuffer();
	
		
		while(temp > 0){
			
				
		if(bin% 2 == 0){
			if(temp % 2 == 0){
				b.append("1");
			}else{
				b.append("0");
			}
		
		} else{
			if(temp % 2 == 0){
				b.append("0");
			}else{
				b.append("1");
			}
		
		}
		
			
			
			System.out.println("inside the loop: "+temp);
			temp = temp/2;
		}
		if(bin % 2 == 1){
			b.reverse();
		}
		
		
		return b.toString();
	}

	
}
