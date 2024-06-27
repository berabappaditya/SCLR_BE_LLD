package Bird;

public class Pigeon implements Bird {
    static int count=0;
    
    public void fly() {
        System.out.println("Pegeone can fly");
    }

    public void swim() {
        System.out.println("Pegeone can swim");
    }

    public  static void increaseCount() {
        count++;
    }
}
