package tool;

public class ClipboardTool {

    public static void main(String[] args) {

        PasteTool tool = new PasteTool();
        // tool.text = "this is text"; // private
        tool.path = "this is path"; // protected
        tool.directory = "this is dir"; // public
        tool.fileName = "this is fileName"; // no modifier

        PasteChildTool tool1 = new PasteChildTool();
        // tool1.text = "this is text"; // private
        tool1.path = "this is path"; // protected
        tool1.directory = "this is dir"; // public
        tool1.fileName = "this is fileName"; // no modifier
    }
}
