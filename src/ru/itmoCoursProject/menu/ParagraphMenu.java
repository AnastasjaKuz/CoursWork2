package ru.itmoCoursProject.menu;

import ru.itmoCoursProject.Commands.MenuCommand;
import ru.itmoCoursProject.paragraphs.Paragraph;

public class ParagraphMenu extends Base{
    MenuCommand firstAnswer;
    MenuCommand secondAnswer;
    MenuCommand returnToMenu;

    public ParagraphMenu(Paragraph paragraph, MenuCommand firstAnswer, MenuCommand secondAnswer, MenuCommand returnToMenu) {
        setParagraph(paragraph);
        setFirstAnswer(firstAnswer);
        setSecondAnswer(secondAnswer);
        setReturnToMenu(returnToMenu);
        setText();
    }

    public void setParagraph(Paragraph paragraph){
        if (paragraph == null) {
            throw new IllegalArgumentException("Переден параграф со значением null");
        }
        this.paragraph = paragraph;
    }

    public void setFirstAnswer(MenuCommand firstAnswer) {
        if(firstAnswer == null) throw new IllegalArgumentException(
                "Значение команды не может быть null"
        );
        this.firstAnswer = firstAnswer;
    }

    public void setSecondAnswer(MenuCommand secondAnswer) {
        if(secondAnswer == null) throw new IllegalArgumentException(
                "Значение команды не может быть null"
        );
        this.secondAnswer = secondAnswer;
    }

    public void setReturnToMenu(MenuCommand returnToMenu) {
        if(returnToMenu == null) throw new IllegalArgumentException(
                "Значение команды не может быть null"
        );
        this.returnToMenu = returnToMenu;
    }

    private void setText() {
        text = "1. " + paragraph.getFirstText() + "\n" +
                "2. " + paragraph.getSecondText() + "\n" + "3. Выйти в главное меню";
    }

    @Override
    void getAnswer() {
        int userCommandNumber = getUserCommandNumber();

        switch (userCommandNumber){
            case 1 -> firstAnswer.execute();
            case 2 -> secondAnswer.execute();
            case 3 -> returnToMenu.execute();
            default -> System.out.println("Такой команды нет. Проверье правильность ввода.");
        }
    }
}
