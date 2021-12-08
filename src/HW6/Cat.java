package HW6;

public class Cat extends Animal{
    protected int swimDistance = 0;
    protected int runDistance = 200;

    public Cat(String name){
        super(name);
    }

    public void pinfo(){
        System.out.println("Cat's max swim distance is " + swimDistance + " meters");
        System.out.println("Cat's max run distance is " + runDistance + " meters");
    }

    public void info(boolean idCountFlag){
        if (idCountFlag == true) {
            System.out.println("Cat's name is " + name);
            System.out.println("Current amount number of animals are " + super.getAnimalCounter());
        }
        else {
            System.out.println("Cat's name is " + name);
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= this.swimDistance){
            System.out.println("Cat " + super.name + " swam exactly " + swimDistance + " meters");
        }
        else {
            System.out.println("Cat " + super.name + " is drowned!");
        }
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= this.runDistance){
            System.out.println("Cat " + super.name + " run exactly " + runDistance + " meters");
        }
        else {
            System.out.println("Cat " + super.name + " is exhausted!");
        }
    }
}
