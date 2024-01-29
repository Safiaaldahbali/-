/*
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
*/

/*
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
*/


/*
public class PrintArrayElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
*/

/*
        import java.util.Scanner;

public class InputArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new

                Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
*/
/*
public class ArrayUtils {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);
    }
}
*/


/*
        import java.util.Scanner;

public class ArrayUtils {
    public static void inputArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        inputArray(numbers);

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
/*


public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("John", 20);
        students[1] = new Student("Emily", 22);
        students[2] = new Student("Michael", 21);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getName());
            System.out.println("Age: " + students[i].getAge());
            System.out.println();
        }
    }
}
*/
