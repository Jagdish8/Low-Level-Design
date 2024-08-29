import java.util.Set;

public class Tag {

    int id;
    String name;

//    @ManyToMany(mappedBy = "tags")
    // this above tags mean tags field in the Question class owns the relationship
    private Set<Question> questions;

    public Tag(int id, String name, Set<Question> questions) {
        this.id = id;
        this.name = name;
        this.questions = questions;
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

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }
}
