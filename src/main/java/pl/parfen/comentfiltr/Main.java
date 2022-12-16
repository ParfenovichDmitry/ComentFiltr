package pl.parfen.stepik.zadanie;

public class Main {
    public static void main(String[] args) {


    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {


        for (TextAnalyzer anal : analyzers) {
            if (anal.processText(text) != Label.OK) {

                return anal.processText(text);
            }
        }
        return Label.OK;
    }


}
