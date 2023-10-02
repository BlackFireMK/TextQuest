package entity;

public class Player {
    private String playerName;
    private String preparationType;
    private int score;
    private String backgroundStyle;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPreparationType() {
        return preparationType;
    }

    public void setPreparationType(String preparationType) {
        this.preparationType = preparationType;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getBackgroundStyle() {
        return backgroundStyle;
    }

    public void setBackgroundStyle(String backgroundStyle) {
        this.backgroundStyle = backgroundStyle;
    }
}