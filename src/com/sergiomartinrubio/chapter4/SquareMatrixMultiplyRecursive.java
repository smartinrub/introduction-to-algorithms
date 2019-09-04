package com.sergiomartinrubio.chapter4;

// Time Complexity = 8T(n/2) + n^2 = O(n^3)
public class SquareMatrixMultiplyRecursive {

    public int[][] calculate(int[][] A, int[][] B) {
        return multiply(A, B, 0, 0, 0, 0, A.length);
    }

    // O(8T(n/2)) -> log2(8) = 3
    private int[][] multiply(int[][] A, int[][] B, int rowA, int colA, int rowB, int colB, int size) {
        int[][] C = new int[size][size];

        if (size == 1) {
            C[0][0] = A[rowA][colA] * B[rowB][colB];
        } else {
            // O(1)
            int newSize = size / 2;
            // C11 = a11 x b11 + a12 x b21
            sumMatrix(
                    C,
                    multiply(A, B, rowA, colA, rowB, colB, newSize),
                    multiply(A, B, rowA, colA + newSize, rowB + newSize, colB, newSize),
                    0, 0
            );
            // C12 = a11 x b12 + a12 x b22
            sumMatrix(
                    C,
                    multiply(A, B, rowA, colA, rowB, colB + newSize, newSize),
                    multiply(A, B, rowA, colA + newSize, rowB + newSize, colB + newSize, newSize),
                    0, newSize
            );
            // C21 = a21 x b11 + a22 x b21
            sumMatrix(
                    C,
                    multiply(A, B, rowA + newSize, colA, rowB, colB, newSize),
                    multiply(A, B, rowA + newSize, colA + newSize, rowB + newSize, colB, newSize),
                    newSize, 0
            );
            // C22 = a21 x b12 + a22 x b22
            sumMatrix(
                    C,
                    multiply(A, B, rowA + newSize, colA, rowB, colB + newSize, newSize),
                    multiply(A, B, rowA + newSize, colA + newSize, rowB + newSize, colB + newSize, newSize),
                    newSize, newSize
            );
        }
        return C;
    }

    // Four matrix additions. Each of these matrices contains n^2/4 entries -> O(n^2)
    private void sumMatrix(int[][] C, int[][] A, int[][] B, int rowC, int colC) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i + rowC][j + colC] = A[i][j] + B[i][j];
            }
        }
    }

}
