package org.campus02.documents;

public class TextDocument extends Document {

    private String content;

    public TextDocument(String fileName, String content) {
        super(fileName, 1);
        this.content = content;
    }

    @Override
    public void printDocument() {

        System.out.println(fileName + " >> " + content);
    }
}
