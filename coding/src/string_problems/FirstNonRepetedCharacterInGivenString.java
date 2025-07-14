package string_problems;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

 public class FirstNonRepetedCharacterInGivenString {
	public static void main(String args[]) {
		String str = "hi shaheen";
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			  if(!map.containsKey(str.charAt(i))) {
				  map.put(str.charAt(i),1);
			  }
			  else {
				  map.put(str.charAt(i),map.get(str.charAt(i))+1);
			  }
		}
		
	  Character ch =' ';
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				ch = entry.getKey();
				break;
				
			}
			
		}
		System.out.println("First Non Repeated Character :"+ ch);

       Map<Character,Long> map1 =
    		          str.chars()
    		          .mapToObj(c->(char)(c))
    		          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map1);
		
		Optional<Character> map2 = str.chars().mapToObj(c->(char)(c))
				                .collect(Collectors
				               .groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				                .entrySet()
				                .stream()
				                .filter(c->c.getValue()==1)
				                .map(Map.Entry::getKey)
				                .findFirst();
		
		
		System.out.println(map2);
		
		
		
	}

}
