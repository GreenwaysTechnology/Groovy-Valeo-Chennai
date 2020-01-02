package com.valeo.ds;

import java.util.HashSet;

public class SetImplJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> ins = new HashSet<>();
		ins.add(1);
		ins.add(1);
		ins.add(3);
		ins.add(2);
		ins.add(3);
		ins.add(4);

		for (Integer i : ins) {
			System.out.println(i);
		}

	}

}
