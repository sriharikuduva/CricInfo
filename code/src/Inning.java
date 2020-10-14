import java.util.Date;
import java.util.List;

public class Inning {
    private int number;
    private Date startTime;
    private List<Over> overs;

    public void addOver(Over over) {
        overs.add(over);
    }

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

    public List<Over> getOvers() {
        return overs;
    }
    public void setOvers(List<Over> overs) {
        this.overs = overs;
    }
}