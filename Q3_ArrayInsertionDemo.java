public class Q3_ArrayInsertionDemo{

    public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
        // votre code ici
        System.out.println("Array après l'insertion de " + valueToInsert + " à position " + indexToInsert + " :");
        int[] newArray = new int[beforeArray.length + 1];
        for (int i = 0; i < beforeArray.length; i++) {
            newArray[i] = beforeArray[i];
        }

        for (int j = beforeArray.length; j > indexToInsert; j--) {
            newArray[j] = newArray[j-1];
        }

        newArray[indexToInsert] = valueToInsert;
        return newArray;
    }

    public static void main(String[] args){
        // votre code ici
        int[] array;
        array = new int[]{1,5,4,7,9,6};
        System.out.println("Array avant l'insertion");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[] afterArray = insertIntoArray(array, 3, 15);

        for (int i = 0; i < afterArray.length; i++) {
            System.out.println(afterArray[i]);
        }
    }
}
