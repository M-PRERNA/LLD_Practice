package com.learn.spring.lld.factorypattern.abstractfactory;

import com.assignment.question.parser.SpreadsheetDocumentParser;
import com.assignment.question.printer.SpreadsheetDocumentPrinter;
import com.assignment.question.processor.SpreadsheetDocumentProcessor;
import com.assignment.question.parser.DocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;


public class SpreadsheetDocumentFactory extends DocumentFactory{
    @Override
    public DocumentType supportsType(){
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentParser createParser(String path){
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor){
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createProcessor(String documentName){
        return new SpreadsheetDocumentProcessor(documentName);
    }
}

