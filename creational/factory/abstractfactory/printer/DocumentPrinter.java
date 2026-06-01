package com.learn.spring.lld.creational.factory.abstractfactory.printer;

import com.learn.spring.lld.creational.factory.abstractfactory.DocumentType;
import com.learn.spring.lld.creational.factory.abstractfactory.processor.DocumentProcessor;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}
