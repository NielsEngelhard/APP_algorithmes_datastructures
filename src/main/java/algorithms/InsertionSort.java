package algorithms;

public class InsertionSort implements Sort {

    public void sortArray(int[] list) {
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
    }
}
