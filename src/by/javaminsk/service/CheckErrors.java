package by.javaminsk.service;

/**
 * Created by kirzhanov on 10/20/15.
 */
public class CheckErrors {

    public static String checkError(String input){
        StringBuilder inputText = new StringBuilder(input);
        StringBuilder outputText = new StringBuilder();

        outputText = checkWrongSymbols(inputText);
        outputText = checkWrongLetters(outputText);
        outputText = checkUnicode(outputText);
        outputText = checkDuplicateLetters(outputText);
        outputText = checkPedovkaStyle(outputText);

        return outputText.toString();
    }

    //Check wrong symbols in text -- Pegas
    static private StringBuilder checkWrongSymbols(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    //Check wrong letters: numbers, gaps etc. -- Anton
    static private StringBuilder checkWrongLetters(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    //Check english and russian letters in text -- Ilya Меняем латиницу на кириллицу!
    static private StringBuilder checkUnicode(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    //Anton
    static private StringBuilder checkDuplicateLetters(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    //The name speaks for itself -- Sasha
    static private StringBuilder checkPedovkaStyle(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    //The name speaks for itself -- Ruslan
    static private StringBuilder addCopyright(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    //Pasha
    static public void printText(String inputText){

    }

}
