package pl.parfen.stepik.zadanie;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;
    Label label;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length()>maxLength){
          return this.label = Label.TOO_LONG;
        }else {
            return Label.OK;
        }

    }
}
