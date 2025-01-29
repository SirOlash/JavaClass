import java.util.EmptyStackException;

public class Stack {
    String [] stack = new String[4];
    private int stackSize;


    public boolean isEmpty() {
        return stackSize == 0;
    }

    public void push(String element) {
        stack[stackSize++] = element;
    }
    public int size(){
        return stackSize;
    }

    public String peek() {
        return stack[stackSize - 1];
    }

    public void pop() {
        if (stackSize == 0) {
            throw new EmptyStackException();
        }
        stack[stackSize-1] = null;
        stackSize--;
    }

    public int search(String element) {
        int count = stackSize;
        for (String word : stack) {
            if (word.equals(element)) {
                return count;
            }
            count--;
        }
        return -1;
    }
}
