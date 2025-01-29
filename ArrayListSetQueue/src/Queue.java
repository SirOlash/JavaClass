public class Queue {
    String [] queue = new String[3];
    private int queueSize;

    public boolean isEmpty(){
        return queueSize == 0;
    }

    public void add(String element) {
        queue[queueSize++] = element;
    }

    public int size() {
        return queueSize;
    }

    public boolean offer(String element) {
        if(queueSize == queue.length) {
            return false;
        }
        queue[queueSize++] = element;
        return true;
    }

    public String poll() {
        if(queue[0] != null ){
            for(int i = 1; i < queueSize; i++){
                queue[i-1] = queue[i];
            }
            queue[queueSize-1] = null;
            queueSize--;
        }
        return null;
    }

    public String peek() {
        return queue[0];
    }
}
