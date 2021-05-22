package com.sda.example.sda;

public interface Visitor {
    void visit(HTML4File html4File);
    void visit(HTML5File html5File);
    void visit(XHTMLFile xhtmlFile);
}
