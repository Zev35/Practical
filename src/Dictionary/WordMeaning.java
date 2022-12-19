package Dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class WordMeaning {

	public static void main(String[] args) throws IOException {

		String path = "data.properties";
		doesFileExist(path);

	}

	public static void doesFileExist(String path) throws IOException {

		Properties prop = new Properties();
		File f = new File(path);

		FileReader fr = new FileReader(f);
		prop.load(fr);

		String meaning1 = prop.getProperty("Apple");
		System.out.println("Apple:-");
		String[] word1 = meaning1.split(",");
		System.out.println(word1[0]);
		System.out.println(word1[1]);

		System.out.println();

		String meaning2 = prop.getProperty("Table");
		System.out.println("Table:-");
		String[] word2 = meaning2.split(",");
		System.out.println(word2[0]);
		System.out.println(word2[1]);

	}
}