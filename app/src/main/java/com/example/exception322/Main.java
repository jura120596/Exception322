package com.example.exception322;

import androidx.fragment.app.Fragment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ZeroDenumException {
        try { //попробуй сделай, вдруг исключение
            Scanner scanner = new Scanner(new File("C:\\Users\\YuriyMironov\\AndroidStudioProjects\\Exception322\\app\\src\\main\\java\\com\\example\\exception322\\inn.txt"));
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        } catch (ArithmeticException | FileNotFoundException exceptionVar) {
            System.out.println("Программа не остановилась, но ошибка была");
        }
        try {
            int[] a = {1};
            System.out.println(a[1]);//ArrayIndexOutOfBoundException
            Fraction f = new Fraction(0,1);
        } catch (ZeroDenumException e) { //отлавливаем и сохраняем
            System.out.println("Мы все сохраняем в кэтче");
        } finally {
            //выполнится даже при необработанном исключении ArrayIndexOutOfBoundsException
            System.out.println("Данные сохранились finalyy");
        }
        System.out.println("Я все еще работаю");
    }
}
