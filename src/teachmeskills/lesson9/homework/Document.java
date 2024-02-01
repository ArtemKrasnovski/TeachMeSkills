package teachmeskills.lesson9.homework;

import java.util.Date;


abstract class Document {

    protected Date date;
    protected String numDoc;


    protected Document() {
    }

    protected Document(Date date, String numDoc) throws ExNumDoc555, ExNumDocABC, ExNumDoc1a2b {
        if (!numDoc.contains("abc")) {
            throw new ExNumDocABC("abc");
        }
        if (!numDoc.startsWith("555")) {
            throw new ExNumDoc555("555");
        }
        if (!numDoc.endsWith("1a2b")) {
            throw new ExNumDoc1a2b("1a2b");
        }
        this.date = date;
        this.numDoc = numDoc;
    }

}


