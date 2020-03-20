
                                     //..IF..ELSE IF..SWITCH..\\

package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Objects.equals("Вася", "Анастасия");
        Scanner in = new Scanner(System.in);
        System.out.print("ВВЕДИТЕ СВОЕ ИМЯ \n");
        String a = in.nextLine();
        if(Objects.equals("Вася", a)){
            System.out.println("Привет \n \"Я тебя так долго ждал\"");
        }
        else if(Objects.equals("Анастасия", a)){
            System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
    public static void main(String[] args) {

    }
}
