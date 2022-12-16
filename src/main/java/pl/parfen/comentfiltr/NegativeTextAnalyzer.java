package pl.parfen.stepik.zadanie;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] keywords = new String[]{":(","=(",":|"};
    protected Label label;

    public NegativeTextAnalyzer() {
    }

    @Override
    public Label processText(String text) {
        if (super.processText(text) != Label.OK)
        {
            this.label = Label.NEGATIVE_TEXT;
            return this.getLabel();
        }
        else {
            this.label = Label.OK;
            return this.getLabel();
        }
    }

    @Override
    public String[] getKeywords() {

        return keywords;
    }

    @Override
    protected Label getLabel() {

        return label;
    }
}
