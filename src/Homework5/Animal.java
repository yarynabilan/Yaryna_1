package Homework5;

class Animal {
    private int eyes;

    public Animal() {
        System.out.println("I am an animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    private String name;
    private int tail;
    private int paw;
    private int eyes;

    public Pet() {
        super();
        System.out.println("I am a pet");
        this.eyes = 2;
        tail = 1;
        paw = 4;
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet runs and jumps");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getPawCount() {
        return this.paw;
    }
}

class Dog extends Pet {
    public Dog(String name) {
        super();
        System.out.println("I am a dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super();
        System.out.println("I am a cat and my name is: " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Ralf");
        System.out.println("Number of paws: " + dog.getPawCount());

        Cat cat = new Cat("Grey");
        cat.sleep();
    }
}



