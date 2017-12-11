package visitor_wiki;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private List<DocumentPart> documentParts = new ArrayList<DocumentPart>();

	public List<DocumentPart> getDocumentParts() {
		return documentParts;
	}

	public void setDocumentParts(List<DocumentPart> documentParts) {
		this.documentParts = documentParts;
	}

	public void addDocumentPart(DocumentPart documentPart) {
		documentParts.add(documentPart);
	}

	public void accept(Visitor visitor) {
		for (DocumentPart part : this.getDocumentParts()) {
			part.accept(visitor);
		}
	}
}
