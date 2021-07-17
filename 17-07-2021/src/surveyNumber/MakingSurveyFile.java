package surveyNumber;
import java.io.*;
import java.util.Scanner;

public class MakingSurveyFile {
	public static void main(String[] args) throws IOException {
		BufferedWriter br = new BufferedWriter(new FileWriter("G:\\Beehyv\\number.txt"));
		Scanner scn = new Scanner(System.in);
		int[] response = {1, 3, 4, 5, 8, 4, 9};
		for(int i=0; i<response.length; i++) {
			try{
				br.write(response[i]+"\n");
			}catch(IOException e) {
				System.out.println(e);
			}
		}
		try {
			br.close();
		}catch(IOException e){
			System.out.print(e);
		}
	}

}
