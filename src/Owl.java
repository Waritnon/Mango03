public class Owl extends Animal implements Flyable{
    @Override
    public String sound(){
        return "hoot";
    }

    @Override
    public void fly() {
        System.out.println("...");
    }

    @Override
    public void glide() {
        System.out.println("...");
    }
}
