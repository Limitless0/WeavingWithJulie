package com.julie.weavingwithjulie;

import java.util.List;
import java.util.Locale;

public class Utils {

	public static boolean validateInput(String input) {
		if(input.isEmpty()) {
			return false;
		}
		List<Character> list = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p');
		for (int ii = 0; ii < input.length(); ii++) {
			if (!list.contains(input.toLowerCase().charAt(ii))) {
				return false;
			}
		}
		return true;
	}
}
