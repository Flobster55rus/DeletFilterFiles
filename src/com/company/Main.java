package com.company;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String direct="C:/test/";
        long sizeF=1024;
        File folder = new File(direct);
        String list[] = folder.list();
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
            File fileDel = new File(direct+list[i]);


            try{
                Image image = ImageIO.read(fileDel);
                if(image==null){fileDel.delete();}

                if(fileDel.length()<=sizeF){fileDel.delete();}


            }
            catch (IOException e){e.printStackTrace();}
        }


    }




}
