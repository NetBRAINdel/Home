
                                             //ПОСЛЕДОВАТЕЛЬНОСТЬ ДЕЙСТВИЙ\\

package com.company;

public class Main {

    public static void main(String[] args) {
        int i=2;
        int q=8;
        System.out.println(5 + 2 / 8);
        // 5;
        // ..1=ЧАСТНОЕ..2=СУММА..
        // ..3==БЕЗ ОСТАТКА, Т.К. (Int);

        System.out.println((5 + 2) / 8);
        // 0;
        // ..1=СУММА..2=ЧАСТНОЕ..
        // ..3==БЕЗ ОСТАТКА, Т.К. (Int);

        System.out.println((5 + i++) / 8);
        // 0;
        // ..1=СУММА..Т.К. "i" ИНКРЕМЕНТИРУЕТСЯ ПОСЛЕ ВЫЧИСЛЕНИЯ(ПОСТФИКС)..2=ЧАСТНОЕ..
        // ..3==БЕЗ ОСТАТКА, Т.К. (Int);

        System.out.println((5 + i++) / --q);
        // 1;
        // ..1=СУММА..Т.К. "i" ИНКРЕМЕНТИРУЕТСЯ ПОСЛЕ ВЫЧИСЛЕНИЯ(ПОСТФИКС)..2=ДЕКРЕМЕНТ..
        // ..3==ЧАСТНОЕ;

        System.out.println((5 * 2 >> i++) / --q);
        // 0;
        // ..1=ПРОИЗВЕДЕНИЕ..Т.К. "i" ИНКРЕМЕНТИРУЕТСЯ ПОСЛЕ ВЫЧИСЛЕНИЯ(ПОСТФИКС)..2=СДВИГ ВПРАВО..
        // ..3=ДЕКРЕМЕНТ..4=ЧАСТНОЕ..5==БЕЗ ОСТАТКА, Т.К. (Int);

        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> i++) / --q);
        // 0;
        // ..1=ПРОИЗВЕДЕНИЕ..Т.К. "i" ИНКРЕМЕНТИРУЕТСЯ ПОСЛЕ ВЫЧИСЛЕНИЯ(ПОСТФИКС)..2=СУММА..
        // ..3=СДИГ ВПРАВО..4=СРАВНЕНИЕ..5=ТЕРНАРНЫЕ ОПЕРАТОРЫ "?",":"..
        // ..6=ДЕКРЕМЕНТ..7=ЧАСТНОЕ..8==БЕЗ ОСТАТКА, Т.К. (Int);

        System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> i++) / --q);
        // ОШИБКА КОМПИЛЯЦИИ;
        // ..Error:(38, 68) java: bad operand types for binary operator '/'
        //  first type:  java.lang.Object&java.io.Serializable&java.lang.Comparable<? extends
        //  java.lang.Object&java.io.Serializable&java.lang.Comparable<?>>
        //  second type: int


        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);
        // false
        // ..1=ПРОЗВЕДЕНИЕ..2=РАЗНИЦА..
        // ..3=СРАВНЕНИЯ(>,<=,&&)..4==Т.К. РЕЗУЛЬТАТОМ 2-ОГО FALSE(_ELSE_)TRUE && TRUE == TRUE;


        System.out.println(true && false);
        // false
        // ..1==Т.К. РЕЗУЛЬТАТОМ 2-ОГО FALSE(_ELSE_)TRUE && TRUE == TRUE;

    }
}