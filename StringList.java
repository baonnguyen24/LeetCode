public class StringList {

    private static final int GROW_CAPACITY = 4;

    private String[] storage;
    private int currentPosition;
    private int currentMaxSize;

    public StringList(){
        storage = new String[GROW_CAPACITY];
        currentMaxSize = storage.length;
        currentPosition = 0;
    }


    // Adds s to the end of the underlying array
    public void add(String s){
        resize();
        storage[currentPosition] = s;
        currentPosition++;
    }

    // Retrieves the String at the ith position in the underlying array
    public String get(int i){
        if(i < 0 || i > currentPosition - 1){
            return null;
        }
        return storage[i];
    }

    // Returns true if String s is found in the array, false otherwise
    public boolean find(String s){
        for(int i = 0; i < storage.length; i++){
            if (storage[i].equals(s)){
                return true;
            }
        }
        return false;
    }


    // Removes first occurrence of String s if it is found in the underlying array. if found, returns true; if not found returns false
    public boolean remove(String s){
        boolean found = false;
        int foundPosition = -1;

        for(int i = 0; i < storage.length; i++){
            if (storage[i].equals(s)){
                found = true;
                foundPosition = i;
                break;
            }
        }

        if(found){
            for(int i = foundPosition; i < currentPosition - 1; i++){
                System.out.println("foundPosition: " + foundPosition);
                System.out.println("currentPosition: " + currentPosition);
                storage[i] = storage[i+1];
            }
            storage[currentPosition - 1] = null;
            currentPosition--;
        }

        return found;
    }


    /* Returns a String representation of the underlying array
    here is a typical output: [Bob, Steve, Susan, Mark, Dave] */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(String s : storage){
            sb.append(s + ", ");
        }
        sb.append("]");
        return sb.toString();
    }


    /* Returns the next open position in the underlying array – this is precisely the number of Strings that have been added minus the number of String that have been removed. */
    public int size(){
        return currentPosition;
    }

    /* In your class, the resize() method must be called whenever addition of another String to
    the underlying array goes beyond the current length of the array. The resize method
    should use System.arraycopy to create a new String array having twice the size of the
    current String array, and should copy the old array into the first part of the new array. */
    private void resize(){
        // 1. check max size
        if(currentMaxSize == currentPosition){
            System.out.println("Resizing...");
        
            // 2. increase storage
            currentMaxSize += GROW_CAPACITY;

            // 3. copy current storage to new storage
            String[] newStorage = new String[currentMaxSize];
            for(int i = 0; i < storage.length; i++){
                newStorage[i] = storage[i];
            }

            // 4. reset storage
            storage = newStorage;
        }
    }

    public static void main(String[] args){
        StringList list = new StringList();
        list.add("Luan");
        list.add("Thang");
        list.add("Long");
        list.add("Quan");
        list.add("Thu");
        list.add("Van");
        list.add("Toan");
        list.add("Huong");

        System.out.println(list);

        list.remove("Van");
        System.out.println(list);
        System.out.println(list.size());

        list.add("Thi");
        list.add("Prabin");
        System.out.println(list);
        System.out.println(list.size());
    }
}
