class Red {
    // Fields
    private final int start = 1;
    private final int end = 25;
    private int position = 0;
    private int turnCount = 0;

    // constructor initialises red starting point
    public Red() {
        this.position = start;
    }

    // Getters
    public int getPosition() {
        return position;
    }

    public int getTurnCount() {
        return turnCount;
    }

    // move player up by the sum of dice rolls
    public void takeTurn(int sum) {
        turnCount++;
        System.out.println("Red turn " + turnCount + " rolls " + sum);
        position += sum;
        System.out.println("Red moves to " + position);
    }

    // check if red has won when reaches 25 or greater
    public boolean hasWon() {
        return position >= end;
    }

}
