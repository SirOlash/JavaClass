public class MyMap {
   // private MyMap<String, Object> map = new MyMap();
    private Set keys;
    private MyArrayList values;


    public MyMap() {
        keys = new Set();
        values = new MyArrayList();
    }

    public void put(String key, String value) {
        int index = keys.getIndexByElement(key);
        if (index != -1) {
            values.addAtIndex(value,index);
        }
        else {
            keys.add(key);
            values.add(value);
        }
    }
    public int size(){
        return keys.size();
    }

    public String get(String key) {
        int index = keys.getIndexByElement(key);
        if (index != -1) {
            return values.getElementByIndex(index);
        }
        return null;
    }


    public boolean containsKey(String key) {
        return keys.contains(key);

    }

    public boolean containsValue(String value) {
        return values.contains(value);
    }

    public void remove(String key) {
        int index = keys.getIndexByElement(key);
        if (index != -1) {
            keys.remove(key);
            values.remove(values.getElementByIndex(index));
        }
    }
}