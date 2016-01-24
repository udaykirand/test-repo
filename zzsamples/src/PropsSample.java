
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropsSample {
  public static void main(String[] args) {
System.out.println(args.length);
	Properties prop = new Properties();
	InputStream input = null;

	try {

		input = new FileInputStream("/home/udayd/workspace/zzsamples/bin/input");

		// load a properties file
		prop.load(input);

		// get the property value and print it out
		System.out.println(prop.getProperty("url.to.parse"));
		System.out.println(prop.getProperty("dbuser"));
		System.out.println(prop.getProperty("dbpassword"));

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

  }
}
