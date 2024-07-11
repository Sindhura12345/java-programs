import java.util.*;
public class LList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("Sindhu");
        list.addFirst("is");
        list.addFirst("she");
        System.out.println(list);
        list.addLast("ra");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.print("NULL");
        list.removeLast();
        System.out.println(list);
        //list.remove(index);
        list.removeFirst();
        System.out.println(list);
        list.add(2,"girl");
        System.out.println(list);

    }
}
