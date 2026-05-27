package com.learn.spring.lld.decoratorpattern;

/**
 * TODO: Task 2 - Implement the ImageEditor interface to simply reads and return the image without any modifications.
 * Methods you can use
 * 1. {@link decorator.utils.ImageUtils#read(String)}
 * 2. {@link decorator.utils.ImageUtils#render(Image)}
 */
public class RawImageEditor implements ImageEditor{    
       
    public Image readImage(String filepath){
        return ImageUtils.read(filepath);
    }
    
}
