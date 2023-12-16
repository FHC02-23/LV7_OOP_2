package org.campus02.documents;

public class ImageDocument extends Document {
    private int sizeX;
    private int sizeY;
    private String colour;

    public ImageDocument(String fileName, int sizeX, int sizeY, String colour) {
        super(fileName, 2);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.colour = colour;
    }

    @Override
    public void printDocument() {
        System.out.println("this is a image");
        System.out.println("fileName:" + fileName);
        System.out.println("sizeX = " + sizeX);
        System.out.println("sizeY = " + sizeY);
        System.out.println("colour = " + colour);
    }
}
