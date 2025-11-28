import java.util.*;

public class O90_Collections {

    public static void main(String[] args) {
        Collection<Integer> obj= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//        Collections obj1 = obj;
        obj.forEach(n-> System.out.println(n));
        Collections.reverse((List<Integer>)obj);
        System.out.println(obj);

        ArrayList<Integer> obj1 = new ArrayList<>(Arrays.asList(1,6,5,7,2,3,4));
        Collections.sort(obj1);
        Collections.addAll(obj1,9,8,6);

        System.out.println(obj1);

    }
}
