
public class MyArrayList {

    String [] elements = new String[3];
    private int index;

    //private MyArrayList mylist = new MyArrayList();

    public boolean isEmpty() {
        for (String element : elements) {
            if (element == null) return true;
        }
        return false;
    }

    public void add(String element) {
        if (size() == elements.length) {
            String[] newElements = new String[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0,size());
            elements = newElements;
        }
        elements[index++] = element;

    }

    public int size() {
        int count = 0;
        for (String element : elements) {
            if (element != null) count++;
        }
        return count;
    }

    public String getElementByIndex(int index) {
        return elements[index];
    }

    public int getIndexByElement(String element) {
        int index = 0;
        for (String word : elements){
            if (word !=null && word.equals(element)) return index;
            index++;
        }
        return -1;
    }

    public void remove(String element) {
        int index = getIndexByElement(element);
        for (int i = index; i < size() - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size() - 1] = null;
    }

    public void addAtIndex(String element, int index) {
        for (int i = size()-1; i >= index ; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;

    }

    public int capacity() {
        return elements.length;
    }

    public boolean contains(String element) {
        for (String word : elements) {
            if (word.equals(element)) return true;
        }
        return false;
    }
}