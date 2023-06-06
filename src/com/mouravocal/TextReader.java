package com.mouravocal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReader {
	public static List<String> read(String filePath) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			List<String> lines = new ArrayList<>();
			while ((line = reader.readLine()) != null) {
				if(line != "" || line != null) {
					lines.add(line);
				}
			}
			
			return lines;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
