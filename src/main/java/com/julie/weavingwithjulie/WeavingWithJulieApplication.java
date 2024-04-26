package com.julie.weavingwithjulie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;

@SpringBootApplication
@RestController
public class WeavingWithJulieApplication {

	private final LettersToHex translationBuddy;

	public WeavingWithJulieApplication () {
		this.translationBuddy = new LettersToHex();
	}

	public static void main(String[] args) {
		SpringApplication.run(WeavingWithJulieApplication.class, args);
	}

	@GetMapping("/input")
	ModelAndView inputView () {
		return new ModelAndView("../static/index");
	}

	@PostMapping(value = "/codeIn")
	void codeIn(@RequestBody String input) {
		System.out.println(input);
		System.out.println(translationBuddy.translate(input));
	}
}

/*

void filestuff() throws IOException {
File wordlist = new File("/Users/abanoubiskander/Downloads/words_alpha.txt");
		File output = new File("/Users/abanoubiskander/IdeaProjects/weavingWithJulie/src/main/resources/static/out6.txt");
		if (!output.exists()) {
			try {
				System.out.println(output.createNewFile());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileWriter writer = new FileWriter(output);
		Scanner scanner = new Scanner(wordlist);
		while (scanner.hasNext()) {
			String temp = scanner.next();
			if (temp.length() == 6) {
				if (Utils.validateInput(temp)) {
					writer.write(temp);
					writer.write("\n");
				}
			}
		}
	}


 */

//4 * 8char blocks followed by 2* 6char blocks