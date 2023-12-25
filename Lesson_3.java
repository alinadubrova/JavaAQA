public class Lesson_3 {
    public static void main(String [] args) {
        checkSum();             // task1
        checkNum();             // task2
        checkNumber();          // task3
        printLine();            // task4
        checkYear();            // task5
        printChangedNum();      // task6
        printArray();           // task7
        printEnlargedArray();   // task8
        printSquareArray();     // task9
        printOneArray(printLenArray(4, 5)); // task10
    }
    public static void checkSum() {
        int a=10, b=5;
        System.out.println(((a+b)>=10) && ((a+b)<=20) ? "true" : "false");
    }
    public static void checkNum() {
        int a=10;
        System.out.println(a>=0 ? "Число положительное" : "Число отрицательное");
    }
    public static void checkNumber() {
        int a=12;
        System.out.println(a>=0 ? "false" : "true");
    }
    public static void printLine() {
        String str="Hello";
        int a=4;
        for (int i=0; i<a; i++) {
            System.out.print(str + "\n");
        }
    }
    public static void checkYear() {
        int year=2024;
        System.out.println(((year%4==0 && year%100!=0) | (year%400==0)) ? "true" : "false");
    }
    public static void printChangedNum() {
        int [] myArray = {0, 0, 1, 1};
        for (int i=0; i<myArray.length; i++) {
            if (myArray[i]==0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }
        for (int i=0; i<myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
    public static void printArray() {
        int i=1;
        while (i<=100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    } 
    public static void printEnlargedArray() {
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<array.length; i++) {
            if (array[i]<6) {
                array[i] = array[i]*2;
            } else {
                array[i] = array[i];
            }
        }
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printSquareArray() {
        int[][] twoDimArray = new int[5][5];
            for (int i=0; i<twoDimArray.length; i++) {
                for (int j=0, x=twoDimArray.length; j<twoDimArray.length; j++, x--) {
                    if (i==j | i==x-1) {
                        twoDimArray[i][j]=1;
                    } else {
                        twoDimArray[i][j]=twoDimArray[i][j];
                    }
                    System.out.print(" " + twoDimArray[i][j] + " ");
                }
            System.out.println();
            }
    }
    public static int[] printLenArray(int len, int initialValue) {
        int myArray[] = new int[len];
            for (int i=0; i<myArray.length; i++) {
                myArray[i]=initialValue;
            }
        return myArray;
    } 
    public static void printOneArray(int[] inputArray) {
        for (int i=0; i<inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}