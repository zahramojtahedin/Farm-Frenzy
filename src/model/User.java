package model;

public class User {
    public String name;
    public String userName;
    public String password;
    public int    score;

    public User() {
    }

    public User(String name, String userName, String password, int score) {
        this.name     = name;
        this.userName = userName;
        this.password = password;
        this.score    = score;
    }

    public User(String[] value) {
        this.name     = value[0];
        this.userName = value[1];
        this.password = value[2];
        this.score    = Integer.parseInt(value[3]);
    }

}
