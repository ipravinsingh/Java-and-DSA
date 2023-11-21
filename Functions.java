// // Sum of a & b
// import java.util.Scanner;
// public class Functions {
// public static int sum(int sum1, int sum2) {
// int sum = sum1 + sum2;
// return sum;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// System.out.println(sum(a, b));
// }
// }

// // Product of a & b
// import java.util.Scanner;
// public class Functions {
// public static int product(int product1, int product2) {
// int product = product1 * product2;
// return product;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// System.out.println(product(a, b));
// }
// }

// // Find Factorial of a numbers
// public class Functions {
// public static int factorial(int n) {
// int fact = 1;
// for (int i = 1; i <= n; i++) {
// fact = fact * i;
// }
// return fact;
// }
// public static void main(String[] args) {
// System.out.println(factorial(7));
// }
// }

// // Binomial Coefficient
// public class Functions {
// public static int factorial(int n) {
// int fact = 1;
// for (int i = 1; i <= n; i++) {
// fact = fact * i;
// }
// return fact;
// }
// public static int binCofficient(int n, int r) {
// int bincoff = factorial(n) / (factorial(r) * factorial(n - r));
// return bincoff;
// }
// public static void main(String[] args) {
// System.out.println(binCofficient(5, 2));
// }
// }

// // Check if a number is Prime or not
// public class Functions {
// public static boolean isPrime(int n) {
// if (n == 2) {
// return true;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }
// public static void main(String[] args) {
// if (isPrime(2)) {
// System.out.println("It is a prime number");
// } else {
// System.out.println("It is not a prime number");
// }
// }
// }

// // Print all the Primes in a range
// public class Functions {
// public static boolean isPrime(int n) {
// if (n == 2) {
// return true;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }
// public static void primeInRange(int n) {
// for (int i = 1; i <= n; i++) {
// if (isPrime(i)) {
// System.out.println(i + " ");
// }
// }
// System.out.println();
// }
// public static void main(String[] args) {
// primeInRange(10);
// }
// }

// // Convert from Binary to Decimal
// import java.util.*;

// public class Functions {

// public static void binToDec(int binNum) {
// int myNum = binNum;
// int pow = 0;
// int decNum = 0;

// while (binNum > 0) {
// int lastDigit = binNum % 10;
// decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

// pow++;
// binNum = binNum / 10;
// }
// System.out.println("decimal of " + myNum + " = " + decNum);
// }

// public static void main(String[] args) {
// binToDec(1110);
// }
// }

// // Convert from Decimal to Binary
// import java.util.*;
// public class Functions {
// public static void decToBin(int n) {
// int myNum = n;
// int pow = 0;
// int binNum = 0;
// while (n > 0) {
// int rem = n % 2;
// binNum = binNum + (rem * (int) Math.pow(10, pow));
// pow++;
// n = n / 2;
// }
// System.out.println("decimal of " + myNum + " = " + binNum);
// }
// public static void main(String[] args) {
// decToBin(12);
// }
// }
