class Main {
  public static void main(String[] args) {
    int [] gameBoard = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
    String[] players = {"Red", "Blue"};

    int redStart = 1;
    int blueStart = 25;

    int redEnd = 25;
    int blueEnd = 1;

    int redPosition = redStart;
    int bluePosition = blueStart;

    boolean redTurn = true; // starts with redTurn, blueTurn if false

    int redTurnCount = 0;
    int blueTurnCount = 0;

    int totalTurns = 0;

    // need a loop for game to keep rolling ad switch turns until a player reaches end
    // loop checks if player position is still less than end.
    while(redPosition < redEnd && bluePosition > blueEnd) {
      // roll dice
      int dice1=(int)(Math.random()*6+1);
      int dice2=(int)(Math.random()*6+1);
      int sum = dice1 + dice2;

      // move player red up from 1, blue down from 25.
      if(redTurn) {
        redTurnCount++;
        System.out.println("Red turn " + redTurnCount + " rolls " + sum);
        redPosition += sum;
        System.out.println("Red moves to " + redPosition);
      } else {
        blueTurnCount++;
        System.out.println("Blue turn " + blueTurnCount + " rolls " + sum);
        bluePosition -= sum;
        System.out.println("Blue moves to " + bluePosition);
      }
      redTurn = !redTurn; // switches to blue turn
      totalTurns++;
    }
    // checks winner
    if(redPosition >= redEnd) {
      System.out.println("Red wins! " + " in " + redTurnCount + " turns.");
    } else {
      System.out.println("Blue wins! " + " in " + blueTurnCount + " turns.");
    }
    System.out.println("Total turns: " + totalTurns);
  }
}
