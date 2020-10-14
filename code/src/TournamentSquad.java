import java.util.List;

public class TournamentSquad {
    private List<Player> players;
    private List<TournamentStat> tournamentStats;

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<TournamentStat> getTournamentStats() {
        return tournamentStats;
    }
    public void setTournamentStats(List<TournamentStat> tournamentStats) {
        this.tournamentStats = tournamentStats;
    }
}