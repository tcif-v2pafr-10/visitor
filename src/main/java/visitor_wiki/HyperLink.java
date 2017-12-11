package visitor_wiki;

public class HyperLink extends DocumentPart {
	public HyperLink(String text, String url) {
		super(text);
		this.url = url;
	}

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toHTML() {
		// TODO Auto-generated method stub
		return "<a href=\"" + this.url + "\">" + this.text + "</a>";
	}

	@Override
	public String ToPlainText() {
		return this.text + " [" + this.url + "]";
	}

	@Override
	public String ToLatex() {
		return "\\href{" + this.url + "}{" + this.text + "}";
	}

}
