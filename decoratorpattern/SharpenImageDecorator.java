package com.learn.spring.lld.decoratorpattern;

public class SharpenImageDecorator extends BaseImageDecorator{
    // private ImageEditor imageEditor;

    public SharpenImageDecorator(ImageEditor imageEditor){
        super(imageEditor);
    }

    public Image readImage(String filepath){
        return ImageUtils.applySharpen(ImageUtils.read(null));
    }
}
