package com.works.utils;

public class Action implements Runnable{

    String imgPath = "";
    public Action(String imgPath ) {
        this.imgPath = imgPath;
    }

    @Override
    public void run() {
        System.out.println("Start : " + imgPath);
        for( int i = 0; i<50; i++ ) {
            try {
                Thread.sleep(500);
            }catch (Exception ex) {}
            System.out.println("Update Image : " + imgPath);
        }
        System.out.println("End : " + imgPath);
    }

}