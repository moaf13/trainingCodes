import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first binary Number: ");
		
		String firstNum = in.nextLine();
		
		System.out.println("Please enter the second binary number ");
		String secondNum = in.nextLine();
		
		boolean rem = false;
		boolean less = true;
		int length = 0;
		String longest = "";
		String shortest = "";
		StringBuilder tot = new StringBuilder();
		if(firstNum.length() < secondNum.length()){
			length = secondNum.length();
			longest = secondNum;
			shortest = firstNum;
		} else{
			length = firstNum.length();
			shortest = secondNum;
			longest = firstNum;
		}
		
		int i = length-1;
		while (i >= 0){
			
			if(shortest.length() > i){
							
				if(longest.charAt(i) == shortest.charAt(i) && (longest.charAt(i) == '1')){
					if(rem){
						tot.append("1");
						rem = true;
					} else{
						rem = true;
						tot.append("0");
					}
					
				} else if(longest.charAt(i) == shortest.charAt(i) && (longest.charAt(i) == '0')){
					if(rem){
						tot.append("1");
						rem = false;
					}else{
						tot.append("0");
						rem = false;
					}
					
				} else{
				
					if(rem){
						tot.append("0");
						rem = true;
					} else{
						tot.append("1");
						rem = false;
					}
				}
				
				
				
				
				
			} else{
				
				if(longest.charAt(i) == '1'){
					if(rem){
						tot.append("0");
						rem = true;
					}else{
						tot.append("1");
					}
				} else{
					if(rem){
						tot.append("1");
						rem = false;
					}else{
						tot.append("0");
					}
				}
				
			}
		}
		if(rem){
			tot.append("0");
		}
		
		System.out.println("The total is : "+ tot.reverse());
		
		
	
	}


}


