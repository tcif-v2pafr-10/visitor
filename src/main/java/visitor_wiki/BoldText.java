package visitor_wiki;

public class BoldText extends DocumentPart {

	public BoldText(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toHTML() {
		return "<b>" + this.text + "</b>";
	}

	@Override
	public String ToPlainText() {
		return "**" + this.text + "**";   
	}

	@Override
	public String ToLatex() {
		return "\\textbf{" + this.text + "}";
	}

}
