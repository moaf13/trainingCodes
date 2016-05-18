import static java.lang.System.*;

import java.util.*;

public class test {
 
	public static void main(String[] args){
		List<Map<String,Object>> sending = new ArrayList<Map<String,Object>>();
		Map<String,Object> eachValue = new HashMap();
		
		Object[] counter = new Object[2];
		counter[0] = 10;
		counter[1] = 9;
		eachValue.put("first", counter[0]);
		eachValue.put("whatEver", counter[1]);
		
		Map<String,Object> another = new HashMap();
		counter[0] = 55;
		counter[1] = 5;
		another.put("first", counter[0]);
		another.put("whatEver", counter[1]);
		
		Map<String,Object> yes = new HashMap();
		counter[0] = 11;
		counter[1] = 66;
		yes.put("first", counter[0]);
		yes.put("whatEver", counter[1]);
		
		
		Map<String,Object> no  = new HashMap();
		counter[0] = 33;
		counter[1] = 77;
		no.put("first", counter[0]);
		no.put("whatEver", counter[1]);
		
		
		sending.add(eachValue);
		sending.add(another);
		sending.add(yes);
		sending.add(no);
		
		//List<Map<String,Object>> sorted = sortedMap(sending);
		List<Map<String,Object>>  value = sortedMap(sending);
		int count =0;
		while(count < 2){
			
			System.out.println(value.get(count).get("first"));
			count++;
		}
		
	}
	
	
	//public static List<Map<String,Object>> sortedMap(List<Map<String,Object>> entry){
	public static List<Map<String,Object>> sortedMap(List<Map<String,Object>> entry){		
		int counter = 0; 
		List<Map<String,Object>> sorted = new ArrayList<Map<String,Object>>();
	
		while(counter < 2){
			int index = 0;
			int max =0;
			for(int i= 0; i < entry.size(); i++){
				int temp = (Integer) entry.get(i).get("first");;
				if(max < temp){
					max = temp;
					index = i;
				}
				
			}
			
			sorted.add(entry.get(index));
			entry.remove(index);
			counter++;
		}
	
		//System.out.println("It went in");
		return sorted;
		
	}


}


