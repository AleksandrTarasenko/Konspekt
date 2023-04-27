package Core;

public class Массивы_Varargs {
    //<тип данных>[] <имя массива>;

    //объявление
    int nums[]; //так не стоит делать
    int num;
    int[] nums2;
    int[][] numss;

    //присвоение
    //numbers = new int[5];
    int[] numbers = new int[5];

    //Для целочисленных типов, значение по умолчанию равно 0,
    // для вещественных типов - 0.0, д
    // ля логических типов - false

    //копия части массива с возрастающим списком чисел
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == start || numbers[i] > start) {
                if (numbers[i] <= end) {
                    count++;
                }
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == start || numbers[i] > start) {
                if (numbers[i] <= end) {
                    array[j] = numbers[i];
                    j++;
                }
            }
        }
        return array;
    }

    //данные из середины массива
    public static int[] getArrayMiddle(int[] numbers) {
        int[] array;
        if (numbers.length == 0) {
            return numbers;
        } else if (numbers.length % 2 == 0) {
            array = new int[2];
            array[0] = numbers[numbers.length / 2 - 1];
            array[1] = numbers[numbers.length / 2];
            return array;
        } else {
            array = new int[1];
            array[0] = numbers[numbers.length / 2];
            return array;
        }
    }

    //разворот данных в массиве
    public static int[] inverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = tmp;
        }
        return numbers;
    }

    // объединение массива и сортировка пузырьком
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] array = new int[firstArray.length + secondArray.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < firstArray.length) {
                array[i] = firstArray[i];
            } else {
                array[i] = secondArray[j];
                j++;
            }
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

}
