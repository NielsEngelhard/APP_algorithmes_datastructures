package ListsStacksQueues;

public class TowersOfHanoi {
    public HANStack<Integer> towerOne = new HANStack<Integer>();
    public HANStack<Integer> towerTwo = new HANStack<Integer>();
    public HANStack<Integer> towerThree = new HANStack<Integer>();

    public void discFromTo(HANStack<Integer> from, HANStack<Integer> to) {
        if(from.top() > to.top()) { // check if valid action (no bigger disc on smaller disc)
            System.out.println("Cant place discs on a smaller disc then itself.");
        }
        to.push(from.top()); // put disc "on top of" TO
        from.pop();          // remove disc from FROM
    }

    public void printTowers() {
        System.out.println("Tower one: ");
        towerOne.printStack();
        System.out.println();

        System.out.println("Tower two: ");
        towerTwo.printStack();
        System.out.println();

        System.out.println("Tower three: ");
        towerThree.printStack();
        System.out.println();
    }
}

