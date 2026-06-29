package Q2FactoryMethod;
import Q2FactoryMethod.FactoryMethodPatternExample.ExcelDocument;
import Q2FactoryMethod.FactoryMethodPatternExample.PdfDocument;
import Q2FactoryMethod.FactoryMethodPatternExample.WordDocument;
import Q2FactoryMethod.FactoryMethodPatternExample.Document;


// Main.java (The Client / Test Class)
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Word Document Generation ---");
        DocumentFactory wordFactory = new WordDocumentFactory();
        // Using the factory to get the document and interact with it
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.save();
        
        System.out.println("\n--- Testing PDF Document Generation ---");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        // Alternatively, using the creator's built-in processing method
        pdfFactory.processDocument();
        
        System.out.println("\n--- Testing Excel Document Generation ---");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.processDocument();
    }
} {
    
}
