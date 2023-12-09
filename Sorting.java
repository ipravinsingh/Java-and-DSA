// //Bubble Sort Sorting in Assending Order_
// public class Sorting {
// public static void bubbleSort(int arr[]) {
// for (int i = 0; i < arr.length - 1; i++) {
// for (int j = 0; j < arr.length - 1 - i; j++) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// }
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// public static void main(String[] args) {
// int arr[] = { 5, 4, 1, 3, 2 };
// bubbleSort(arr);
// printArray(arr);
// }
// }

// // Selection Sort Sorting in Assending Order_
// public class Sorting {
// public static void selectionSort(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// int minPos = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[minPos] > arr[j]) {
// minPos = j;
// }
// }
// int temp = arr[minPos];
// arr[minPos] = arr[i];
// arr[i] = temp;
// }
// }
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// public static void main(String[] args) {
// int arr[] = { 5, 4, 1, 3, 2 };
// selectionSort(arr);
// printArray(arr);
// }
// }

// // Inserction Sort Sorting in Assending Order_
// public class Sorting {
// public static void inserctionSort(int arr[]) {
// for (int i = 1; i < arr.length; i++) {
// int curr = arr[i];
// int prev = i - 1;
// // Finding the correct position to insert_
// while (prev >= 0 && arr[prev] >curr) {
// arr[prev + 1] = arr[prev];
// prev--;
// }
// // insertion
// arr[prev + 1] = curr;
// }
// }
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// public static void main(String[] args) {
// int arr[] = { 5, 4, 1, 3, 2 };
// inserctionSort(arr);
// printArray(arr);
// }
// }

// // Counting Sort Sorting in Assending Order_
// public class Sorting {
// public static void countingSorti(int arr[]) {
// int largest = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// largest = Math.max(largest, arr[i]);
// }
// int count[] = new int[largest + 1];
// for (int i = 0; i < arr.length; i++) {
// count[arr[i]]++;
// }
// // sorting
// int j = 0;
// for (int i = 0; i < count.length; i++) {
// while (count[i] > 0) {
// arr[j] = i;
// j++;
// count[i]--;
// }
// }
// }
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// public static void main(String[] args) {
// int arr[] = { 5, 4, 1, 3, 2 };
// countingSorti(arr);
// printArray(arr);
// }
// }