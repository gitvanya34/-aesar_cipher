package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.print("Введите сдвиг по алфавиту: " );
        СaesarСipher test=new СaesarСipher(in.nextInt());
     //   System.out.print("Введите фразу для кодировки: " );
    //    test.encoder(in.next());

        test.decoder("исеи");
    }
}
