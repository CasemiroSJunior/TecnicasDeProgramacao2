package model.factory;

public enum TipoBanco {
    MYSQL(1, "jdbc:mysql://localhost:3307/fatec", "root", "root"),
    MARIADB(2,"jdbc:mariadb://localhost:3306/fatec", "root", "");

    private final int id;
    private final String url;
    private final String user;
    private final String password;

    TipoBanco(int id, String url, String user, String password) {
        this.id = id;
        this.url = url;
        this.user = user;
        this.password = password;
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

    public static TipoBanco getTipo(String tipo) {
        if (tipo.equals("-mysql")) return MYSQL;
        else return MARIADB;
    }

}

/*
 URL = "jdbc:mysql://localhost:3307/fatec";
                PASSWORD = "root";
 */