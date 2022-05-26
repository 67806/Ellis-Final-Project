package BakeBook;

import javafx.scene.image.Image;

import java.io.File;

public class BakeBook {
    private File[] files;
    private Image[] images;
    int index;

    public BakeBook(){
        files = new File[4];
        images = new Image[4];
        index=0;
        setFilesAndImages();
    }
    public void setFilesAndImages(){
        files[0]= new File("src/main/resources/BakeBook/6-chocolate-chip-cookies.png");
        files[1]= new File("src/main/resources/BakeBook/brownies.png");
        files[2]= new File("src/main/resources/BakeBook/apple-crumb-muffins-2.png");
        files[3]= new File("src/main/resources/BakeBook/Red-Velvet-Cupcakes-5-600x900.png");

        for (int i = 0; i < images.length; i++) {
            images[i] = new Image(files[i].toURI().toString());

        }
    }

    public Image getNextImage(){
        Image image= images[0];
        if(index<images.length-1&& index>=0){
            index++;
            image = images[index];
        }
        else{
            index=1;
        }
        return image;
    }

    public Image getPreviousImage(){
        Image image = images[4];
        if(index<= images.length&& index>0){
            index--;
            image = images[index];
            }
        else{
            index=10;
        }
        return image;
    }


}

