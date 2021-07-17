package surveyNumber;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("G:\\Beehyv\\number.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\\\Beehyv\\output.txt"));
		Scanner scn = new Scanner(br);
		int c;
		while((c = br.read()) != -1) {
			bw.write(c);
		}
		bw.close();
		br.close();
	}

}
