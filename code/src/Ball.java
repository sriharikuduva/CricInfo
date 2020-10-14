import metadata.BallType;

public class Ball {
    private Player balledBy;
    private Player playedBy;
    private BallType type;

    private Wicket wicket;
    private List<Run> runs;
    private Commentary commentary;

    public Player getBalledBy() {
        return balledBy;
    }
    public void setBalledBy(Player balledBy) {
        this.balledBy = balledBy;
    }

    public Player getPlayedBy() {
        return playedBy;
    }
    public void setPlayedBy(Player playedBy) {
        this.playedBy = playedBy;
    }

    public BallType getType() {
        return type;
    }
    public void setType(BallType type) {
        this.type = type;
    }

    public Wicket getWicket() {
        return wicket;
    }
    public void setWicket(Wicket wicket) {
        this.wicket = wicket;
    }

    public List<Run> getRuns() {
        return runs;
    }
    public void setRuns(List<Run> runs) {
        this.runs = runs;
    }

    public Commentary getCommentary() {
        return commentary;
    }
    public void setCommentary(Commentary commentary) {
        this.commentary = commentary;
    }
}