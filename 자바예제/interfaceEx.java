package com.example.javatest;


interface parseable {
    public abstract void parse(String fileName);
}

class parserManager {
    public static parseable getParser (String type) {
        if (type.equals("XML")) {
            return new XMLparser();
        } else {
            parseable p = new HTMLparser();
            return p;
        }
    }
}

class XMLparser implements parseable {
    public void parse (String fileName) {
        System.out.println(fileName + "-XML paring completed");
    }
}

class HTMLparser implements parseable {
    public void parse (String fileName) {
        System.out.println(fileName + "-HTML parsing completed");
    }
}

class parserTest {
    public static void main(String args[]) {
        parseable parser = parserManager.getParser("XML");
        parser.parse("document.xml");
        parser.parse("document2.html");
    }
}
