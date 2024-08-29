public class Vote {

    int id;
    Boolean isUpVote;
    User userId;
    int targetId;
    VoteType voteType;

    public Vote(int id, Boolean isUpVote, User userId, int targetId, VoteType voteType) {
        this.id = id;
        this.isUpVote = isUpVote;
        this.userId = userId;
        this.targetId = targetId;
        this.voteType = voteType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getUpVote() {
        return isUpVote;
    }

    public void setUpVote(Boolean upVote) {
        isUpVote = upVote;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public VoteType getVoteType() {
        return voteType;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }
}
