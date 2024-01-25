import java.util.ArrayList;

public class Fruit {
  }
public class Apple extends Fruit {
  }
public class Orange extends Fruit {
  }

// Создание класса Box, в который можно складывать фрукты.
public class Box<T extends Fruit> {
  private ArrayList<T> fruits;
  public Box() {
    fruits = new ArrayList<>();
  }

// Метод getWeight(), который высчитывает вес коробки на основе веса каждого типа фруктов.
  public float getWeight() {
    if (fruits.size() == 0) {
      return 0;
    }
    
    float weight = 0;
    for (T fruit : fruits) {
      if (fruit instanceof Apple) {
        weight += 1.0f;
      } else if (fruit instanceof Orange) {
        weight += 1.5f;
      } 
    }
    return weight;
  }

// Метод compare(), который позволяет сравнить вес двух коробок.
public boolean compare(Box<?> otherBox) {
    return Math.abs(getWeight() - otherBox.getWeight()) < 0.0001; 
  }

/*  Метод, который позволяет пересыпать фрукты из текущей коробки в другую,  
учитывая, что коробки относятся к одному типу фруктов. */
public void transferFruits(Box<T> otherBox) {    
    otherBox.fruits.addAll(fruits);
    fruits.clear();
  }

// Метод добавления фрукта в коробку.
public void addFruit(T fruit) {
    this.fruits.add(fruit);
  }
}

public class Lesson_10 {
  public static void main (String[] args) {
    Box<Apple> appleBox1 = new Box<>();
    appleBox1.addFruit(new Apple());
    appleBox1.addFruit(new Apple());
    
    Box<Apple> appleBox2 = new Box<>();
    appleBox2.addFruit(new Apple());

    Box<Orange> orangeBox1 = new Box<>();
    orangeBox1.addFruit(new Orange());

    System.out.println("Вес коробки с яблоками №1: " + appleBox1.getWeight());
    System.out.println("Вес коробки с яблоками №2: " + appleBox2.getWeight());
    System.out.println("Вес коробки с апельсинами №1: " + orangeBox1.getWeight());

    System.out.println("Вес коробки с яблоками №1 и коробки с яблоками №2 одинаковый? " + appleBox1.compare(appleBox2));
    System.out.println("Вес коробки с яблоками №1 и коробки с апельсинами №1 одинаковый? " + appleBox1.compare(orangeBox1));
  
  
    System.out.println("Вес коробки с яблоками №1 после транспортировки: " + appleBox1.getWeight());
    System.out.println("Вес коробки с яблоками №2 после транспортировки: " + appleBox2.getWeight());
  }
}