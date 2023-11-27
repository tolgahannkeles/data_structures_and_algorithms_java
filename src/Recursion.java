public class Recursion {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 20; i++) {
            System.out.print(binaryFibonacci(i) + " : ");
            System.out.print(linearFibonacci(i)[0]);

            System.out.println();

        }


    }


    static int factorial(int num) {
        if (num < 0) throw new IllegalArgumentException("The number must be greater than 0");
        else if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    static boolean binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return false; // base
        else {
            int mid = ((low + high) / 2);
            if (arr[mid] == target) return true;
            else if (target < arr[mid]) {
                return binarySearch(arr, target, low, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, high);
            }
        }
    }

    static int linearSum(int[] arr, int last) {
        if (last <= 0) return 0;
        return arr[last - 1] + linearSum(arr, last - 1);
    }

    static void reverseArray(int[] arr, int low, int high) {
        if (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            reverseArray(arr, low + 1, high - 1);
        }
    }

    static int power(int num, int power) {
        if (power < 0) {
            return -1;
        } else {
            if (power == 0) return 1;
            else {
                return num * power(num, power - 1);
            }
        }
    }

    static int efficentPower(int num, int power) {
        if (power == 0) return 1;

        if (power % 2 == 1) {
            int y = efficentPower(num, (power - 1) / 2);
            return num * y * y;
        } else {
            int y = efficentPower(num, power / 2);
            return y * y;
        }
    }

    public static int binarySum(int[] array, int left, int
            right) {
        if (left == right) {
            return array[left];
        } else {
            int mid = (left + right) / 2;
            int sumLeft = binarySum(array, left, mid);
            int sumRight = binarySum(array, mid + 1, right);
            return sumLeft + sumRight;
        }
    }
    public static int binaryFibonacci(int k) {
        // O(2^n)
        if (k == 0) {
            return 0;
        }
        if (k == 1 || k == 2) {
            return 1;
        }
        return binaryFibonacci(k - 2) + binaryFibonacci(k - 1);
    }

    public static int[] linearFibonacci(int k) {
        // Better one O(n)
        if (k == 1) {
            return new int[]{k, 0};
        } else if (k == 0) {
            return new int[]{0, 0};
        }
        int[] previous = linearFibonacci(k - 1);
        int[] result = new int[2];
        result[0] = previous[0] + previous[1];
        result[1] = previous[0];
        return result;

    }


}

