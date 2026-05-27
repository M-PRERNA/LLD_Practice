package com.learn.spring.lld.factorypattern.abstractfactory.printer;

import com.learn.spring.lld.factorypattern.abstractfactory.DocumentType;
import com.learn.spring.lld.factorypattern.abstractfactory.processor.DocumentProcessor;

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
