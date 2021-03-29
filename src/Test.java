public class Test {

    public static void main(String[] args) throws Exception {

        //different testing conditions
        SortedArrayList<Integer> a = new SortedArrayList<>();
        //SortedLinkedList<Integer> a = new SortedLinkedList<>();

        //Test condition 1 checks size at empty and checks for exception on a get call
        System.out.println(a.size());
        System.out.println(a.get(2));

        //Test condition 2 checks add, size, and get functions
/*        a.add(3);
        a.add(6);
        a.add(23);
        a.add(55);
        a.add(16);
        a.add(22);
        a.add(1);
        a.add(10000);
        a.add(69);
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.get(0));
        System.out.println(a.get(7));*/

        //Test condition 3 checks that array maintains proper order
/*        a.add(10);
        System.out.println(a.get(0));
        a.add(5);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        a.add(1);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));*/

        //Test condition 4 checks for exception handling on invalid position get and remove calls
/*        a.add(5);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.remove(0));
        System.out.println(a.get(0));*/

        //Test condition 5 checks remove function
/*        a.add(5);
        a.add(15);
        a.add(25);
        System.out.println(a);
        System.out.println(a.remove(1));
        System.out.println(a);*/

    }
}
