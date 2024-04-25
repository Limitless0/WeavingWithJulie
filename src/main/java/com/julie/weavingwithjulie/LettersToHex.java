package com.julie.weavingwithjulie;

import java.util.*;

public class LettersToHex {
	private Map<Character, Character> letterToHex = new HashMap<>();
	public static final char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};

	public void init() {
		char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		for (int ii = 0; ii < 16; ii++) {
			letterToHex.put(letters[ii], hex[ii]);
		}
	}

	public LettersToHex() {
		init();
	}

	public Integer translate(String input) {

		if (!Utils.validateInput(input)) {
			return 0;
		}
		return hexToBinary(rawLettersToHex(input));
	}

	private String rawLettersToHex(String input) {

		StringBuilder builder = new StringBuilder();
		for (int ii = 0; ii < input.length(); ii++) {
			char character = input.toLowerCase(Locale.ROOT).charAt(ii);
			builder.append(letterToHex.get(character));
		}
		System.out.println(builder.toString());
		return builder.toString();
	}

	private Integer hexToBinary(String input) {
		int num = HexFormat.fromHexDigits(input);
		System.out.println("hexy");
		System.out.println(Integer.toBinaryString(num));
		return HexFormat.fromHexDigits(input);
	}

}
