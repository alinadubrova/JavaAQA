public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog();
        dogBobik.run("Бобик", 550);
        Dog dogPantera = new Dog();
        dogPantera.swim("Пандора", 5);
        
        Cat catBarsik = new Cat();
        catBarsik.run("Барсик", 150);
        Cat catPantera = new Cat();
        catPantera.swim("Пантера", 2);

        System.out.println("Количество котов: " + Cat.catCount);
        System.out.println("Количество собак: " + Dog.dogCount);
        System.out.println("Количество животных: " + Animal.animalCount);

        Dish dish = new Dish(11);                  // Количество первоначально еды.

        Cat[] cats = new Cat[3];                   // Количество голодных котов.
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            cats[i].eat(dish, 4);                  // Сколько ест один кот.
        }

        for (Cat cat : cats) {
            System.out.println("Кот сытый: " + cat.isSatiety());
        }
        
        dish.addFood(2);
    }
}

class Animal {
    String name;
    static int animalCount = 0;
    
    public Animal() {
        animalCount++;
    }
    
    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    static int dogCount = 0;

    public Dog() {
        super();
        dogCount++;
    }

    public void run(String name, int distanceRun) {
        if (distanceRun <= 500) {
            System.out.println(name + " пробеждал " + distanceRun + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distanceRun + " м.");
        }
    }
    
    public void swim(String name, int distanceSwim) {
        if (distanceSwim <= 10) {
            System.out.println(name + " проплыл " + distanceSwim + " м.");
        } else {
            System.out.println(name + " не может проплыть" + distanceSwim + " м.");
        }
    }
}

class Cat extends Animal {
    static int catCount = 0;
    private boolean satiety;

    public Cat() {
        super();
        catCount++;
        satiety = false;            // Изначально кот голодный.
    }

    public void run(String name, int distanceRun) {
        if (distanceRun <= 200) {
            System.out.println(name + " пробежал " + distanceRun + " м.");
        } else {
            System.out.println(name + " не может пробежать" + distanceRun + " м.");
        }
    }

    public void swim(String name, int distanceSwim) {
        System.out.println("Коты не умеют плавать.");
    }
    
    public void eat(Dish dish, int amount) {
        if (dish.getFood() >= amount) {           // Если еды больше или столько, сколько надо коту, то
            dish.reduceFood(amount);              // вызываем метод на уменьшение количества еды и
            satiety = true;                       // кот сытый.
        } else {
            System.out.println("Недостаточно еды в тарелке.");
        }
    }
    
    public boolean isSatiety() {
        return satiety;
    }
}

class Dish {
    private int food;

    public Dish(int initialFood) {                  // Первоначальная еда.
        this.food = initialFood;
    }

    public int getFood() {
        return food;
    }

    public void reduceFood(int amount) {           // метод уменьшения еды
        if (food >= amount) {
            food -= amount;
            System.out.println(amount + " еды съедено.");
        } else {
            System.out.println("Недостаточно еды в тарелке.");
        }
    }

    public void addFood(int amount) {               // метод добавления еды
        food += amount;
        System.out.println(amount + " еды добавлено в тарелку.");
    }
}