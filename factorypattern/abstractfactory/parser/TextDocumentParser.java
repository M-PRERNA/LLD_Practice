package com.learn.spring.lld.factorypattern.abstractfactory.parser;
import com.learn.spring.lld.factorypattern.abstractfactory.DocumentType;

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