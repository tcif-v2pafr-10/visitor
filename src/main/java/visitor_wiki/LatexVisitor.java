package visitor_wiki;

public class LatexVisitor implements Visitor {
	private String output = "";   
	
	@Override
	public void visit(PlainText documentPart) {
		this.setOutput(this.getOutput() + documentPart.getText());
		
	}
	@Override
	public void visit(BoldText documentPart) {
		this.setOutput(this.getOutput() + "\\textbf{" + documentPart.getText() + "}"); 
		
	}
	@Override
	public void visit(HyperLink documentPart) {
		this.setOutput(this.getOutput() + "\\href{" + documentPart.getUrl() + "}{" + documentPart.getText() + "}");
		
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	} }