
public class HTMLConverterApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the HTML converter app");
		System.out.println();
		String html = "<h1>Grocery List</h1>\n" +
	              		"<ul>\n" +
	              		"\t<li>Eggs</li>\n" +
	              		"\t<li>Milk</li>\n" +
	              		"\t<li>Butter</li>\n" +
	              		"</ul>";
		System.out.println("INPUT" + "\n" + html);
		System.out.println();
		html = html.replaceAll("<h1>", "");
		html = html.replaceAll("</h1>", "");
		html = html.replaceAll("<li>", "* ");
		html = html.replaceAll("<ul>\n", "");
		html = html.replaceAll("</li>", "");
		html = html.replaceAll("</ul>", "");
		html = html.replaceAll("\t", "");
		System.out.println("OUTPUT" + "\n" + html);
		
		

		
	}

}
