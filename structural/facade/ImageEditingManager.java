package com.assignment.question;

// import com.assignment.question.models.Image;
import com.assignment.question.services.*;

public class ImageEditingManager {

    private ImageEditingFacade imageEditingFacade;

    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService){
        imageEditingFacade = new ImageEditingFacade(imageLoader, filterService, imageModifier, imageWriter, analyticsService);
    }

    public void editImage(String imagePath, String filterType, int brightness){
        imageEditingFacade.editImage(imagePath, filterType, brightness);
    }
    
}