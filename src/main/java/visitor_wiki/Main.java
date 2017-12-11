package visitor_wiki;

public class Main {

	public static void main(String[] args) {
		Document document = new Document();
		document.addDocumentPart(new PlainText("Hello world! "));
		document.addDocumentPart(new BoldText("Mijn naam is:"));
		document.addDocumentPart(new PlainText(" "));
		document.addDocumentPart(new HyperLink("Berend Wilkens", "www.hu.nl"));
		document.addDocumentPart(new PlainText("."));
		System.out.println(document.toHTML());
		System.out.println(document.toPlainText());
		System.out.println(document.toLatex());
	}

}
