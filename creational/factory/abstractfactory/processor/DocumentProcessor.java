package com.learn.spring.lld.creational.factory.abstractfactory.processor;

import com.learn.spring.lld.creational.factory.abstractfactory.DocumentType;


public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}
