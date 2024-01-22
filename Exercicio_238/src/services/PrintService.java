package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty() || list.size()<=0) {
			throw new IllegalStateException("List is empty.");
		} 
		return list.get(0);
	}
	
	public void print() {
		System.out.println(list);
	}
}
