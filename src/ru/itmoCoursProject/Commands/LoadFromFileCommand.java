package ru.itmoCoursProject.Commands;

import ru.itmoCoursProject.Game;

public class LoadFromFileCommand extends BaseCommand {
    public LoadFromFileCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        game.loadGame();
    }
}
