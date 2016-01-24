package zzsamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter out = new PrintWriter("/home/udayd/test/" + new File("test" + ".html"));
		out.write("test");
		out.close();
	}

}
