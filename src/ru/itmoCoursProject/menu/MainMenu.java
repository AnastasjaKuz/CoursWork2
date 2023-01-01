package ru.itmoCoursProject.menu;

import ru.itmoCoursProject.Commands.MenuCommand;

public class MainMenu extends Base{
    private MenuCommand startNewGame; // Начать новую игру
    private MenuCommand continueGame; // Продолжить игру
    private MenuCommand loadGame; // Загрузить игру из файла
    private MenuCommand saveGame; // Сохранить игру
    private MenuCommand exit; // Выйти

    public MainMenu(MenuCommand startNewGame,
                    MenuCommand continueGame,
                    MenuCommand loadGame,
                    MenuCommand saveGame,
                    MenuCommand exit) {
        this.startNewGame = startNewGame;
        this.continueGame = continueGame;
        this.loadGame = loadGame;
        this.saveGame = saveGame;
        this.exit = exit;
    }

    public void setStartNewGame(MenuCommand startNewGame) {
        if(startNewGame == null) throw new IllegalArgumentException(
                "Значение команды не может быть null"
        );
        this.startNewGame = startNewGame;
    }

    public void setContinueGame(MenuCommand continueGame) {
        if(continueGame == null) throw new IllegalArgumentException(
            "Значение команды не может быть null"
    );
        this.continueGame = continueGame;
    }

    public void setLoadGame(MenuCommand loadGame) {
        if(loadGame == null) throw new IllegalArgumentException(
                "Значение команды не может быть null"
        );
        this.loadGame = loadGame;
    }

    public void setSaveGame(MenuCommand saveGame) {
        if(saveGame == null) throw new IllegalArgumentException(
                "Значение команды не может быть null"
        );
        this.saveGame = saveGame;
    }

    public void setExit(MenuCommand exit) {
        if(exit == null) throw new IllegalArgumentException(
                "Значение команды не может быть null"
        );
        this.exit = exit;
    }

    @Override
    public void getAnswer() {
        int userCommandNumber = getUserCommandNumber();

        switch (userCommandNumber) {
            case 1 -> startNewGame.execute();
            case 2 -> continueGame.execute();
            case 3 -> loadGame.execute();
            case 4 -> saveGame.execute();
            case 5 -> exit.execute();
            default -> System.out.println("Такой команды нет. Проверьте правильность ввода");
        }
    }
}
