package org.campus02.documents;


import javax.print.Doc;
import java.util.ArrayList;

public class PrintManager {

    private ArrayList<Document> documents = new ArrayList<>();

    public void addDocument(Document d) {
        documents.add(d);
    }

    public void printAll() {
        for (Document d : documents) {
            d.printDocument();
        }
    }

    public Document findDocument(String fileName) {
        for (Document d : documents) {
            if (d.fileName.equals(fileName))
                return d;
        }

        // not found
        return null;
    }
}
