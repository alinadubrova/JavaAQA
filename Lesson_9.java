// Программа для определения количества чётных чисел в наборе случайно-сгенерированных чисел.
import java.util.Random;

public class countOfEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(10); 

        int evenCount = countOfEvenNumbers(numbers);
        System.out.println("Количество четных чисел: " + evenCount);
    }
    
    public static int[] generateRandomNumbers(int count) {
        Random random = new Random();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(); 
        }
        return numbers;
    }
    
    public static int countOfEvenNumbers(int[] numbers) {
        int evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) { 
                evenCount++;
            }
        }
        return evenCount;
    }
}

// Программа для манипуляций с коллекцией строк.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulateCollection {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Highload");
        strings.add("High");
        strings.add("Load");
        strings.add("Highload");
        
        // Посчитать, сколько раз объект «High» встречается в коллекции.
        int countHigh = Collections.frequency(strings, "High");
        System.out.println("Количество встречаемости \"High\": " + countHigh);
        
        // Определить, какой элемент в коллекции находится на первом месте.
        String firstElement = strings.isEmpty() ? "0" : strings.get(0);
        System.out.println("Первый элемент коллекции: " + firstElement);
        
        // Вернуть последний элемент коллекции.
        String lastElement = strings.isEmpty() ? "0" : strings.get(strings.size() - 1);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}

// Программа для сортировки строк по возрастанию и добавления их в массив.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("f10");
        strings.add("f15");
        strings.add("f2");
        strings.add("f4");
        strings.add("f4");
        
        Collections.sort(strings);
        
        String[] array = strings.toArray(new String[strings.size()]);
        
        System.out.println("Массив: " + Arrays.toString(array));
    }
}

// Программа для определения среднего возраста студентов мужского пола.

public class FourthExercise {
    Collection<Student> students = Arrays.asList(
        new Student("Дмитрий", 17, Gender.MAN),
        new Student("Максим", 20, Gender.MAN),
        new Student("Екатерина", 20, Gender.WOMAN),
        new Student("Михаил", 28, Gender.MAN)
        );
        
        private enum Gender {
            MAN,
            WOMAN
        }
        
        private static class Student {
            private final String name;
            private final Integer age;
            private final Sex gender;
    
        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        
        public String getName() {
            return name;
        }
        
        public Integer getAge() {
            return age;
        }
        
        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}

    int totalMenAge = 0;
    int menCount = 0;
    List<Student> potentialConscripts = new ArrayList<>();

    for (Student student : students) {
        if (student.getGender().equals("Мужской")) {
            totalMenAge += student.getAge();
            menCount++;

            if (student.getAge() >= 18 && student.getAge() <= 27) {
                potentialConscripts.add(student);
            }
        }
    }

    double avgMenAge = (double) totalMenAge / menCount;
    System.out.println("Средний возраст студентов мужского пола: " + avgMenAge);

    System.out.println("Студенты, которым грозит получение повестки в этом году:");
    for (Student student : potentialConscripts) {
        System.out.println(student.getName());
    }


// Программа для приема логинов и вывода в консоль логинов, начинающихся на букву f.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> logins = new ArrayList<>();

        // Прием от пользователя ввод различных логинов.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите логин: ");
            String login = scanner.nextLine();
 
            if (login.isEmpty()) {
                break;   // Если пользователь введет пустую строку - программа преращат приём данных от пользователя
            }

            if (login.charAt(0) == 'f') {
                logins.add(login);              
            }
        }

        System.out.println("Логины, начинающиеся на букву 'f':");
        for (String login : logins) {
            System.out.println(login);
        }
    }
}
