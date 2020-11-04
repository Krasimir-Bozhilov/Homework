package Hero;

public class Hero {
    private String userName;
    private int level;

    protected Hero(String userName,int level){
        this.userName=userName;
        this.level=level;
    }

    public int getLevel() {
        return level;
    }

    public String getUsername() {
        return userName;
    }
    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }

}
