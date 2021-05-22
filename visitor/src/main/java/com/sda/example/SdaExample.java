package com.sda.example;

import com.sda.example.sda.HTML4File;
import com.sda.example.sda.HTML5File;
import com.sda.example.sda.HTMLFileExportVisitor;
import com.sda.example.sda.HTMLFileValidator;
import com.sda.example.sda.Visitor;
import com.sda.example.sda.XHTMLFile;

public class SdaExample {
    public static void main(String[] args) {
        // final Visitor visitor = new HTMLFileExportVisitor();
        final Visitor visitor = new HTMLFileValidator();

        final HTML4File html4File = new HTML4File("<head>\n" +
                "    <title>Title</title>\n" +
                "</head>","<body>\n" +
                "<p>HTML4 FILE</p>\n" +
                "</body>",
                visitor
        );

        final HTML5File html5File = new HTML5File("<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>", "<body>\n" +
                "<p>HTML5 FILE</p>\n" +
                "</body>",
                visitor
        );

        final XHTMLFile xhtmlFile = new XHTMLFile("<head>\n" +
                "    <title>Title</title>\n" +
                "</head>", "<body>\n" +
                "<p>XHTML file</p>\n" +
                "</body>",
                visitor
        );

        visitor.visit(html4File);
        visitor.visit(html5File);
        visitor.visit(xhtmlFile);
    }

}
