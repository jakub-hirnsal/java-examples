package com.sda.example.sda;

public class HTMLFileExportVisitor implements Visitor {
    @Override
    public void visit(HTML4File html4File) {
        String body = html4File.getBody();
        System.out.println(body);
    }

    @Override
    public void visit(HTML5File html5File) {
        String body = html5File.getBody();
        System.out.println(body);

    }

    @Override
    public void visit(XHTMLFile xhtmlFile) {
        String body = xhtmlFile.getBody();
        System.out.println(body);
    }
}
