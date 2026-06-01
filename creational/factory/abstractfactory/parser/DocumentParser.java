package com.learn.spring.lld.creational.factory.abstractfactory.parser;

import com.learn.spring.lld.creational.factory.abstractfactory.DocumentType;

public abstract class DocumentParser {

    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();

}