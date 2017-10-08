package com.ctci.StringAndArray;

public class IsUnique {

	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String str : words) {
			System.out.println(str + " -> "+IsUnique(str));
		}
	}
	public static boolean IsUnique(String str){
		boolean[] char_set = new boolean[128];
		
		if(str.length()>128){
			return false;
		}
		for (int i = 0; i <str.length(); i++) {
			int value = str.charAt(i);
			if(char_set[value]) return false;
			char_set[value] = true;
		}
		return true;
	}
	

}
