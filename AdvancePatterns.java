// // Hollow Rectangle Pattern
// public class AdvancePatterns {
// public static void hollowRectangle(int row, int column) {
// for (int i = 1; i <= row; i++) {
// for (int j = 1; j <= column; j++) {
// if (i == 1 || j == 1 || i == row || j == column) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// hollowRectangle(4, 5);
// }
// }

// // Inverted & Rotated half-pyramid pattern
// public class AdvancePatterns {

// public static void halfPyramid(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int k = 1; k <= i; k++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// halfPyramid(4);
// }
// }

// // Inverted Half-Pyramid with Numbers pattern
// public class AdvancePatterns {
// public static void halfPyramidWithNumber(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(j);
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// halfPyramidWithNumber(5);
// }
// }

// // Floyd's Triangle pattern
// public class AdvancePatterns {
// public static void floydsTriangle(int n) {
// int counter = 1;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(counter + " ");
// counter++;
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// floydsTriangle(5);
// }
// }

// // 0-1 Triangle pattern
// public class AdvancePatterns {
// public static void zeroOnePattern(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// if ((i + j) % 2 == 0) {
// System.out.print("1");
// } else {
// System.out.print("0");
// }
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// zeroOnePattern(5);
// }
// }

// Butterfly pattern

// // Solid Rhombus pattern
// public class AdvancePatterns {
// public static void solidRombus(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int k = 1; k <= n; k++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// solidRombus(10);
// }
// }

// // Hollow Rhombus pattern
// public class AdvancePatterns {
// public static void hollowRhombus(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= n; j++) {
// if (i == 1 || j == 1 || i == n || j == n) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// hollowRhombus(5);
// }
// }

// Diamond pattern
public class AdvancePatterns {

    public static void diamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Other half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(5);
    }
}