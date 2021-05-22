package com.sda.example.sda;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HTMLFileValidator implements Visitor {

    @Override
    public void visit(final HTML4File html4File) {

        log.info("Validating HTML 4 schema, " + html4File.getDoctypeDeclaration());
    }

    @Override
    public void visit(final HTML5File html5File) {
        log.info("Validating HTML 5 schema, " + html5File.getDoctypeDeclaration());
    }

    @Override
    public void visit(final XHTMLFile xhtmlFile) {
        log.info("Validating XHTML schema, " + xhtmlFile.getDoctypeDeclaration());
    }
}