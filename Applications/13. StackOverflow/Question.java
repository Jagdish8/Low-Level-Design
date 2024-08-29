import java.util.Set;

public class Question {

    int id;
    String label;
    String content;
    User user;
    int reputation;

//    @ManyToMany
//    @JoinTable(
//            name = "question_tags", // Custom join table name
//            joinColumns = @JoinColumn(name = "question_id"),
//            inverseJoinColumns = @JoinColumn(name = "tag_id")
//    )
    // in the above question_tags is join table
    Set<Tag> tags;

    public Question(int id, String label, String content, User user, Set<Tag> tags, int reputation) {
        this.id = id;
        this.label = label;
        this.content = content;
        this.user = user;
        this.tags = tags;
        this.reputation = reputation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
