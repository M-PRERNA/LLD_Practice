package com.learn.spring.lld.creational.factory.abstractfactory.printer;

import com.learn.spring.lld.creational.factory.abstractfactory.DocumentType;
import com.learn.spring.lld.creational.factory.abstractfactory.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
