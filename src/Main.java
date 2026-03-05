import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }
    public static void task1(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,2,3,5,2,34,23));
        List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
    }
    public static void task2(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello", "mountain","life"));
        List<String> upperCase = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);
    }
    public static void task3(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello", "Mountain","life"));
        List<String> h = list.stream().map(s -> s.toLowerCase()).filter(n -> n.startsWith("h")).collect(Collectors.toList());
        System.out.println(h);
    }
    public static void task4(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,2,3,5,2,34,23));
        List<Integer> sorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorted);
    }
    public static void task5(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,2,3,5,2,34,23));
        OptionalInt max = list.stream().mapToInt(n -> (int)n).max();
        System.out.println(max);
        OptionalInt min = list.stream().mapToInt(n -> (int)n).min();
        System.out.println(min);
    }
    public static void task6(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,1,3,2,3,23,1,34,5,2,34,23));
        Set<Integer> list2 = list.stream().map(n -> (int)n).collect(Collectors.toSet());
        System.out.println(list2);
    }
    public static void task7(){
        ArrayList<String> aa = new ArrayList<>(Arrays.asList("Azamat", "Saparmurat", "Almambet"));
        String result = aa.stream().collect(Collectors.joining(", "));
        System.out.println(result);
    }
    public static void task8(){
        ArrayList<Student> list = new ArrayList<>();
        Student first = new Student("Azamat","COMSE25",19,3.2);
        Student second = new Student("Abdulla", "COMSE25",18,3.4);
        Student third = new Student("Ilgiz", "COMCEH25",18,2.9);
        Student fourth = new Student("Yaroslav", "COMCEH25",18,2.4);
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        List<String> comse = list.stream().filter(n -> n.group.equals("COMSE25")).map(n -> n.getName()).collect(Collectors.toList());
        List<String> comceh = list.stream().filter(n -> n.group.equals("COMCEH25")).map(n -> n.getName()).collect(Collectors.toList());
        System.out.println(comse);
        System.out.println(comceh);
    }
    public static void task9(){
        ArrayList<Student> list = new ArrayList<>();
        Student first = new Student("Azamat","COMSE25",19,3.2);
        Student second = new Student("Abdulla", "COMSE25",18,3.4);
        Student third = new Student("Ilgiz", "COMCEH25",18,2.9);
        Student fourth = new Student("Yaroslav", "COMCEH25",18,2.4);
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);

        OptionalDouble averageGpa = list.stream().mapToDouble(n -> (double)n.gpa).average();
        System.out.println(averageGpa);
    }
    public static void task10(){
        ArrayList<Student> list = new ArrayList<>();
        Student first = new Student("Azamat","COMSE25",19,4.0);
        Student second = new Student("Abdulla", "COMSE25",18,3.7);
        Student third = new Student("Ilgiz", "COMCEH25",18,3.8);
        Student fourth = new Student("Yaroslav", "COMCEH25",18,2.4);
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        List<String> top = list.stream().filter(s -> s.gpa > 3.5).map(n -> n.getName()).toList();
        System.out.println(top);
    }
    public static void task11(){
        ArrayList<Student> list = new ArrayList<>();
        Student first = new Student("Azamat","COMSE25",19,4.0);
        Student second = new Student("Abdulla", "COMSE25",18,3.7);
        Student third = new Student("Ilgiz", "COMCEH25",18,3.8);
        Student fourth = new Student("Yaroslav", "COMCEH25",18,2.4);
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        long quan = list.stream().filter(n -> n.gpa > 3.5).count();
        System.out.println(quan);
    }
}