/*
public class Main {
    public static boolean isMultiple(long n, long m) {
        if (m != 0 && n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        long n = 15;
        long m = 3;

        if (isMultiple(n, m)) {
            System.out.println(n + " is a multiple of " + m);
        } else {
            System.out.println(n + " is not a multiple of " + m);

        }
    }
}
 */

/*
public class Main {
    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        int i = 6;

        if (isEven(i)) {
            System.out.println(i + " is even");
        } else {
            System.out.println(i + " is odd");
        }
    }
}
 */

/*
public class Main {
    public static int sumPositiveIntegers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = sumPositiveIntegers(n);

        System.out.println("The sum of positive integers up to " + n + " is: " + sum);
    }

}
 */

/*
public class Main {
    public static int sumOfSquares(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfSquares(n);

        System.out.println("The sum of squares of positive integers up to " + n + " is: " + sum);
    }
 */

/*
public class Main {
    public static int sumOddPositiveIntegers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sumOddPositiveIntegers(n);

        System.out.println("The sum of odd positive integers up to " + n + " is: " + sum);
        }
    }
 */

/*
public class Main {
    public static int sumOfSquares(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of squares of positive integers up to " + n + " is: " + sum);
    }
        int n = 5;
        int sum = sumOfSquares(n);

        System.out.println("The sum of squares of positive inters up to"+n+"is:"+sum);
 }
}
 */

/*
public class Main {
    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' |
                | ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = countVowels(str);


        System.out.println("The number of vowels in the string \"" + str + "\" is: " + vowelCount);
    }
}
 */
/*
public class Main {
    public static String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String sentence = "Let's try, Mike!";
        String result = removePunctuation(sentence);

        System.out.println("Original sentence: " + sentence);
        System.out.println("After removing punctuation: " + result);
    }
}
 */
/*
public class Flower {
    private String name;
    private int numPetals;
    private float price;

    public Flower(String name, int numPetals, float price) {
        this.name = name;
        this.numPetals = numPetals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNumPetals() {
        return numPetals;
    }

    public void setNumPetals(int numPetals) {
        this.numPetals = numPetals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void main(String[] args) {
        // Create a Flower object
        Flower rose = new Flower("Rose", 12,

2.5f);

        // Get and print the flower's details
        System.out.println("Name: " + rose.getName());
        System.out.println("Number of petals: " + rose.getNumPetals());
        System.out.println("Price: $" + rose.getPrice());

        // Update the flower's details using the setter methods
        rose.setName("Red Rose");
        rose.setNumPetals(16);
        rose.setPrice(3.2f);

        // Get and print the updated flower's details
        System.out.println("\nUpdated Details:");
        System.out.println("Name: " +

rose.getName());
        System.out.println("Number of petals: " + rose.getNumPetals());
        System.out.println("Price: $" + rose.getPrice());
    }
}
*/

/*
public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }


    public void updateCreditLimit(int newLimit) {
        limit = newLimit;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }


    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }

        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        CreditCard card = new CreditCard("John Smith", "ABC Bank",

"1234 5678 9012 3456", 5000, 500);

        System.out.println("Customer: " + card.getCustomer());
        System.out.println("Bank: " + card.getBank());
        System.out.println("Account: " + card.getAccount());
        System.out.println("Limit: $" + card.getLimit());
        System.out.println("Balance: $" + card.getBalance());

        card.updateCreditLimit(7000);
        System.out.println("\nUpdated Credit Limit: $" + card.getLimit());
    }
}

 */
/*
public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public void updateCreditLimit(int

newLimit) {
        limit = newLimit;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {

        return balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }

        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        if (amount < 0) {
            return; // Ignore negative payment amount
        }

        balance -= amount;
    }


    public static void main(String[] args) {
        CreditCard card = new CreditCard("John Smith", "ABC Bank", "1234 5678 9012 3456", 5000, 500);

        System.out.println("Customer: " + card.getCustomer());
        System.out.println("Bank: " + card.getBank());
        System.out.println("Account: " + card.getAccount());
        System.out.println("Limit: $" + card.getLimit());
        System.out.println("Balance: $" + card.getBalance());

        card.makePayment(200);
        System.out.println("\nBalance after payment: $" + card.getBalance());


        card.makePayment(-100); // Ignored negative payment amount
        System.out.println("Balance after negative payment: $" + card.getBalance());
    }
}

 */

/*
public class CreditCard {
    // CreditCard class implementation (same as Code Fragment 1.5)
}

public class Main {
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Smith", "ABC Bank", "1234 5678 9012 3456", 5000, 500);
        wallet[1] = new CreditCard("Jane Doe", "DEF Bank", "9876 5432 1098 7654", 3500, 1000);
        wallet[2] = new CreditCard("Mike Johnson", "GHI Bank", "5678 9012 3456 7890", 2000, 800);

        for (int val = 1; val <= 16; val++) {

            wallet[0].charge(225);    // Charging Card 1
            wallet[1].charge(150);    // Charging Card 2
            wallet[2].charge(1000);   // Charging Card 3
        }

        for (CreditCard card : wallet) {
            System.out.println("Customer: " + card.getCustomer());
            System.out.println("Bank: " + card.getBank());
            System.out.println("Account: " + card.getAccount());
            System.out.println("Limit: $" + card.getLimit());
            System.out.println("Balance: $" + card.getBalance());
            System.out.println();
        }

    }
}

 */