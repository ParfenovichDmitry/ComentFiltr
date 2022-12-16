package pl.parfen.stepik.zadanie;

public class SpamAnalyzer extends KeywordAnalyzer{
    private String [] keyWords;
    Label label;

    public SpamAnalyzer(String[] keyWords) {
        this.keyWords = keyWords;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }

    @Override
    protected String[] getKeywords() {
        return keyWords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
