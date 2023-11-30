// // Print marks of an array_
// import java.util.Scanner;
// public class Arrays {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int marks[] = new int[50];
// marks[0] = sc.nextInt();
// marks[1] = sc.nextInt();
// marks[2] = sc.nextInt();
// System.out.println("Phys : " + marks[0]);
// System.out.println("Chem : " + marks[1]);
// System.out.println("Maths : " + marks[2]);
// }
// }

// // Print array of marks by adding one_
// public class Arrays {
// public static void marksIncreaseOne(int marks[]) {
// for (int i = 0; i < marks.length; i++) {
// marks[i] = marks[i] + 1;
// }
// }
// public static void main(String[] args) {
// int marks[] = { 97, 98, 99 };
// marksIncreaseOne(marks);
// for (int i = 0; i < marks.length; i++) {
// System.out.println(marks[i]);
// }
// }
// }

// // Find the index of element in a given array
// public class Arrays {
// public static int linearSearch(int arr[], int key) {
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == key) {
// return i;
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
// int key = 20;
// int index = linearSearch(arr, key);
// if (index == -1) {
// System.out.println("Not Found");
// } else {
// System.out.println("Key is at index : " + index);
// }
// }
// }

// // Find the largest & smallest number in a given array
// public class Arrays {
// public static int largestNumber(int arr[]) {
// int largest = Integer.MIN_VALUE;
// int smallest = Integer.MAX_VALUE;
// for (int i = 0; i < arr.length - 1; i++) {
// if (largest < arr[i]) {
// largest = arr[i];
// }
// if (smallest > arr[i]) {
// smallest = arr[i];
// }
// }
// System.out.println("Smallest value is : " + smallest);
// return largest;
// }
// public static void main(String[] args) {
// int arr[] = { 1, 2, 6, 13, 5 };
// System.out.println("Largest value is : " + largestNumber(arr));
// }
// }

// // Find the index of element in a given array byBinary search_
// public class Arrays {
// public static int binarySearch(int arr[], int key) {
// int start = 0;
// int end = arr.length - 1;
// while (start <= end) {
// int mid = (start + end) / 2;
// if (arr[mid] == key) {
// return mid;
// }
// if (arr[mid] < key) {
// start = mid + 1;
// } else {
// end = mid - 1;
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// int arr[] = { 2, 4, 6, 8, 10, 12 };
// int key = 100;
// System.out.println(binarySearch(arr, key));
// }
// }

// // Reverse an Array
// public class Arrays {
// public static void reverseArray(int arr[]) {
// int start = 0;
// int end = arr.length - 1;
// while (start < end) {
// int temp;
// temp = arr[end];
// arr[end] = arr[start];
// arr[start] = temp;
// start++;
// end--;
// }
// }
// public static void main(String[] args) {
// int arr[] = { 2, 4, 6, 8, 10 };
// reverseArray(arr);
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// // Pairs in an Array
// public class Arrays {
// public static void pairs(int arr[]) {
// int totalPair = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i+1; j < arr.length; j++) {
// System.out.print("(" + arr[i] + "," + arr[j] + ")");
// totalPair++;
// }
// System.out.println();
// }
// System.out.println("Total Pairs are : " + totalPair);
// }
// public static void main(String[] args) {
// int arr[] = { 2, 4, 6, 8, 10 };
// pairs(arr);
// }
// }

// // Print Subarrays
// public class Arrays {
// public static void printSubarrays(int arr[]) {
// int ts = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// for (int k = i; k <= j; k++) {
// System.out.print(arr[k] + " ");
// }
// ts++;
// System.out.println();
// }
// System.out.println();
// }
// System.out.println("Total : " + ts);
// }
// public static void main(String[] args) {
// int arr[] = { 2, 4, 6, 8, 10 };
// printSubarrays(arr);
// }
// }

// // Max Subarray Sum by Brute Force
// public class Arrays {
// public static void maxSubarray(int arr[]) {
// int currSum = 0;
// int maxSum = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// currSum = 0;
// for (int k = i; k <= j; k++) {
// currSum = currSum + arr[k];
// }
// System.out.println(currSum);
// if (maxSum < currSum) {
// maxSum = currSum;
// }
// }
// }
// System.out.println("Max Sum : " + maxSum);
// }
// public static void main(String[] args) {
// int arr[] = { 1, -2, 6, -1, 3 };
// maxSubarray(arr);
// }
// }

// // Max Subarray Sum by Prefix Sum
// public class Arrays {
// public static void maxSubarraySum(int arr[]) {
// int curSum = 0;
// int maxSum = Integer.MIN_VALUE;
// int prefix[] = new int[arr.length];
// prefix[0] = arr[0];
// for (int i = 1; i < prefix.length; i++) {
// prefix[i] = prefix[i - 1] + arr[i];
// }
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// curSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
// if (maxSum < curSum) {
// maxSum = curSum;
// }
// }
// }
// System.out.println("max sum = " + maxSum);
// }
// public static void main(String[] args) {
// int arr[] = { 1, -2, 6, -1, 3 };
// maxSubarraySum(arr);
// }
// }
