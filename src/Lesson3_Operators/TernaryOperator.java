package Lesson3_Operators;

public class TernaryOperator {
    /*
    boolean ? expression for true : expression for false
     */

    public static void main(String[] args) {
        boolean youAreHere = true;
        boolean myFriendIsHere = false;
        boolean criteria = youAreHere || myFriendIsHere;

        System.out.println(criteria ? "We go to picnic." : "I watch a movie at home alone.");
    }
}
