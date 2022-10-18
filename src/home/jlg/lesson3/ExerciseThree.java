package home.jlg.lesson3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExerciseThree {


    public static void main(String[] args) {
        executeExercise();
    }

    private static void executeExercise(){
//        firstOneHundredIntegers();
            List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4));
            List<Integer> arr2 = new ArrayList<>();
//            copyArray(arr1, arr2);

            // check if values are copied
//            arr2.add(5);
//            System.out.println("Arr2 after copy ");
//            arr2.forEach(System.out::println);
//            System.out.println("Arr1 after copy");
//            arr1.forEach(System.out::println);

//              shuffleArray(arr1);
//              arr1.forEach(System.out::println);

//              reverseArray(arr1);

//        Set<Integer> set = new HashSet<>();
//        set.add(3);
//        set.add(6);
//        set.add(9);
//        set.add(3);
//        set.add(1);
//
//        System.out.println(set);
//
//        ArrayList<Integer> arr =toArrayList(set);
//
//        System.out.println(arr);


//        Map<Integer, String> map1 = new HashMap<>();
//        Map<Integer, String> map2 = new HashMap<>();
//
//        map1.put(1, "Unu");
//        map1.put(2, "Doi");
//        map1.put(3, "Trei");
//
//        copyMap(map1, map2);
//
//        System.out.println(map2);



    }

    private static void firstOneHundredIntegers() {

        List<Integer> frstOneHundredIntegers = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toList());
        frstOneHundredIntegers.remove(frstOneHundredIntegers.get(10));
        frstOneHundredIntegers.forEach(System.out::println);

    }

    private static void copyArray(List<Integer> arr1, List<Integer> arr2){
        arr1.forEach(el -> arr2.add(el));
    }

    private static void shuffleArray(List<Integer> arr){
        Random rnd = new Random();
        for (int i = 0; i < arr.size(); i++){
            int idx1 = rnd.nextInt(arr.size() - 1);
            int idx2 = rnd.nextInt(arr.size() - 1);

            if (idx1 != idx2){
                int tmp1 = arr.get(idx1);
                int tmp2 = arr.get(idx2);

                arr.remove(idx1);
                arr.add(idx1, tmp2);
                arr.remove(idx2);
                arr.add(idx2, tmp1);
            }
        }




    }

    private static void reverseArray(List<Integer> arr) {

        for (int i = 0, j = arr.size()-1 ; i < j; i++){
            arr.add(i, arr.remove(j));
        }

        System.out.println(arr);

    }

    private static ArrayList<Integer> toArrayList(Set<Integer> hashSet){
        ArrayList<Integer> array = new ArrayList<>();
        hashSet.forEach(el -> array.add(el));

        return array;

    }

    private static void copyMap(Map<Integer, String> map1, Map<Integer, String> map2){

        map1.forEach( (i, s) -> map2.put(i, s) );


    }

}

