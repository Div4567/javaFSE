package Q2FactoryMethod;


public class FactoryMethodPatternExample {// Document.java (The Product Interface)
public interface Document {
    void open();
    void save();
}


public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document (.docx)...");
    }

    @Override
    public void save() {
        System.out.println("Saving Word Document...");
    }
}
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document (.pdf)...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF Document...");
    }
}


public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document (.xlsx)...");
    }

    @Override
    public void save() {
        System.out.println("Saving Excel Document...");
    }
}
    
}
