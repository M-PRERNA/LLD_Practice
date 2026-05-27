package com.learn.spring.lld;

public class DBConnection {
//    private static DBConnection connection = null;
    private final static DBConnection connection =  new DBConnection("", "", "", "");
    String url;
    String userName;
    String password;
    String host;

    private DBConnection(String url, String userName, String password, String host) {
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.host = host;
    }

    private DBConnection() {
    }

    public static DBConnection getDbConnection() {
//        if (connection == null) {
//            connection = new DBConnection("", "", "", "");
//        }
//        ret urn connection;
    }
}
