public class Test {

    public static void main(String[] args) {

        //SortedArrayList<Integer> a = new SortedArrayList<>();
        SortedLinkedList<Integer> a = new SortedLinkedList<>();
        a.add(3);
        a.add(6);
        a.add(23);
        a.add(55);
        a.add(16);
        a.add(2);
        a.add(22);
        a.add(1);
        System.out.println(a.size());
        System.out.println(a.get(2));
        System.out.println(a.remove(2));
        System.out.println(a.size());
        System.out.println(a.get(2));
        System.out.println(a);
    }
}
