import java.util.ArrayList;
import java.util.Collections;

public class comparableExample implements Comparable<comparableExample> {
    int age;
    String Name;
    int id;
    public comparableExample(int id, String Name, int age) {
        this.age=age;
        this.id=id;
        this.Name=Name;
    }
    public String toString(){
        return id+" "+Name+" "+age;
    }
    public static void main(String[] args) {
        ArrayList<comparableExample> arr= new ArrayList<comparableExample>();
        arr.add(new comparableExample(1,"Aviral",20));
        arr.add(new comparableExample(15,"Avi",22));
        arr.add(new comparableExample(12,"Av",18));
        arr.add(new comparableExample(32,"Ighd",32));
        for(comparableExample x: arr){
            System.out.println(x);
        }
        Collections.sort(arr);
        System.out.println(arr);
    }

    @Override
    public int compareTo(comparableExample o) {
        if(this.id>o.id)
        return -1;
        return 0;
    }
}
