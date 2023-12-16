package org.campus02.documents;

public abstract class Document {
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

    public abstract void printDocument();

    public void printFileType() {
/*        if (fileType == 1) {
            System.out.println("Textdatei;");
        } else if (fileType == 2) {
            System.out.println("Binärdatei");
        } else {
            System.out.println("Unbekannte Datei");
        }*/

        switch (fileType) {
            case 1: /* if (fileType == 1) */
                System.out.println("TextDatei");
                break;
            case 2:
                System.out.println("Binärdatei");
                break;
            default:
                System.out.println("Unbekannte Datei");
        }

    }
}
