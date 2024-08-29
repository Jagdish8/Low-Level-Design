public class User {

    int id;
    String name;
    int reputation;

    public User(int id, String name, int reputation) {
        this.id = id;
        this.name = name;
        this.reputation = reputation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
