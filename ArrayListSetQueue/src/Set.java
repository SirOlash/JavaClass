public class Set {

    //MyArrayList list = new MyArrayList();
    String [] set = new String [5];
    private int setSize;
   // private MyArrayList mylist = new MyArrayList();

    public boolean isEmpty(){
        return setSize == 0;
    }


    public void add(String element){
        for (String word : set){
            if (element.equals(word)){
                return;
            }
        }
        if (size() == set.length) {
            String[] newElements = new String[set.length * 2];
            System.arraycopy(set, 0, newElements, 0,size());
            set = newElements;
        }
        set[setSize++] = element;

    }

    public int size(){
        return setSize;
    }

    public void remove(String element) {
        for (int i = 0; i < setSize; i++) {
            if (set[i].equals(element)) {
                for(int j = i; j < setSize-1; j++){
                    set[j] = set[j+1];
                }
                set[setSize--] = null;
                return;
            }
        }
    }
    public String getElementByIndex(int index) {
        return set[index];
    }
    public int getIndexByElement(String element) {
        for (int i = 0; i < setSize; i++) {
            if (set[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(String element) {
        for (String word : set){
            if (element.equals(word)){
                return true;
            }
        }
        return false;
    }


    public void clear() {
        setSize = 0;
    }
}




