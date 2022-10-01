import javafx.util.Pair;

import java.util.*;

class Student1 extends Object {
    public Student1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    int roll;
    String name;

//    @Override
//    public int hashCode() {
//        return roll;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return roll == obj.hashCode();
//    }
}

public class Collections {
    static void lists() {
        List<Integer> ll = new LinkedList<>(); // linked list

        List<Integer> al = new ArrayList<>(); // 16->(16+16/2)24, not synchronized
        Vector<Integer> v = new Vector<>(); // 16-> (16+16) 32, synchronized
        v.add(10); // add at  the end
        al.add(10);
        al.set(0, 20); // arr[0] = 20;
        al.addAll(v); // insert all elements of vector at the end
        al.size();


        //16, 24, 36, 45

        //[1, 2, 3, 44]
        // [1, 2, 3, 44, 9, 15]
        // [1, 2, 3, 44, 9, 15, 19, 0, 0]
        //capacity = 9;
        //size = 6
        //size<capacity

    }

    static void sets() {
        // set -> unique elements

        Set<Integer> hs = new HashSet<>(); // hashing -> O(1), O(1)
        Set<Integer> ts = new TreeSet<>(); // tree -> logn, logn
        Set<Integer> lhs = new LinkedHashSet<>(); // linked list -> o(1), o(n)
        hs.add(97);
//        System.out.println(hs.add(97));
        System.out.println(hs.contains(97));
        System.out.println(hs.contains(101));

        hs.add(54);
        hs.add(578);
        hs.add(80);
        hs.add(87);
        System.out.println(hs);

        ts.add(97);
        ts.add(54);
        ts.add(578);
        ts.add(80);
        ts.add(87);
        System.out.println(ts);

        lhs.add(97);
        lhs.add(54);
        lhs.add(578);
        lhs.add(80);
        lhs.add(87);
        System.out.println(lhs);


        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it);
            it.next();
        }

    }

    static void pairs() {
        Pair<Integer, Integer> p = new Pair<>(10, 20);
        System.out.println(p.getKey());
        System.out.println(p.getValue());
        List<Pair<Integer, Integer>> li = new ArrayList<>();
        li.add(new Pair<>(10, 20));
        li.add(new Pair<>(11, 21));
        li.add(new Pair<>(19, 22));
        HashSet<Pair<Integer, Integer>> a = new HashSet<>();
        a.add(new Pair<>(10, 20));
        a.add(new Pair<>(10, 20));
        System.out.println(a);
        //1->(3, 10)
        System.out.println(li);

    }

    static void maps() {
//        // key, value
//        Map<Student1, Integer> hm = new HashMap<>();
//        hm.put(new Student1(1, "ab"), 20);
//        hm.put(new Student1(1, "ab"), 40);
//        System.out.println(hm);
//        System.out.println(hm);
//
//        System.out.println(new Student1(1, "ab").hashCode());
//        System.out.println(new Student1(1, "ab").hashCode());
////
        Map<Integer, String> tm = new TreeMap<>();
        Map<Integer, Integer> lhm = new LinkedHashMap<>();
        tm.put(1, "1");
        tm.put(2, "2");
        tm.put(1, "1456");
        System.out.println(tm.get(1));

        for (Integer key : tm.keySet()) {
            System.out.println(key + " " + tm.get(key));
        }

//        System.out.println(tm.containsKey(10)); // O(1) // hashing
//        System.out.println(tm.containsValue(10)); // O(n)
////        Set<Map.Entry<Integer, String>> it = tm.entrySet();
////        System.out.println(it);
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        Iterator<Integer> ii = hs.iterator();

        Iterator<Map.Entry<Integer, String>> it = tm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> cur = it.next();
            System.out.println(cur.getKey() + " " + cur.getValue());
        }
    }

    public void stack() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st.pop());
        System.out.println(st.pop());
        //LIFO / FILO
    }

    static public void queue() {
//        Queue<Integer> q = new PriorityQueue<>();
//        q.offer(10); //execption
//        q.offer(20); //execption
//        q.add(10);
//
//        q.poll();
//        q.remove();
//        //FIFO, LILO
//        ArrayDeque<Integer> dq = new ArrayDeque<>();
//        dq.addFirst(10);
//        dq.addLast(20);
//        dq.removeLast();
//        dq.removeFirst() ;
        // min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.offer(-1);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


    }

    public static void main(String[] args) {
        queue();

    }
}
