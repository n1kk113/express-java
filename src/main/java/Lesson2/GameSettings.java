package Lesson2;

public class GameSettings {
    static int maxPlayers = 50;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName) {
        this.gameName = gameName;
        this.currentPlayers = 0;
    }

    public static void setMaxPlayers(int max) {
        if (max > 0) {
            maxPlayers = max;
        }
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    public void printGameStatus() {
        System.out.println("Игра: " + gameName + " , Количество игроков: " + currentPlayers + ", Максимальное кол-во игроков: " + maxPlayers );
    }
}
