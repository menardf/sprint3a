import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 4/5/18
 * Time: 10:34 AM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */

    public class recursiveStack {

        public static void main (String[] args){
            Integer [] data = {47,32,59,62,21};
            recursion(data);

        }

        public static Stack<Integer> recursion (Integer [] d ){
            int n = d.length;
            Stack<Integer> thestack = new Stack<>();

            if(n==0){
                System.out.println();
            }
            else {
                for(Integer q:d){
                    thestack.push(q);
                }

            }
            System.out.println("stack before removing:" +thestack);
            System.out.println("stack after removing:");

            for(Integer q:d){
                System.out.print(thestack.pop()+" ");
            }
            return thestack;
        }
    }



