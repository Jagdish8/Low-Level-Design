public class Comment {

    int id;
    User userId;
    String content;
    int reputation;

    public Comment(int id, User userId, String content, int reputation) {
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.reputation = reputation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
