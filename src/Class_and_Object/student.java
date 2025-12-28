package Class_and_Object;

public class student {
    int id;
    String name;

    public void insertData(int x, String y){
        id = x;
        name = y;
    }

    public static void main(String[] args) {
        student a = new student();
        a.id = 100;
        a.name = "Jack";

        System.out.println("id : " + a.id + " name : " + a.name);

        student b = new student();
        b.insertData(101, "Dilusha");
        System.out.println("id : " + b.id + " name : " + b.name);
    }
}
