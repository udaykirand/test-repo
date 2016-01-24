import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomTest {
public static void main(String[] s) throws UnsupportedEncodingException {
	StringBuilder sb = new StringBuilder();
	String o = RandomStringUtils.random(10, true, true);
	String p = RandomStringUtils.random(10, true, true);
	String q = RandomStringUtils.random(10, true, true);
/*	System.out.println(o);
	System.out.println(p);
	System.out.println(q);*/
	sb.append(o);
	sb.append("-");
	sb.append(p);
	sb.append("-");
	sb.append(q);
	String rnd = java.util.UUID.randomUUID().toString();
	System.out.println(rnd);
	String ecRnd = Base64.getEncoder().encodeToString(rnd.getBytes());
	System.out.println(ecRnd);
	/*System.out.println(RandomStringUtils.randomAscii(30));*/
	String ec = Base64.getEncoder().encodeToString(sb.toString().toLowerCase().getBytes());
	String dc = new String(Base64.getDecoder().decode(ecRnd.getBytes()), "utf-8");
	System.out.println(dc);
/*	System.out.println(ec);
	System.out.println(dc);
	System.out.println(sb.toString().toLowerCase());*/
}
}
