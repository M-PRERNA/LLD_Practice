package com.learn.spring.lld.factorypattern.simplefactory;


public class DocumentProcessorFactory{
    public static DocumentProcessor createDocument(DocumentType type, String documentName){
        switch(type){
            case PRESENTATION:
                return new PresentationDocumentProcessor(documentName);

            case SPREAD_SHEET:
                return new SpreadsheetDocumentProcessor(documentName);

            case TEXT:
                return new TextDocumentProcessor(documentName);

            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}
