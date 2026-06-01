package com.learn.spring.lld.creational.factory.simplefactory;

public class TextDocumentProcessor extends DocumentProcessor{

    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
    @Override
    public void processDocument() {
        System.out.println("Processing a text document: " + getDocumentName());
        // Additional logic for text document processing
    }
}
