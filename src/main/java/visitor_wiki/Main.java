package visitor_wiki;

public class Main {

	public static void main(String[] args) {
		Document document = new Document();
		document.addDocumentPart(new PlainText("Hello world! "));
		document.addDocumentPart(new BoldText("Mijn naam is:"));
		document.addDocumentPart(new PlainText(" "));
		document.addDocumentPart(new HyperLink("Berend Wilkens", "www.hu.nl"));
		document.addDocumentPart(new PlainText("."));
		
		Visitor visitor = new HtmlVisitor();
		document.accept(visitor);
		System.out.println("Html:\n" + visitor.getOutput());
		visitor = new LatexVisitor();
		document.accept(visitor);
		System.out.println("Latex:\n" + visitor.getOutput());
	}

}
