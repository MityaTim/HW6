package HW6;

public class Dog extends Animal {
    protected int swimDistance = 10;
    protected int runDistance = 500;

    public Dog(String name){
        super(name);
    }

    public void pinfo(){
        System.out.println("Dog's max swim distance is " + swimDistance + " meters");
        System.out.println("Dog's max run distance is " + runDistance + " meters");
    }

    public void info(boolean idCountFlag){
        if (idCountFlag == true) {
            System.out.println("Dog's name is " + name);
            System.out.println("Current amount number of animals are " + super.getAnimalCounter());
        }
        else {
            System.out.println("Dog's name is " + name);
        }
    };

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= this.swimDistance){
            System.out.println("Dog " + super.name + " swam exactly " + swimDistance + " meters");
        }
        else {
            System.out.println("Dog " + super.name + " is drowned!");
        }
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= this.runDistance){
            System.out.println("Dog " + super.name + " run exactly " + runDistance + " meters");
        }
        else {
            System.out.println("Dog " + super.name + " is exhausted!");
        }
    }
}
