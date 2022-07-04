import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class changeIndex {

    public static void listIndexChanger(List<Integer> num, int a, int b){

        System.out.println("Kolejnosc listy: " + num);

        Collections.swap(num,a,b);

        System.out.println("Kolejnosc listy po zamianie miejsc: " + num);

    }

    public static  void arrayIndexChanger (int[] arr, int a1, int b1){

        System.out.print("Kolejnosc tabeli przed zamiana koljnosci: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int temp = arr[a1];
        arr[a1] = arr[b1];
        arr[b1] = temp;
        System.out.print("Kolejnosc tabeli po zmianie: ");

        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();


        }


}
