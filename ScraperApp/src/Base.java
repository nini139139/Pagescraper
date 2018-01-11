import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Base {

	public  List<List<String>> addToList(Elements divs, List<String>srces, List<String>hrefs ) {
		for(Element element : divs){
			if(!element.select("img").attr("src").isEmpty() && !(element.select("a").attr("href").isEmpty())){
				srces.add(element.select("img").attr("src"));
				if(!element.select("a").attr("href").equals("#")){
					hrefs.add(element.select("a").attr("href"));
				}
			}
		};
		
		List<List<String>> result = new ArrayList<List<String>>();
		result.add(srces);
		result.add(hrefs);
		return result;
	}
	
	
	public void printImgnames(Set<String> imgName) {
	    int i=0;
		for(String img : imgName){
			i++;
			System.out.println(i+") "+img);
		}
	}
	
}
