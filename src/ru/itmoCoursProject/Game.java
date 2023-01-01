package ru.itmoCoursProject;

import ru.itmoCoursProject.Commands.*;
import ru.itmoCoursProject.menu.MainMenu;
import ru.itmoCoursProject.menu.ParagraphMenu;
import ru.itmoCoursProject.menu.StartMenu;
import ru.itmoCoursProject.paragraphs.Paragraph;
import ru.itmoCoursProject.paragraphs.ParagraphUtil;
import ru.itmoCoursProject.paragraphs.ParagraphsInfo;

import java.io.FileNotFoundException;

public class Game {
    private Paragraph currentParagraph;
    private Operations<String> progressHandler;

    public Game() {
        progressHandler = new Operations<>();
    }

    public Paragraph getCurrentParagraph() {
        return currentParagraph;
    }
    public void nextStep(Paragraph paragraph){
        setCurrentParagraph(paragraph);
        currentParagraph.printText();
        if (currentParagraph.ifLastParagraph()){
            new StartMenu(new StartCommand(this),
                          new LoadFromFileCommand(this),
                          new ExitCommand(this)).showAndRun();
            return;
        }
        new ParagraphMenu(paragraph, new ParagraphFirstCommand(this),
                          new ParagraphSecondCommand(this),
                          new ToMenuCommand(this)).showAndRun();
    }

    public void setCurrentParagraph(Paragraph currentParagraph) {
        this.currentParagraph = currentParagraph;
    }

    public void startNewGame() {
        Paragraph startParagraph = ParagraphUtil.getParagraphByTitle(ParagraphsInfo.FOX_TITLE);
        nextStep(startParagraph);
    }

    public void showMainMenu(){
        new MainMenu(new StartCommand(this),
                     new ContinueGameCommand(this),
                     new LoadFromFileCommand(this),
                     new StartCommand(this),
                     new ExitCommand(this)).showAndRun();
    }

    public void loadGame() throws FileNotFoundException {
        String loadParagraphTitle = progressHandler.readFromFile();
        System.out.println("Игра загружена");
        nextStep(ParagraphUtil.getParagraphByTitle(loadParagraphTitle));
    }//catch (FileNotFoundException e){
    //System.out.println("Пока нет ни одного сохранения. Не забудьте сохранить эту игру.");
    //if (currentParagraph == null) run();
    //else showMainMenu();
    //}

    public void saveGame(){
        System.out.println("Сохранение игры");
        progressHandler.writeToFile(currentParagraph.getTitle());
        System.out.println("Игра сохранена");
        showMainMenu();
    }

    public void continueGame() {
        nextStep(currentParagraph);
    }

    public void exit() {
        System.out.println("Вы вышли из игры");
    }

    public void run() {
        new StartMenu(new StartCommand(this),
                      new LoadFromFileCommand(this),
                      new ExitCommand(this)).showAndRun();
    }

}
