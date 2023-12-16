package org.campus02.documents;

public class Document {
    protected String fileName;
    protected int fileType;
    /*
        1 ... Textdateien
        2 ... Binärdateien
     */

    public Document(String fileName, int fileType) {
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public void printDocument(){
        System.out.println(fileName + " document >> no content");
    }

    public void printFileType() {
        if (fileType == 1) {
            System.out.println("Textdatei;");
        } else if (fileType == 2) {
            System.out.println("Binärdatei");
        } else {
            System.out.println("Unbekannte Datei");
        }
    }
}
