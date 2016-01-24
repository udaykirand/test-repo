

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

public class Controller {
	public static void main(String[] args) throws Exception {
        String crawlStorageFolder = "/data/crawl/root";
        int numberOfCrawlers = 7;

        CrawlConfig config = new CrawlConfig();
        config.setMaxDepthOfCrawling(2);
        config.setCrawlStorageFolder(crawlStorageFolder);

        /*
         * Instantiate the controller for this crawl.
         */
        PageFetcher pageFetcher = new PageFetcher(config);
        RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
        RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
        CrawlController controller = new CrawlController(config, pageFetcher, robotstxtServer);

        /*
         * For each crawl, you need to add some seed urls. These are the first
         * URLs that are fetched and then the crawler starts following links
         * which are found in these pages
         */
        //controller.addSeed("http://mail-archives.apache.org/mod_mbox/maven-users/");
        controller.addSeed("http://www.ics.uci.edu/~adrianoc/");

        /*
         * Start t
         */
        
        controller.start(MyCrawler.class, numberOfCrawlers);
    }


}
