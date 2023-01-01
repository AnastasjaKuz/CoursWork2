package ru.itmoCoursProject.Commands;

import ru.itmoCoursProject.Game;

public class ExitCommand extends BaseCommand implements MenuCommand{

    public ExitCommand(Game game) {
        super(game);
    }
    @Override
    public void execute(){
        game.exit();
    }
}
