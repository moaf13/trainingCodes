package interfaces;

import java.util.*;

public class SampleOutput {

	 
	public static void main(String[] args){
		System.out.println("Please Enter a value : " );
	Scanner sc = new Scanner("()\n{})\n{}(){()}");
     
     Stack<String> st = new Stack(); 
    Stack<String> boolValue = new Stack<String>();
    		 System.out.println("()\n{})");
     while (sc.hasNextLine()) {
        String input=sc.next();
        System.out.println(input);
           //Complete the code
        if ( input.equals("") ) {
            break;
         }
         st.push(input);    
     }
      
     System.out.println(!st.empty());
     while(!st.empty()){
         String eachString = st.pop();
         System.out.println(eachString);
         int bracket =0,braces = 0, preten =0 ;
         for(int i =0; i < eachString.length(); i++){
             if(eachString.charAt(i) == '['){
                 bracket++;
             } else if (eachString.charAt(i) == '{') {
                 braces++;
             } else if (eachString.charAt(i) == '(') {
                 preten++;
             } else if (eachString.charAt(i) == ']') {
                 bracket--;
             } else if (eachString.charAt(i) == '}') {
                 braces--;
             } else if (eachString.charAt(i) == ')') {
                 preten--;
             }
         }

         
         if(bracket == 0 && braces == 0 && preten == 0){
            boolValue.push("true");
         } else{
             boolValue.push("false");
         }
         
     }
      
     while(!boolValue.empty()){
         System.out.println(boolValue.pop());
     }
	
	 
}
}

