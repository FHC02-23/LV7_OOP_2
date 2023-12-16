package org.campus02.documents;

import java.util.ArrayList;

public class CsvDocument extends Document{

    private ArrayList<String> lines;

    public CsvDocument(String fileName, ArrayList<String> lines) {
        super(fileName, 1);
        this.lines = lines;
    }

    public void addLine(String line) {
        lines.add(line);
    }

    @Override
    public void printDocument() {
        System.out.println("fileName = " + fileName);
        System.out.println("content >> ");

        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ": " + lines.get(i));
        }

        /*for(String line : lines) {
            System.out.println(line);
        }*/
    }
}
