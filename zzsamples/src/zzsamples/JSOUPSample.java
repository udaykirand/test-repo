package zzsamples;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.imaginea.crawler.util.Stopwatch;

public class JSOUPSample implements Runnable{

	@Override
	public void run() {
		Stopwatch timer = new Stopwatch();
		Document doc = Jsoup.connect(url).get();
		
		documents.add(doc);
		Elements allLinks = doc.select("a[href]");
		for (Element link : allLinks) {
			if (maxReq == -1 && url.contains("maven-users/201412")) {
				System.out.println(link);
			}
		}
		System.out.println(timer.elapsedTime());
		
	}

}
