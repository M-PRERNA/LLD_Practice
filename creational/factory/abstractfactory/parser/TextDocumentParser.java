package com.learn.spring.lld.creational.factory.abstractfactory.parser;
import com.learn.spring.lld.creational.factory.abstractfactory.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}