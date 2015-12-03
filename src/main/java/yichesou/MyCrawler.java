package yichesou;

import java.util.StringTokenizer;

import org.apache.hadoop.util.ToolRunner;
import org.apache.nutch.crawl.Crawler;
import org.apache.nutch.util.NutchConfiguration;

public class MyCrawler {
	public static void main(String[] args) throws Exception {
        String crawlArg = "urls -depth 3 -topN 5";
        String test = "";
        // Run Crawl tool
        try {
            ToolRunner.run(NutchConfiguration.create(), new Crawler(),
                    tokenize(crawlArg));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
    public static String[] tokenize(String str) {
        StringTokenizer tok = new StringTokenizer(str);
        String tokens[] = new String[tok.countTokens()];
        int i = 0;
        while (tok.hasMoreTokens()) {
            tokens[i] = tok.nextToken();
            i++;
        }
        return tokens;
    }
}
