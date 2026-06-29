// DocumentFactory.java (The Creator Abstract Class)
package Q2FactoryMethod;

import Q2FactoryMethod.FactoryMethodPatternExample.ExcelDocument;
import Q2FactoryMethod.FactoryMethodPatternExample.PdfDocument;
import Q2FactoryMethod.FactoryMethodPatternExample.WordDocument;
import Q2FactoryMethod.FactoryMethodPatternExample.Document;

public abstract class DocumentFactory {
    
    public abstract Document createDocument();
    
    
    
}


class WordDocumentFactory extends DocumentFactory {
    @Override
    public  Document createDocument() {
        return new WordDocument();
    }
}


 class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

 class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}