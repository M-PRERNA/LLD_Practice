package com.learn.spring.lld.structural.decoratorpattern;

public interface ImageEditor {

    /** Task 1a - Add a method readImage that accepts a filePath and that returns an image {@link decorator.utils.Image}. */
    public Image readImage(String filepath);
}
