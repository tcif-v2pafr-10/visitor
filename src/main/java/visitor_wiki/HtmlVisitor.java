package visitor_wiki;

public class HtmlVisitor implements Visitor {
	private String output = "";
	@Override
	public void visit(PlainText documentPart) {
		this.output += documentPart.getText();
	}

	@Override
	public void visit(BoldText documentPart) {
		this.output += "<b>" + documentPart.getText() + "</b>";

	}

	@Override
	public void visit(HyperLink documentPart) {
		this.output += "<a href=\"" + documentPart.getUrl() + "\">" + documentPart.getText() + "</a>";
	}

	public String getOutput() {
		return output;
	}

}
