import java.util.ArrayList;
import java.util.List;

public class Solve {
    public List<Integer> oddNumbers(int r, int l){
        List<Integer> numbers = new ArrayList<Integer>();

        // assuming they are added in order from least to greatest
        // while r is less than or to l
        while(r<=l){

            // check if r is an odd number
            if(r % 2 != 0){

                // if yes add it to the list
                numbers.add(r);
            }

            // increment r to avoid infinite loop
            r++;
        }

        // print the solution
        for(int n : numbers){
            System.out.print(n + " ");
        }

        // return the list array
        return numbers;
    }
}
