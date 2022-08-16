package Data_structure;

import java.io.File;

public class DirectoryRead {


    public static void traverse(File parentNode, String leftIndent) {
        if (parentNode.isDirectory()) {
            System.out.println(leftIndent + parentNode.getName());

            // Use left padding to create tree structure in the console output.
            leftIndent += "   ";

            File childNodes[] = parentNode.listFiles();
            for (File childNode : childNodes) {
                traverse(childNode, leftIndent);
            }
        } else {
            System.out.println(leftIndent + parentNode.getName());
        }
    }
    
    public static void main(String[] args) {
        // Folder that you want to traverse
        File inputFolder = new File("C:/Users/hp/Documents/UPPCL_Training");
        traverse(inputFolder, "");
    }

   

}