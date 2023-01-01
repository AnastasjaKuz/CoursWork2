package ru.itmoCoursProject.Commands;

import ru.itmoCoursProject.Game;

public class ContinueGameCommand extends BaseCommand implements MenuCommand{

    public ContinueGameCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        game.continueGame();
    }
}
