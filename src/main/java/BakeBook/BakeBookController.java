package BakeBook;

import javafx.fxml.FXML;
import javafx.scene.image.Image;

import java.io.File;

public class BakeBookController {


    private File[] files;
    private Image[] images;
    int index;

    public Photos(){
        files = new File[4];
        images = new Image[4];
        index=0;
        setFilesAndImages();
    }
    public void setFilesAndImages(){
        files[0]= new File("src/main/resources/photoalbum/king_of_clubs2.png");
        files[1]= new File("src/main/resources/photoalbum/king_of_diamonds2.png");
        files[2]= new File("src/main/resources/photoalbum/king_of_hearts2.png");
        files[3]= new File("src/main/resources/photoalbum/king_of_spades2.png");

        for (int i = 0; i < images.length; i++) {
            images[i] = new Image(files[i].toURI().toString());

        }
    }
    //returns an image from array of images at specified index
    public Image getNextImage(){
        Image image= images[0];
        if(index<images.length){
            image = images[index];
            index++;
            if(index>=images.length){
                index=(images.length-1);
            }
        }
        return image;
    }
    public Image getPreviousImage(){
        Image image = images[index-1];
        if(index<= images.length){
            image= images[index-1];
            index--;
            if(index==0){
                index=1;
            }
        }
        return image;
    }
}





}