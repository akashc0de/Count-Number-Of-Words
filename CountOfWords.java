package mapInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sudalai sambar thala thala thalapathy";
		
		String[] ss= s.split(" ");
		
		TreeMap<String,Integer> tm=new TreeMap();
		
		for(String s1:ss) {
			if(tm.containsKey(s1)){
				tm.put(s1, tm.get(s1)+1);
			}
			else {
				tm.put(s1, 1);
			}
		}
		System.out.println(tm);
		
		Set<Map.Entry<String,Integer>> ss1=tm.entrySet();
		
		for(Map.Entry<String,Integer> s4:ss1) {
			if(s4.getValue()>1)
			System.out.println(s4.getKey() +" "+s4.getValue());
		}
		

	}

}
