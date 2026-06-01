package com.learn.spring.lld.creational.factory.abstractfactory.printer;

import com.learn.spring.lld.creational.factory.abstractfactory.DocumentType;
import com.learn.spring.lld.creational.factory.abstractfactory.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document

    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
