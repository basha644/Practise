package com.corestocky.collection.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo3 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,8,9,4,1,6,7,2,3,6);
		
		l.stream() // list object converts as stream 
		.sorted() // 
		.filter(fi->fi%2==0) // It filters the sorted object based on the logic
		.map(m->m*2) // It implemt the business logic for filtered one 
		.forEach(System.out::println); // Method reference it Iterate and prints the streamed object.
		
//		l.forEach(f-> System.out.println(f));  // It prints list on=bject
		
		Stream<Integer> stream1 = l.stream();
		
		Predicate<Integer>p=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				if(t%2==0)
					return true;
				else
					return false;
			}
			
		};
		Stream<Integer> stream2 = stream1.filter(p);
		
		Function f= new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				
				return t*2;
			}
		};
		
		Stream<Integer> stream3 = stream2.map(f);

//		Consumer c = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//			}
//		};
		stream3.forEach(c -> System.out.println());




	}
}
