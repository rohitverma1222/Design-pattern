package BehavioralDesignPatterns.TemplateDesignPattern;

abstract class DataParser {
    void parse() {
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile() {
        System.out.println("Open file");
    }

    protected void closeFile() {
        System.out.println("Close file");
    }

    protected abstract void parseData();
}
class CSVParser extends DataParser {
    @Override
    protected void parseData() {
        System.out.println("Parse CSV data");
    }
}

class TextParser extends DataParser {
    @Override
    protected void parseData() {
        System.out.println("Parse text data");
    }
}

public class TemplatePattern {
    //used to avoid code duplication
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parse();

        DataParser textParser = new TextParser();
        textParser.parse();
    }
}
