package Facade;

import java.util.HashMap;

public class DBMS {
    private HashMap<String, Row> db = new HashMap<String, Row>();

    public DBMS() {
        db.put("jane", new Row("jane", "1991-12-03", "jane@naver.com"));
        db.put("good", new Row("good", "1992-12-03", "good@naver.com"));
        db.put("fail", new Row("fail", "1993-12-03", "fail@naver.com"));
    }

    public Row query(String name){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return db.get(name.toLowerCase());
    }
}
