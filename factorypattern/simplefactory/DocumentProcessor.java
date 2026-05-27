package com.learn.spring.lld.factorypattern.simplefactory;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public abstract DocumentType supportsType();
    public abstract void processDocument();

    public String getDocumentName() {
        return documentName;
    }

}


