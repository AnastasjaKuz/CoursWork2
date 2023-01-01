package ru.itmoCoursProject.paragraphs;

import java.util.HashSet;

public class ParagraphUtil {
    private static HashSet<Paragraph> paragraphs;
    private ParagraphUtil() {}

    static { paragraphsInitialization(); }

    private static void paragraphsInitialization(){
        paragraphs = new HashSet<>(ParagraphsInfo.NUMBER_OF_PARAGRAPHS);

        Paragraph littleFox = new Paragraph(ParagraphsInfo.FOX_TITLE, ParagraphsInfo.FOX_TEXT,
                ParagraphsInfo.FOX_MENU_FIRST, ParagraphsInfo.FOX_MENU_SECOND);

        Paragraph backToHome = new Paragraph(ParagraphsInfo.BACK_TO_HOME_TITLE, ParagraphsInfo.BACK_TO_HOME_TEXT);

        Paragraph startSearching = new Paragraph(ParagraphsInfo.START_SEARCHING_TITLE, ParagraphsInfo.START_SEARCHING_TEXT,
                ParagraphsInfo.START_SEARCHING_MENU_FIRST, ParagraphsInfo.START_SEARCHING_MENU_SECOND);

        Paragraph askForestDwellers = new Paragraph(ParagraphsInfo.ASK_FOREST_DWELLERS_TITLE, ParagraphsInfo.ASK_FOREST_DWELLERS_TEXT,
                ParagraphsInfo.ASK_FOREST_DWELLERS_MENU_FIRST, ParagraphsInfo.ASK_FOREST_DWELLERS_MENU_SECOND);

        Paragraph searchAlone = new Paragraph(ParagraphsInfo.SEARCH_ALONE_TITLE, ParagraphsInfo.SEARCH_ALONE_TEXT);

        Paragraph askOwl = new Paragraph(ParagraphsInfo.ASK_OWL_TITLE, ParagraphsInfo.ASK_OWL_TEXT,
                ParagraphsInfo.ASK_OWL_MENU_FIRST, ParagraphsInfo.ASK_OWL_MENU_SECOND);

        Paragraph askWolf = new Paragraph(ParagraphsInfo.ASK_WOLF_TITLE, ParagraphsInfo.ASK_WOLF_TEXT,
                ParagraphsInfo.ASK_WOLF_MENU_FIRST, ParagraphsInfo.ASK_WOLF_MENU_SECOND);

        Paragraph trustOwl = new Paragraph(ParagraphsInfo.TRUST_OWL_TITLE, ParagraphsInfo.TRUST_OWL_TEXT,
                ParagraphsInfo.TRUST_OWL_MENU_FIRST, ParagraphsInfo.TRUST_OWL_MENU_SECOND);

        Paragraph getHoney = new Paragraph(ParagraphsInfo.GET_HONEY_TITLE, ParagraphsInfo.GET_HONEY_TEXT,
                ParagraphsInfo.GET_HONEY_MENU_FIRST, ParagraphsInfo.GET_HONEY_MENU_SECOND);

        Paragraph waitBees = new Paragraph(ParagraphsInfo.WAIT_BEES_FLY_AWAY_TITLE, ParagraphsInfo.WAIT_BEES_FLY_AWAY_TEXT,
                ParagraphsInfo.WAIT_BEES_FLY_AWAY_MENU_FIRST, ParagraphsInfo.WAIT_BEES_FLY_AWAY_MENU_SECOND);

        Paragraph steelHoney = new Paragraph(ParagraphsInfo.STEAL_HONEY_TITLE, ParagraphsInfo.STEAL_HONEY_TEXT);

        Paragraph eatAndRelax = new Paragraph(ParagraphsInfo.EAT_AND_RELAX_TITLE, ParagraphsInfo.EAT_AND_RELAX_TEXT);

        Paragraph takeHoneyToBear = new Paragraph(ParagraphsInfo.TAKE_HONEY_TO_BEAR_TITLE, ParagraphsInfo.TAKE_HONEY_TO_BEAR_TEXT,
                ParagraphsInfo.TAKE_HONEY_TO_BEAR_MENU_FIRST, ParagraphsInfo.TAKE_HONEY_TO_BEAR_MENU_SECOND);


        littleFox.setFirstAnswer(backToHome);
        littleFox.setSecondAnswer(startSearching);

        startSearching.setFirstAnswer(askForestDwellers);
        startSearching.setSecondAnswer(searchAlone);

        askForestDwellers.setFirstAnswer(askOwl);
        askForestDwellers.setSecondAnswer(askWolf);

        askOwl.setFirstAnswer(trustOwl);
        askOwl.setSecondAnswer(searchAlone);

        askWolf.setFirstAnswer(backToHome);
        askWolf.setSecondAnswer(searchAlone);

        trustOwl.setFirstAnswer(searchAlone);
        trustOwl.setSecondAnswer(getHoney);

        getHoney.setFirstAnswer(waitBees);
        getHoney.setSecondAnswer(steelHoney);

        waitBees.setFirstAnswer(eatAndRelax);
        waitBees.setSecondAnswer(takeHoneyToBear);

        takeHoneyToBear.setFirstAnswer(searchAlone);
        takeHoneyToBear.setSecondAnswer(backToHome);

        paragraphs.add(littleFox);
        paragraphs.add(backToHome);
        paragraphs.add(startSearching);
        paragraphs.add(askForestDwellers);
        paragraphs.add(askOwl);
        paragraphs.add(askWolf);
        paragraphs.add(trustOwl);
        paragraphs.add(getHoney);
        paragraphs.add(waitBees);
        paragraphs.add(eatAndRelax);
        paragraphs.add(takeHoneyToBear);
    }

    public static Paragraph getParagraphByTitle(String title){
        return paragraphs.stream().filter(paragraph -> title.equals(paragraph.getTitle())).findFirst().get();
    }


}
