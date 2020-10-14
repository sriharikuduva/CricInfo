import metadata.MatchResult;

import java.util.Date;
import java.util.List;

public abstract class Match {
    private int number;
    private Date startTime;
    private MatchResult result;

    private Playing11[] teams;
    private List<Inning> innings;
    private List<Umpire> umpires;
    private Referee referee;
    private List<Commentator> commentators;
    private List<MatchStat> matchStats;

    public boolean assignStadium(Stadium stadium);
    public boolean assignReferee(Referee referee);

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public MatchResult getResult() {
        return result;
    }
    public void setResult(MatchResult result) {
        this.result = result;
    }

    public Playing11[] getTeams() {
        return teams;
    }
    public void setTeams(Playing11[] teams) {
        this.teams = teams;
    }

    public List<Inning> getInnings() {
        return innings;
    }
    public void setInnings(List<Inning> innings) {
        this.innings = innings;
    }

    public List<Umpire> getUmpires() {
        return umpires;
    }
    public void setUmpires(List<Umpire> umpires) {
        this.umpires = umpires;
    }

    public Referee getReferee() {
        return referee;
    }
    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public List<Commentator> getCommentators() {
        return commentators;
    }
    public void setCommentators(List<Commentator> commentators) {
        this.commentators = commentators;
    }

    public List<MatchStat> getMatchStats() {
        return matchStats;
    }
    public void setMatchStats(List<MatchStat> matchStats) {
        this.matchStats = matchStats;
    }
}