package algorithms;

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionSort(int[] list) {
        int tmp, j, key;
        for(int i = 1; i < list.length; i++) {
            key = list[i]; // getal  waar we nu naar gaan kijken (die "opgeschoven wordt")
            j = i - 1; // getal links van i
            // while in de for loop want voor elk getal moet er net zo lang naar links worden gegaan totdat juiste positie
            while(j > -1 && key < list[j]) { // while niet helemaal links && getal om te checken kleiner dan het getal links ervan
                // get getal links is kleiner als de code in de while loop afgaat, er moeten dus 2 getallen worden omgedraaid
                // deze getallen zijn j en j + 1
                tmp =  list[j]; // tijdelijk opslaan omdat er een getal wordt overschreden en dus niet beschikbaar is
                list[j] = list[j + 1]; // getal rechts wordt naar links verplaats
                list[j + 1] = tmp;// getal links wordt naar rechts verplaats
                j--; // verder kijken op j-- dus een plekje naar links
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] array = {9,1,2,3,4,5,6,7,5,3,3,765,345,224,654,2,4,3,6,3,2,76,22,55,43,532,13,4,6,4,3,1,3,4,5};
        InsertionSort i = new InsertionSort();
        System.out.println(Arrays.toString(i.insertionSort(array)));
    }

}
