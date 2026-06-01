package com.learn.spring.lld.creational.factory.abstractfactory;

import com.assignment.question.parser.DocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;

public abstract class DocumentFactory {
    public abstract DocumentType supportsType();
    public abstract DocumentParser createParser(String path);
    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);
    public abstract DocumentProcessor createProcessor(String documentName);
}
