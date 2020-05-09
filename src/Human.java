public class Human {
    private Head head;
    private int hands;
    private int legs;
    private boolean isMan;

    public Human(int hands, int legs, boolean isMan) {
        this.hands = hands;
        this.legs = legs;
        this.isMan = isMan;
    }

    public void move(String from, String to){
        System.out.println("I moved from " + from + " to " + to);
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }
}
