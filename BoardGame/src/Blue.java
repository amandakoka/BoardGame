class Blue {
    // Fields
    private final int start = 25;
    private final int end = 1;
    private int position = 0;
    private int turnCount = 0;

    // constructor initialises blue starting point
    public Blue() {
        this.position = start;
    }

    // Getters
    public int getPosition() {
        return position;
    }

    public int getTurnCount() {
        return turnCount;
    }

    // move player backwards by sum of dice rolls
    public void takeTurn(int sum) {
        turnCount++;
        System.out.println("Blue turn " + turnCount + " rolls " + sum);
        position -= sum;
        System.out.println("Blue moves to " + position);
    }

    // check if blue has won when reaches 1 or below
    public boolean hasWon() {
        return position <= end;
    }
}
