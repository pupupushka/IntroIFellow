package ru.ifellow.JSchool.introdution;
public class FirstStep {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul (int x, int y) {
        return x * y;
    }

    public int div (int x, int y) {
        return x / y;
    }

    public int mod (int x, int y) {
        return x % y;
    }

    public boolean isEqual (int x, int y) {
        return x == y;

    }

    public boolean isGreater (int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return  res;
    }

    public int mul(int[] array) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        int res = 1;
        if (array.length == 0) {
            res = 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                res *= array[i];
            }
        }
        return res;
    }

    public int min(int[] array) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    public double average(int[] array) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        return array.length != 0 ? (double) sum(array) / array.length : 0;
    }

    public boolean isSortedDescendant(int[] array) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void cube(int[]array) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 1291 && array[i] > -1291) {
                array[i] = array[i] * array[i] * array[i];
            } else {
                throw new ArithmeticException("Обратите внимание на число");
            }
        }
    }

    public boolean find(int[]array, int value) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        for(int el : array) {
            if (el == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        int[] rev_array = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            rev_array[array.length - i - 1] = array[i];
        }
    }

    public boolean isPalindrome(int[]array) {

        if (array == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public int sum(int[][] matrix) {

        if (matrix == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        int sum = 0;
        for (int[] row : matrix) {
            sum += sum(row);
        }
        return sum;
    }

    public int max(int[][] matrix) {

        if (matrix == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {

        if (matrix == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {

        if (matrix == null) {
            throw new NullPointerException("Передано некорректное значение");
        }

        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}