package util;

// import tool.PasteTool;

public class NormalUtil {
    
    public static void main(String[] args) {
        
        tool.PasteTool tl = new tool.PasteTool();
        // tool.text = "this is text"; // private 
        // tool.path = "this is path"; // protected
        tl.directory = "this is dir"; // public
        // tool.fileName = "this is fileName"; // no modifier

        ChildUtil tool1 = new ChildUtil();
        // tool1.text = "this is text"; // private 
        // tool1.path = "this is path"; // protected
        tool1.directory = "this is dir"; // public
        // tool1.fileName = "this is fileName"; // no modifier
    }
}
