#hey all! Here's the method to create a random array! 
#James, you can call it twice to get your two comparisons!

public int [] createArray(){
        int[] randomNumberArray = new int[10];
        
        for (int i=0; i<randomNumberArray.length; i++){
            randomNumberArray[i] = (int)(Math.random()*50) + 1;
        }
        return randomNumberArray;
    }
