package ru.itmoCoursProject.Commands;

import ru.itmoCoursProject.Game;

public abstract class BaseCommand implements MenuCommand{
    Game game;

    protected BaseCommand(Game game) {

    }

    public void setGame(Game game) {
        if (game == null){
            throw new IllegalArgumentException("В конструктор передан обьект значения null");
        }
        this.game = game;
    }

    @Override
    public void execute() {
    }
}
