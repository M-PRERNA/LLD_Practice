package com.learn.spring.lld.factorypattern.abstractfactory.parser;
import com.learn.spring.lld.factorypattern.abstractfactory.DocumentType;
public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
