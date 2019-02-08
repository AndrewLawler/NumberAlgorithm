
import java.util.*;

class x{
    public static void main(String ... args){
        //initializing the arraylist so it can grow
        ArrayList<Integer> A = new ArrayList<Integer>();
        x.menu(A);
    }
    public static void menu(ArrayList<Integer> A){
        System.out.println("\nWelcome To Number Arranger\n");
        Scanner Option  = new Scanner(System.in);
        System.out.print("Would you like to enter a number? Y or N: ");
        String Choose = Option.nextLine();
        String Choice = Choose.toUpperCase();

        if (Choice.equals("Y")){
            Scanner NumToAdd = new Scanner(System.in);
            System.out.print("\nNumber: ");
            int Num = NumToAdd.nextInt();
            //appending new values and starting again
            A.add(Num);
            System.out.println(A);
            x.menu(A);
        }
        else if (Choice.equals("N")){
            x.func(A);
            System.out.println();
            
        }
        else{
            System.out.println("\nTry Again");
            x.menu(A);
        }
    }

    public static void func(ArrayList<Integer> A){
       int first = A.get(0);
       int second = A.get(1);
       //if first value is bigger than second swap them over
       if (first > second){
            int store = first;
            int small = second;
            int big = store;
            A.add(0, small);
            A.add(1, big);
       }

       //setting smallest and biggest value so far
       int maxi = A.get(1);
       int mini = A.get(0);

       //for values after first two, check them against smallest and biggest and change accordingly
       for(int i=2; i<=A.size()-1; i++){
            if(A.get(i) < mini) {
                mini = A.get(i);
            }
            else if(A.get(i) > maxi) {
                maxi = A.get(i);
            }
        }

        //printing out values
        System.out.print("\nSmallest Number is ");
        System.out.print(mini);
        System.out.print("\nBiggest Number is ");
        System.out.print(maxi);
        
        //restarting
        A.clear();
        System.out.println();
        x.menu(A);
       
       

       
        
    }
}