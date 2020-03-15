import java.util.Scanner;

public class PlayTowerOfHanoi{

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while(true){
      boolean something = true;
      int n = 0;
      while(something == true){
        System.out.println("How many discs? ");
        n = s.nextInt();
        if(n > 9999){
          System.out.println("you cannot have more then 6 discs");
        }
        else{
          something = false;
        }
      }
      TowersOfHanoi hanoi = new TowersOfHanoi(n);
      System.out.println("Before solving the rods are ");
      hanoi.showTowerStates();
      hanoi.solvegame();
      System.out.println("After solving the rods are ");
      hanoi.showTowerStates();
      System.out.println("Do you want to play again ? y/n: ");
      String ans = s.next();
      if(ans.equalsIgnoreCase("y"))
      continue;
      else{
        break;
      }
    }
  }
}
