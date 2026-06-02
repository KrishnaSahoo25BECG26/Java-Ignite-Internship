class TreasureChest {
    String playerName;
    int coinsCollected;
    String reward;
    TreasureChest(String playerName, int coinsCollected) {
        this.playerName = playerName;
        this.coinsCollected = coinsCollected;

        if (coinsCollected >= 1000) {
            reward = "Diamond Sword";
        } else if (coinsCollected >= 500) {
            reward = "Gold Sword";
        } else if (coinsCollected >= 100) {
            reward = "Iron Sword";
        } else {
            reward = "Wooden Sword";
        }
    }
    void display() {
        System.out.println(playerName + " collected " + coinsCollected + " coins.");
        System.out.println("Reward: " + reward);
    }
    public static void main(String[] args) {
        TreasureChest t1 = new TreasureChest("Steve", 1200);
        t1.display();

        TreasureChest t2 = new TreasureChest("Alex", 450);
        t2.display();
    }
}