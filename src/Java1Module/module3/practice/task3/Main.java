package Java1Module.module3.practice.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("male", "Andrey", 25, "Demchuk", "Ma9kovskogo str", 5000);
        Worker worker2 = new Worker("female", "Olga", 30, "Petrenko", "Saburova str", 5500);
        Worker worker3 = new Worker("male", "Vitek", 26, "L9tambur", "Ma9kovskogo str", 4000);
        Worker worker4 = new Worker("male", "Griwa", 20, "Ekimenko", "Bal'zaka str", 7000);
        Worker worker5 = new Worker("female", "Anna", 35, "4elove4kina", "Zakrevskogo str", 5000);
        Worker worker6 = new Worker("female", "Ira", 25, "Svet", "xxx str", 3000);
        Worker worker7 = new Worker("male", "Andrey", 15, "qq", "yyy str", 3500);
        Worker worker8 = new Worker("female", "Katya", 55, "aa", "zzz str", 6000);
        Worker worker9 = new Worker("male", "Alex", 45, "ww", "qqq str", 15000);
        Worker worker10 = new Worker("female", "Tan9", 12, "zz", "www str", 3000);

        Worker[] workers = {worker1, worker2, worker3, worker4, worker5, worker6, worker7, worker8, worker9, worker10};

        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum = sum + workers[i].getSalary();
        }
        System.out.println(sum);

    }

    public Worker[] mixWorkers(Worker[] workers) {
        Worker[] works = new Worker[workers.length];
        int[] arr = new int[workers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = workers[i].getSalary();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <workers.length ; j++) {
                if (workers[j].getSalary()==arr[i])
                    works[i] = workers[j];
            }
        }

//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]){
//                    workers[i]
//                }
//            }
//        }
        return workers;
    }
}
