package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	private List<Integer> list = new ArrayList<>();

	public void addValue(Integer value) {
		list.add(value);
	}
	
	public Integer first() {
		if(list.isEmpty() || list.size()<=0) {
			throw new IllegalStateException("List is empty.");
		} 
		return list.get(0);
	}
	
	public void print() {
		System.out.println(list);
	}
}
