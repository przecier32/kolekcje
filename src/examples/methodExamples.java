package examples;

import java.util.*;

public class methodExamples {
    public static void main(String[] args) {


/*        StringBuilder stringBuilder = new StringBuilder("Losowy tekst");

        String str;
        String str1 = "cos";
        String str2 = "placek";

        stringBuilder.append(str1);
        stringBuilder.append(1);
        stringBuilder.append(str1 + str2);

        str = stringBuilder.toString();

        System.out.println(str);

        System.out.println(stringBuilder.capacity());

        stringBuilder.ensureCapacity(30);

        System.out.println(stringBuilder.capacity());

        System.out.println(stringBuilder.charAt(16));

        System.out.println(stringBuilder.codePointAt(1));

        System.out.println(stringBuilder.delete(2,5));

        String substring = stringBuilder.substring(12, 15);

        System.out.println(substring);

        System.out.println(stringBuilder.reverse());

        System.out.println(stringBuilder.insert(5,2));*/


        //------------Listy-----------

/*
        List<Human> humans = new ArrayList<>();

        Human human1 = new Human("Piotr", "Wolkanin", 27);
        Human human2 = new Human("Jan", "Kowalski", 59);
        Human human3 = new Human("Andrzej", "Nowak", 46);

        humans.add(human1);
        humans.add(human2);
        humans.add(human3);

        for (Human human : humans) {

            System.out.println(human.getHuman());

        }


        List<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

//        for (Integer a : numberList) {
//            System.out.println(a);
//        }




        List<Integer> numberList2 = new ArrayList<>();

        numberList.add(40);
        numberList.add(50);
        numberList.add(60);

//        numberList.addAll(numberList2);
//
//        for (Integer e : numberList) {
//            System.out.print(" " + e);
//        }
//
//        numberList.clear();
//        System.out.println(numberList);

        System.out.println();
        System.out.println(numberList.size());

        Object[] object = numberList.toArray();

        for (Object obj : object) {
            System.out.print(obj + " ");
        }


        ListIterator<Integer> numbersIterator = numberList.listIterator();

        while (numbersIterator.hasNext()) {
            System.out.println(numbersIterator.next());
        }

        System.out.println(numberList.get(0));

        System.out.println(numberList2.size());
*/


        //---------mapy----------


/*        Map<String, String> cities = new HashMap<>();

        cities.put("Polska", "Warsaw");
        cities.put("Polska", "Szczecin");
        cities.put("Niemcy", "Berlin");
        cities.put("Czechy", "Praga");
        cities.put("Niemcy", "Hamburg");


        System.out.println(cities.containsKey("Polska"));
        System.out.println(cities.containsKey("Szwecja"));

        System.out.println("Mapa zawiera: " + cities);
        System.out.println("Klucze: " + cities.keySet());
        System.out.println("Wartosci: " + cities.values());

        cities.remove("Niemcy");

        System.out.println("Usuniete Niemcy: " + cities);

        cities.replace("Polska","Szczecin", "Kielce");
        System.out.println("Zmiana w Polsce: " + cities);*/


        //---------sety-----------

        Set<String> czlowieki = new HashSet<>();

        czlowieki.add("Piotrek");
        czlowieki.add("Janek");
        czlowieki.add("Ala");
        czlowieki.add("Piotrek");

        System.out.println(czlowieki);

//        czlowieki.clear();
//        System.out.println(czlowieki);

        System.out.println("Czy set zawiera Ale? " + czlowieki.contains("Ala"));




    }
}
