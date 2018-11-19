package Chapter_08_Recursion_and_Dynamic_Programming;

import java.util.HashSet;
import java.util.Set;

/**
 * <b>Power Set:</b> Write a method to return all subsets of a set. 
 */
public class PowerSet {

	public static <T> Set<Set<T>> getPowerSet(Set<T> originalSet) {
		Set<Set<T>> powerSet = new HashSet<>();
		
		originalSet.forEach(element->{
			Set<T> newSet = new HashSet<>(originalSet);
			newSet.remove(element);
			powerSet.add(newSet);
			powerSet.addAll(getPowerSet(newSet));
		});
		
		return powerSet ;
	} 
	
	
	
}
