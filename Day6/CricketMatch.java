class Batsman {
    String playerName;
    int runs;
    int balls;
    double strikeRate;
    Batsman(String playerName, int runs, int balls) {
        this.playerName = playerName;
        this.runs = runs;
        this.balls = balls;
        this.strikeRate = (runs * 100) / balls;
    }
    void display() {
        System.out.println("Strike Rate = " + (int) strikeRate);
    }
    public static void main(String[] args) {
        Batsman b = new Batsman("Gill", 75, 50);
        b.display();
    }
}