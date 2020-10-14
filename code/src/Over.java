public class Over {
    private int number;
    private List<Ball> balls;

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public List<Ball> getBalls() {
        return balls;
    }
    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }
}