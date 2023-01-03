package oops.tictactoe;


public class Player {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String name;
    String id;

    public char getKey() {
        return key;
    }

    public Player(String name, String id, char key) {
        this.name = name;
        this.id = id;
        this.key = key;
    }

    public void setKey(char key) {
        this.key = key;
    }

    char key;
}
