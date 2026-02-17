import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> scoreSystem = new HashMap<>();
//        task1(scoreSystem);
//        task2(scoreSystem);
//        task3(scoreSystem);
//        task4(scoreSystem);
//        task5(scoreSystem);
//        task6(scoreSystem);
//        task7(scoreSystem);
//        task8(scoreSystem,"Aida",90,99);
//        task9(scoreSystem);
//        task10(scoreSystem);
//        task11(scoreSystem);
//        task12("Java is fun and java is powerful and fun");
//        task13("Mississippi");
//        task14();
//        task15();
//        task16();
//        task17();
//        task18();
//        task19();
//        task20();
//        task21();
//        task22();
    }
    public static void task1(HashMap<String, Integer> scoreSystem){
        scoreSystem.put("Aida",85);
        scoreSystem.put("Azat",92);
        scoreSystem.put("Dana",77);
        System.out.println(scoreSystem);
        System.out.println(scoreSystem.size());
    }
    public static void task2(HashMap<String, Integer> scoreSystem){
        boolean Acheck = scoreSystem.containsKey("Aida");
        boolean Mcheck = scoreSystem.containsKey("Mira");
        if(Acheck) System.out.println("Aida is in Map");
        else System.out.println("Aida is out of Map");
        if(Mcheck) System.out.println("Mira is in Map");
        else System.out.println("Mira is out of Map");

    }
    public static void task3(HashMap<String,Integer> scoreSystem){
        scoreSystem.put("Dana",80);
        System.out.println(scoreSystem);
    }
    public static void task4(HashMap<String, Integer> scoreSystem){
        scoreSystem.remove("Azat");
        System.out.println(scoreSystem);
    }
    public static void task5(HashMap<String, Integer> sc){
        System.out.println(sc.isEmpty());
        sc.clear();
        sc.put("Azamat",100);
        sc.put("Abdulla",90);
        sc.put("Atai",70);
        System.out.println(sc);
    }
    public static void task6(HashMap<String, Integer> sc){
        int c = sc.getOrDefault("Mira",-1);
        if(c == -1) System.out.println("Not found");
        int a = sc.getOrDefault("Azamat",1000);
        int b = sc.getOrDefault("Abdulla", 1000);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void task7(HashMap<String,Integer> sc){
        sc.putIfAbsent("Aida",90);
        sc.putIfAbsent("Mira",88);
        System.out.println(sc);
        //I guess the reason is the absence of Mira in that Map before. Aida in first example already was there
    }
    public static void task8(HashMap<String, Integer> sc, String name, int oldValue,int newValue){
        sc.replace(name,oldValue,newValue);
        System.out.println(sc);
        sc.replace("Aktan",20,31);
        System.out.println(sc);
        //Aktan does not exist in this Map. Nothing is going to be replaced
    }
    public static void task9(HashMap<String,Integer> sc){
        for(String i : sc.keySet()){
            System.out.println(i);
        }
        for(int y : sc.values()){
            System.out.println(y);
        }
        for(Map.Entry<String, Integer> entry : sc.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void task10(HashMap<String, Integer> sc){
        int count = 0;
        for(int i : sc.values()){
            if(i>= 80) count++;
        }
        System.out.println(sc);
        System.out.println(count);
    }
    public static void task11(HashMap<String,Integer> sc){
        int count = 0;
        String key = "";
        for(Map.Entry<String,Integer> entry : sc.entrySet()) {
            if(entry.getValue() > count){
                count = entry.getValue();
                key = entry.getKey();
            }
        }
        System.out.println(key + " : " + count);
    }
    public static void task12(String phrase){
        HashMap<String, Integer> counter = new HashMap<>();
        phrase = phrase.toLowerCase();
        String[] aphrase = phrase.split(" ");
        for(String i : aphrase){
            int val = counter.getOrDefault(i,0);
            counter.put(i,val+1);
        }
        System.out.println(counter);
    }
    public static void task13(String freq){
        HashMap<String, Integer> c = new HashMap<>();
        freq = freq.toLowerCase();
        String[] afreq = freq.split("");
        for(String i : afreq){
            int val = c.getOrDefault(i, 0);
            c.put(i,val+1);
        }
        System.out.println(c);
    }
    public static void task14(){
        String[] words = {"hi", "book", "java", "sun", "loop", "map"};
        HashMap<Integer, ArrayList<String>> groups = new HashMap<>();

        for (String w : words) {
            int len = w.length();
            // Если папки для такой длины еще нет — создаем пустую
            if (!groups.containsKey(len)) {
                groups.put(len, new ArrayList<>());
            }
            // Добавляем слово в нужную папку
            groups.get(len).add(w);
        }
        System.out.println(groups);
    }
    public static void task15(){
        String word = "swiss";
        HashMap<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (counts.get(c) == 1) {
                System.out.println("first char: " + c);
                return;
            }
        }
        System.out.println("None");
    }
    public static void task16(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> seen = new HashMap<>(); // Число -> его индекс

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (seen.containsKey(diff)) {
                System.out.println("Indexes: " + seen.get(diff) + " и " + i);
                return;
            }
            seen.put(nums[i], i);
        }
    }
    public static void task17(){
        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        HashMap<String, Integer> counts = new HashMap<>();

        for (String f : fruits) {
            counts.put(f, counts.getOrDefault(f, 0) + 1);
        }

        System.out.print("Уникальные: ");
        for (String name : counts.keySet()) {
            if (counts.get(name) == 1) System.out.print(name + " ");
        }

        System.out.print("\nДубликаты: ");
        for (String name : counts.keySet()) {
            if (counts.get(name) > 1) {
                System.out.print(name  +  counts.get(name));
            }
        }
    }
    public static void task18(){
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 2); // Добавляем в другом порядке
        map2.put("A", 1);

        System.out.println("Maps are equal?" + map1.equals(map2));
        System.out.println("Code of the first: " + map1.hashCode());
        System.out.println("Code of the second: " + map2.hashCode());
    }
    public static void task19(){
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 40);
        students.put("Azat", 80);
        students.put("Dana", 50);
        Iterator<Map.Entry<String, Integer>> it = students.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < 60) {
                it.remove();
            }
        }
        System.out.println(students);
    }
    public static void task20(){
        HashMap<String, Integer> scores1 = new HashMap<>();
        scores1.put("Aida", 40);
        scores1.put("Azat", 35);
        scores1.put("Dana", 50);
        HashMap<String, Integer> scores2 = new HashMap<>();
        scores2.put("Azat", 10);
        scores2.put("Dana", 5);
        scores2.put("Mira", 45);
        for (String name : scores2.keySet()) {
            int scoreToAdd = scores2.get(name);
            scores1.merge(name, scoreToAdd, (oldVal, newVal) -> oldVal + newVal);
        }

        System.out.println(scores1);
    }
    public static void task21(){
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Ivan", 90); students.put("Anna", 90); students.put("Oleg", 70);
        HashMap<Integer, ArrayList<String>> inverted = new HashMap<>();
        for (String name : students.keySet()) {
            int score = students.get(name);
            if (!inverted.containsKey(score)) {
                inverted.put(score, new ArrayList<>());
            }
            inverted.get(score).add(name);
        }
        System.out.println(inverted);}
    public static void task22(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 5); map.put("banana", 10); map.put("kiwi", 8); map.put("map", 2);

        for (int i = 0; i < 2; i++) {
            String topWord = "";
            int max = -1;

            for (String word : map.keySet()) {
                if (map.get(word) > max) {
                    max = map.get(word);
                    topWord = word;
                }
            }
            System.out.println((i + 1) + ". " + topWord + " - " + max );
            map.remove(topWord);
        }
    }
}