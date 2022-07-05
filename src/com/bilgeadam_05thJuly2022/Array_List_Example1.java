package com.bilgeadam_05thJuly2022;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Example1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ankara");
		list.add("Bursa");
		list.add("Antalya");
		list.add("Artvin");
		list.add("Erzurum");

		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).startsWith("An")) {
//				list.add(i + 1, "--------");
//			}
			if (list.get(i).startsWith("An")) {
//				list.remove(i);
//				list.add(i, "xxx");
				list.set(i, "xxx");
			}
		}
		for (String string : list) {
			System.out.println(string);
		}

	}

}
