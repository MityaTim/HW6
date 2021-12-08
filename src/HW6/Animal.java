package HW6;

abstract class Animal {
    protected static int animalCounter;
    protected String name;

    public Animal(String name){
        animalCounter++;
        this.name = name;
    }

    public final int getAnimalCounter() {
        return animalCounter;
    }

    public void info(){
        System.out.println("Animal name is " + name);
    }

    public abstract void swim(int swimDistance);
    public abstract void run(int runDistance);

}
