package ru.itmoCoursProject.menu;

import ru.itmoCoursProject.Commands.MenuCommand;

public class StartMenu extends Base{
    MenuCommand startNewGame;
    MenuCommand loadGameFromFile;
    MenuCommand exit;

    public StartMenu(MenuCommand startNewGame, MenuCommand loadGameFromFile, MenuCommand exit) {
        setStartNewGame(startNewGame);
        setLoadGameFromFile(loadGameFromFile);
        setExit(exit);
        setText(StaticInfo.START_MENU_TEXT);
    }

    public void setStartNewGame(MenuCommand startNewGame) {
        if (startNewGame == null) throw new IllegalArgumentException("Значение команды startNewGame = null");
        this.startNewGame = startNewGame;
    }

    public void setLoadGameFromFile(MenuCommand loadGameFromFile) {
        if (loadGameFromFile == null) throw new IllegalArgumentException("Значение команды loadGameFromFile = null");
        this.loadGameFromFile = loadGameFromFile;
    }

    public void setExit(MenuCommand exit) {
        if (exit == null) throw new IllegalArgumentException("Значение команды exit = null");
        this.exit = exit;
    }

    @Override
    void getAnswer() {
        int userCommandNumber = getUserCommandNumber();

        switch (userCommandNumber){
            case 1 -> startNewGame.execute();
            case 2 -> loadGameFromFile.execute();
            case 3 -> exit.execute();
            default -> System.out.println("Такой команды нет. Проверьте правильность ввода команды.");
        }
    }
}
