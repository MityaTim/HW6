package HW6;

public class Main {

    public static void main(String[] args) {
        Cat catA = new Cat("Phoebe");
        Cat catB = new Cat("Maks");
        Cat catC = new Cat("Tom");

        Dog [] dogs = new Dog [] {
                new Dog ("Chapa"),
                new Dog ("Reks"),
                new Dog ("Zver"),
                new Dog ("Grey"),
        };

        System.out.println("======== INFO ========");
        catA.info();
        catB.info(false);
        catC.info(true);
        dogs[0].info(false);
        for (int i = 2; i < dogs.length; i++){
            dogs[i].info(false);
        }
        dogs[1].info(true);

        System.out.println("======== Parameters info ========");
        catA.pinfo();
        dogs[0].pinfo();


        System.out.println("======== Let's swim ========");
        catA.swim(0);
        catB.swim(5);
        catC.swim(10);

        for (int i = 0; i < dogs.length; i++){
            dogs[i].swim(i*5);
        }

        System.out.println("======== Let's run ========");
        catA.run(100);
        catB.run(250);
        catC.run(300);

        for (int i = 0; i < dogs.length; i++){
            dogs[i].run(i*200);
        }

    }
}