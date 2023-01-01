package ru.itmoCoursProject.paragraphs;

public class Paragraph {
    private String title;
    private String text;
    private String firstText;
    private String secondText;
    Paragraph firstAnswer;
    Paragraph secondAnswer;

    public Paragraph(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public Paragraph(String title, String text, String menuFirstText, String menuSecondText) {
        this.title = title;
        this.text = text;
        setFirstText(menuFirstText);
        setSecondText(menuSecondText);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null)  throw new IllegalArgumentException("Данное поле не может быть пустым");
        this.title = title;
    }

    public void printText() {
        System.out.println(text);
    }

    public void setText(String text) {
        if (text == null) throw new IllegalArgumentException("Данное поле не может быть пустым");
        this.text = text;
    }

    public String getFirstText() {
        return firstText;
    }

    public void setFirstText(String firstText) {
        this.firstText = firstText;
    }

    public String getSecondText() {
        return secondText;
    }

    public void setSecondText(String secondText) {
        this.secondText = secondText;
    }

    public Paragraph getFirstAnswer() {
        return firstAnswer;
    }

    public void setFirstAnswer(Paragraph firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public Paragraph getSecondAnswer() {
        return secondAnswer;
    }

    public void setSecondAnswer(Paragraph secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public boolean ifLastParagraph() {
        return getFirstAnswer() == null;
    }
}
