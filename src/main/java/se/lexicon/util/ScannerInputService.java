package se.lexicon.util;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class ScannerInputService implements UserInputService{

    Scanner scanner= new Scanner(System.in);

    @Override
    public String getString() {

        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        return scanner.nextInt();
    }
}
