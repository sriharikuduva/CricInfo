import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private List<News> news;
    private Coach coach;

    public boolean addTournamentSquad(TournamentSquad tournamentSquad);
    public boolean addPlayer(Player player);
    public boolean addNews(News news);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<News> getNews() {
        return news;
    }
    public void setNews(List<News> news) {
        this.news = news;
    }

    public Coach getCoach() {
        return coach;
    }
    public void setCoach(Coach coach) {
        this.coach = coach;
    }
}