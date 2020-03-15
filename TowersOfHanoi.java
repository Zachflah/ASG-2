public class TowersOfHanoi {

  int n;
  Stack<Integer> rods[];
  int count = 0;

  public TowersOfHanoi(int n){
    this.n = n;
    rods = new ListStack[3];
    for(int i = 0; i < 3; i++){
      rods[i] = new ListStack<Integer>(n);
      for(int j=n; j >=0; j--){
        rods[0].push(j);
      }
    }
  }
  public boolean legalMove(int a, int b){
    if(rods[b].isEmpty() || rods[a].isEmpty()){
      return true;
    }
    else if(!rods[b].isFull()){
      return(rods[a].peek() < rods[b].peek());
    }
    else{
      return false;
    }
  }

  public boolean move(int a , int b){
    int disc;
    if(legalMove(a, b)){
      rods[b].push(disc = rods[a].pop());
      System.out.println("disc " + disc + " moved from rod " + a + " to rod "+b);
      return true;
    }
    else{
      return false;
    }
  }

  private boolean move(int m, int a, int b, int c){
    if(m == 0){
      return true;
    }
    else{
      if(move(m-1, a, c, b)){ //using c as temporary, transfer m-1 discs from a to c
        if(move(a, b)){
          count++;
          return move(m-1, c, b, a);//using a as temporary, transfer m-1 discs from c to b
        }
      }
    }
    return false;
  }
  public void solvegame(){
    move(n, 0, 1, 2);
  }
  public void showTowerStates(){
    for(int i = 0; i < 3; i++){
      System.out.println("Rod " + i );
      rods[i].display();
      System.out.println("===========");
    }
    System.out.println("You took "+ count +" moves to complete the game.");
  }
}
