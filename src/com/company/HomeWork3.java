
                                                 //..ELSE IF..IF..SWITCH..\\

package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {



    public static void main(String[] args)
    {
        {                                          //..IF,ELSE IF..\\

            Scanner in = new Scanner(System.in);
            System.out.print("ВВЕДИТЕ СВОЕ ИМЯ \n");
            String a = in.nextLine();
            if (Objects.equals("Вася", a)) {
                System.out.println("Привет \n \"Я тебя так долго ждал\"");
            } else if (Objects.equals("Анастасия", a)) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }

        }

                                                      //..IF,ELSE..\\

        {

            Scanner in = new Scanner(System.in);
            System.out.print("ВВЕДИТЕ СВОЕ ИМЯ \n");
            String b = in.nextLine();
            if (Objects.equals("Вася", b)) {
                System.out.println("Привет \n \"Я тебя так долго ждал\"");
            }
            if (Objects.equals("Анастасия", b)) {
                System.out.println("Я тебя так долго ждал");
            }
            if(!Objects.equals("Вася", b) && !Objects.equals("Анастасия", b))
            {
                System.out.println("Добрый день, а вы кто?");
            }


        }

                                                       //..SWITCH..\\

        {

            Scanner in = new Scanner(System.in);
            System.out.print("ВВЕДИТЕ СВОЕ ИМЯ \n");
            String a = in.nextLine();
            switch (a)
            {
                case "Вася":

                    System.out.println("Привет \n \"Я тебя так долго ждал\"");
                    break;

                case "Анастасия":

                    System.out.println("Я тебя так долго ждал");
                    break;

                default:
                    System.out.println("Добрый день, а вы кто?");


            }


        }
    }
}
