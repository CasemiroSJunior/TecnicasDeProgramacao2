package model.factory;

public enum TipoBanco {
    MYSQL("-mysql", "jdbc:mysql://localhost:3307/fatec", "root", "root"),
    MARIADB("-maria", "jdbc:mariadb://localhost:3306/fatec", "root", ""),
    MONGODB("-mongo" , "mongodb://localhost:27017", "", "", "contatos", "contatos");

    private final String param;
    private final String url;
    private final String user;
    private final String password;
    private final String database;
    private final String collection;

    TipoBanco(String param, String url, String user, String password) {
        this.param = param;
        this.url = url;
        this.user = user;
        this.password = password;
        this.database = null;
        this.collection = null;
    }

    TipoBanco(String param, String url, String user, String password, String database, String collection) {
        this.param = param;
        this.url = url;
        this.user = user;
        this.password = password;
        this.database = database;
        this.collection = collection;
    }

    public String getUrl() {
        return url;
    }


    public String getUser() {
        return user;
    }


    public String getPassword() {
        return password;
    }

    public String getDatabase() {
        return database;
    }

    public String getCollection() {
        return collection;
    }

    public String getParam() {
        return param;
    }

    public static TipoBanco getTipo(String tipo) {
        if (tipo.equals("-mysql")) return MYSQL;
        if (tipo.equals("-mongo")) return MONGODB;
        else return MARIADB;
    }

}

/*
 URL = "jdbc:mysql://localhost:3307/fatec";
                PASSWORD = "root";
 */