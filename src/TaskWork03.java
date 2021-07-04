/*
Выполните следующие действия с массивом:
Задайте массив из 5 любых целых чисел.
Поменяйте местами первый и последний элемент в массиве.
Вывести в консоль результат суммы первого и среднего элемента.
     */

public class TaskWork03 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int a = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = a;
        //результат суммы первого и среднего элемента
        System.out.println(nums[0] + nums[nums.length/2]);
    }
}