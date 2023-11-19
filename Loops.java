// // Print number from 1 to n_
// public class Loops {
// public static void main(String[] args) {
// int n = 7;
// int i = 1;
// while (i <= n) {
// System.out.println(i);
// i++;
// }
// }
// }

// // Print number from 1 to 10
// public class Loops {
// public static void main(String[] args) {
// int n = 10;
// int i = 1;
// while (i <= n) {
// System.out.println(i);
// i++;
// }
// }
// }

// // Print Square pattern_
// public class Loops {
// public static void main(String[] args) {
// int n = 4;
// for (int i = 1; i <= n; i++) {
// System.out.println("****");
// }
// }
// }

// // Print sum of first n natural numbers_
// import java.util.*;
// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum = 0;
// int i = 1;
// while (i <= n) {
// sum += i;
// i++;
// }
// System.out.println(sum);
// }
// }

// // Print Reverse of a number_
// public class Loops {
// public static void main(String[] args) {
// int n = 10899;
// while (n > 0) {
// int lastDigit = n % 10;
// System.out.print(lastDigit);
// n = n / 10;
// }

// }
// }

// // Reverse of a number_
// public class Loops {
// public static void main(String[] args) {
// int n = 104899;
// int rev = 0;
// while (n > 0) {
// int lastDigit = n % 10;
// rev = (rev * 10) + lastDigit;
// n = n / 10;
// }
// System.out.print(rev);
// }
// }

// // Keep entering numbers till user enters a multiple of 10
// import java.util.Scanner;

// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// do {
// System.out.print("Enter your number :");
// int n = sc.nextInt();
// if (n % 10 == 0) {
// break;
// }
// System.out.println(n);
// } while (true);
// }
// }

// // Entering numbers till user enters a multiple of 10
// import java.util.Scanner;
// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// do {
// System.out.print("Enter your number :");
// int n = sc.nextInt();
// if (n % 10 == 0) {
// continue;
// }
// System.out.println(n);
// } while (true);
// }
// }

// // Check if a number is prime or not
// import java.util.Scanner;
// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// if (n == 2) {
// System.out.println("n is prime");
// } else {
// boolean isPrime = true;
// // for (int i = 2; i <= n - 1; i++) {
// // Optimized way
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
// isPrime = false;
// }
// }
// if (isPrime == true) {
// System.out.println("n is prime");
// } else {
// System.out.println("n is not prime");
// }
// }
// }
// }
