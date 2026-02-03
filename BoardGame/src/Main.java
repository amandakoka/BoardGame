class Main {
  public static void main(String[] args) {

    Red red = new Red();
    Blue blue = new Blue();
    boolean redTurn = true; // starts with redTurn, blueTurn if false
    int totalTurns = 0;

  // need loop to continue until on reaches end and wins
    while(!red.hasWon() && !blue.hasWon()) {
      // roll dice
      int dice1=(int)(Math.random()*6+1);
      int dice2=(int)(Math.random()*6+1);
      int sum = dice1 + dice2;
      // take turn
      if(redTurn) {
        red.takeTurn(sum);
      } else {
        blue.takeTurn(sum);
      }
      redTurn = !redTurn; // switches to blue turn
      totalTurns++;
    }
    // checks winner
    if(red.hasWon()) {
      System.out.println("Red wins in " + " in " + red.getTurnCount() + " turns!");
    } else {
      System.out.println("Blue wins in " + " in " + blue.getTurnCount() + " turns!");
    }
    System.out.println("Total turns: " + totalTurns);
  }
}
