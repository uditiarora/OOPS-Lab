import java.util.*;

class TwoPlayerGame{
    int turns;
    char c;
    TwoPlayerGame(char c,int turns){
        this.turns = turns;
        this.c = c;
    }
    
    public void func(){
        int [] A = new int[turns];
        int [] B = new int[turns];
        Random rand = new Random();
        int i,x = 0,y = 0;
        for(i=0;i<turns;i++){
            A[i] = rand.nextInt(500);
            B[i] = rand.nextInt(500);
            if(A[i] > B[i]){
                A[i] = A[i]-B[i];
                B[i] = 0;
            }
            else if(A[i] < B[i]){
                B[i] = B[i]-A[i];
                A[i] = 0;
            }
            else{
                A[i] = 0;
                B[i] = 0;
            }
            x = x+A[i];
            y = y+B[i];
        }
        if(x>y){
            if(c == 'A'){
                System.out.println("A wins");
                System.out.println("Your score is:"+x);
                System.out.println("Your opponent's score is:"+y);
            }
            else{
                System.out.println("A wins");
                System.out.println("Your score is:"+y);
                System.out.println("Your opponent's score is:"+x);
            }
        }
        else if(x<y){
            if(c == 'B'){
                System.out.println("B wins");
                System.out.println("Your score is:"+y);
                System.out.println("Your opponent's score is:"+x);
            }
            else{
                System.out.println("B wins");
                System.out.println("Your score is:"+x);
                System.out.println("Your opponent's score is:"+y);
            }
        }
        else{
            
                System.out.println("Draw");
                System.out.println("Your score is:"+x);
                System.out.println("Your opponent's score is:"+y);
           
        }
        
        
    }
}
public class q2{
    public static void main(String[] args) {
        int turns;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose A or B");
        c = sc.next().charAt(0);
        System.out.println("Enter no. of turns:");
        turns = sc.nextInt();
        TwoPlayerGame g = new TwoPlayerGame(c,turns);
        g.func();
    }
    
}
