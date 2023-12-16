package org.campus02.documents;

import javax.print.Doc;
import java.util.ArrayList;

public class DemoDocumentsApp {

    public static void main(String[] args) {

        TextDocument textDocument = new TextDocument("text.txt", "Lorem Ipsum ...");
        ImageDocument image = new ImageDocument("image.png", 480, 360, "red");

        textDocument.printFileType();
        //image.printFileType();

        ArrayList<String> someLines = new ArrayList<>();
        someLines.add("Susi;Sorglos;37");
        someLines.add("Max;Mustermann;21");
        someLines.add("John;Doe;81");

        CsvDocument csvDocument = new CsvDocument("ages.csv", someLines);
        csvDocument.addLine("Manfred;Mann;41");

        PrintManager pm = new PrintManager();
        pm.addDocument(textDocument);
        pm.addDocument(image);
        pm.addDocument(csvDocument);

        System.out.println("----- printAll -----");
        pm.printAll();

        System.out.println("----- findDocument -----");
        Document d = pm.findDocument("text.txt");
        System.out.println(d.fileName);
        d.printDocument();



        //Document d = new Document("asdf.pdf", 2);

    }
}
