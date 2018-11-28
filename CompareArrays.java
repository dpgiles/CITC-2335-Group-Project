
public class CompareArrays {
    private int[] array1, array2;
    private ArrayList<Integer> returnArray = new ArrayList();
    private Integer[] diffArray;
    
    //Constructor
    public CompareArrays(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
        this.doComparasion();
    }
    
    //Constructor will call this function to do the comparison
    private void doComparasion() {
        int count = 0;
        for(int i = 0; i < this.array1.length; i++) {
            boolean found = false;
            for(int j = 0; j < this.array2.length; j++) {
                if(this.array1[i] == this.array2[j]) {
                    found = true;
                    break;
                }
            }
            if(found == false) {
                this.returnArray.add(this.array1[i]);
                count++;
            }            
        }
        //ArrayList to Array Conversion
        this.diffArray = new Integer[this.returnArray.size()];
        this.returnArray.toArray(this.diffArray);
    }
    
    //Will return Array of ints that will be different
    public Integer[] getDiffArray() {
        return this.diffArray;
    }

    //Will return an ArrayList of Ints that will be different
    public ArrayList<Integer> getDiffList() {
        return this.returnArray;
    }
    
    //Will return the first Array
    public int[] getArray1() {
        return this.array1;
    }

    //Will return the second Array
    public int[] getArray2() {
        return this.array2;
    }

}
