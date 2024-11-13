public class Main {

    private static void question1(int number) {
        if (number > 0) {
            System.out.println("Number " + number + " is positive");
        } else {
            if (number < 0) {
                System.out.println("Number " + number + " is Negative");
            } else {
                if (number == 0) {
                    System.out.println("Number " + number + " is Zero");
                }
            }
        }
    }

    private static void question2(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Year " + year + " is a leap year.");
        } else {
            System.out.println("Year " + year + " is not a leap year.");
        }
    }

    private static void question3(int age) {
        if (1 <= age && age < 18) {
            System.out.println("The person with age " + age + " is minor.");
        } else if (18 <= age && age <= 60) {
            System.out.println("The person with age " + age + " is adult.");
        } else if (age > 60) {
            System.out.println("The person with age " + age + " is senior citizen.");
        } else {
            System.out.println("Age " + age + " is not a valid age.");
        }
    }

    private static void question4(int num1, int num2, int num3) {
        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("More than one number has the same value");
            return;
        }

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println(num2);
            } else {
                if (num3 > num1 && num3 > num2) {
                    System.out.println(num3);
                }
            }
        }
    }

    private static void question5(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is event");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        question1(5);
        question2(1996);
        question3(60);
        question4(50, 50, 30);
        question5(59);
    }
}