package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		// 2. Set
		//Set은 방번호라는 개념이 없기때문에
		//반복문을 사용할때 향상된 반복문을 사용해주어야 한다.
		
		//정수형 관리-----------------------------------------
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		
		int i04 = 100;
		//int는 스택영역에 데이터형으로 존재함.(객체가 아님)
		//set타입은 객체의 주소를 배열에 넣는 방식임.
		//integer set에 int를 넣으면, 박싱이 되어 들어감.
		//int가 integer이 됨.
		Integer i05 = new Integer(13);
		Integer i06 = new Integer(17);
		
		Set<Integer> iSet = new HashSet<Integer>();
		//매개변수의 자료형은 클래스 형만 가능.
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);// 자동 박싱 : int타입의 변수를 Integer타입의 set에 넣을때 자동 박싱이 됨.
		// 숫자가 겹치는 객체가 들어가면 카운팅 되지 않음
		iSet.add(i05);
		iSet.add(i06);
		
		//향상된 반복문
		for(Integer no: iSet) {
			System.out.println(no.toString());
		}
		//배열에서 제거
		iSet.remove(i05);//Set에서 인덱스개념이 없기 때문에 변수 이름이나, Integer같은 경우 값을 적으면 지워짐.
		
		
		System.out.println("Size:"+iSet.size());
		System.out.println(iSet.toString());
		//출력결과로 산정해보아 넣는 순서와 출력 순서는 상관 없음을 알 수 있다
		//Set은 순서라는 개념이 없는거 같다.

		//Point 관리-----------------------------------------------
		System.out.println("=====================================");
		Point p01 = new Point(3,13);
		Point p02 = new Point(4,14);
		Point p03 = new Point(5,15);
		Point p04 = new Point(3,13);
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);// 필드값이 같은데도 중복되지 않음.
		for(Point i:pSet) {
			System.out.println(i.getX());
		}
		
		System.out.println("Size:"+pSet.size());
		System.out.println(pSet.toString());
		//배열에서 제거
		pSet.remove(p04);//3,13이런건 안됨.
	}

}
