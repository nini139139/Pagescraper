import java.awt.Container;
import java.awt.print.Printable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.omg.CORBA.PUBLIC_MEMBER;


public class JsoupRun extends Base{
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Document d = Jsoup.connect("https://bugs.openjdk.java.net/browse/JDK-8049846").get();
		Elements ele = d.select("div");
		
		int i = 0;
		List<String> imgNamesList = new ArrayList<String>();
		List<String> linksList = new ArrayList<String>();
		Elements getAllDiv= ele.select("div");
		
		Base jsoup = new Base();
		
		List<List<String>> twoLists = jsoup.addToList(ele, imgNamesList, linksList);
		
		
		Set<String> imgNamesSet = new HashSet<String>(twoLists.get(0));
		System.out.println("Img srces:");
		jsoup.printImgnames(imgNamesSet);

		
		Set<String> linksSet = new HashSet<String>(twoLists.get(0));
		System.out.println("Links:");
		jsoup.printImgnames(linksSet);

	}

}
