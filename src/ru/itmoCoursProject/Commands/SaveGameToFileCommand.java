package ru.itmoCoursProject.Commands;

import ru.itmoCoursProject.Game;

public class SaveGameToFileCommand extends BaseCommand {
    protected SaveGameToFileCommand(Game game) {
        super(game);
    }
    @Override
    public void execute(){
        game.saveGame();
    }
}
