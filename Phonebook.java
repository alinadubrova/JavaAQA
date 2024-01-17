import java.util.*;

/* класс для хранения списка фамилий и телефонных номеров, который учитывает, 
что под одной фамилией может быть несколько телефонов */
public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    // Добавляет новые записи в телефонный справочник
    public void add(String surname, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(surname, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(surname, numbers);
    }

    // Ищет номер телефона по фамилии
    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "123456789");
        phoneBook.add("Petrov", "456789123");
        phoneBook.add("Sidorov", "789123456");
        phoneBook.add("Ivanov", "987456321");

        // Получим номер телефона по фамилии
        List<String> smithNumbers = phoneBook.get("Ivanov");
        for (String number : smithNumbers) {
            System.out.println("Номер телефона Иванова: " + number);
        }
        
        // Поищем номер телефона по фамилии, которой нет в телефонном справочнике
        List<String> parkerNumbers = phoneBook.get("Popov");
        if (parkerNumbers.isEmpty()) {
            System.out.println("Номер телефона Попова не найден.");
        }
    }
}