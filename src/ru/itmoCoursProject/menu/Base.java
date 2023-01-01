package ru.itmoCoursProject.menu;

import java.util.Scanner;

public abstract class Base {
    String text;
    String userText;

    public void setText(String text) {
        if (text == null) throw new IllegalArgumentException("Текст не может быть пустым");
        this.text = text;
    }

    private void printText() {
        System.out.println(this.text);
    }

    private boolean isUserTextCorrect(String userText) {
        try {
            Integer.parseInt(userText);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    protected int getUserCommandNumber(){
        Scanner inputUser = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер команды");
            userText = inputUser.nextLine();
            if (isUserTextCorrect(userText)) {
                break;
            }
            System.out.println("Команда задана неверно");
        }
        return Integer.parseInt(userText);
    }
    abstract void getAnswer();

    public void showAndRun() {
        printText();
        getAnswer();
    }


}
