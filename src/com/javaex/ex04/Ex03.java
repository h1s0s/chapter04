package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		//로또 만들기-내가짠 코드
		Set<Integer> lSet = new HashSet<Integer>();
		
		while(true){
			if(lSet.size()==6) {
				break;	
			} 
			lSet.add((int)(Math.random()*45)+1);
			}
		for(int no:lSet) {
			System.out.print(no+"\t");
		}
	}	
}
