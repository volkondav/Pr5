package ru.mirea.inbo0219;

public class MainClass {
    public static void main(String[] args) {
        Solution s1 = new Solution();


        System.out.println("----------Упражнение №2----------");
        System.out.println("Дано натуральное число n. Выведите все числа от 1 до n.");

        System.out.println(s1.example2(16));



        System.out.println("----------Упражнение №3---------");
        System.out.println("Даны два целых числа A и В (каждое в отдельной строке). Выведите все\n" +
                "числа от A до B включительно, в порядке возрастания, если A < B, или в порядке\n" +
                "убывания в противном случае.");

        s1.example3(10,2);


        System.out.println("-----------Упражнение №5---------");
        System.out.println("Дано натуральное число N. Вычислите сумму его цифр.");

        System.out.println(s1.example5(2367)); // вызов рекурсивной функции
    }
}
