package visitor_wiki;

public class HyperLink extends DocumentPart {
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

}
