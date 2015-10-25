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
        outputText = checkUnicode(outputText, ch);
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
    static private String checkUnicode(StringBuilder inputText, int ch){
        StringBuilder outputText = inputText;
        switch (ch){
            case 'А': return "A"; // Пока что вбил кирилицу и латиницу, аля перевод с албанского на русский
            case 'а': return "a";
            case 'Б': return "B";
            case 'б': return "b";
            case 'В': return "V";
            case 'в': return "v";
            case 'Г': return "G";
            case 'г': return "g";
            case 'Д': return "D";
            case 'д': return "d";
            case 'Е': return "E";
            case 'е': return "e";
            case 'Ё': return "JE";
            case 'ё': return "je";
            case 'Ж': return "ZH";
            case 'ж': return "zh";
            case 'З': return "Z";
            case 'з': return "z";
            case 'И': return "I";
            case 'и': return "i";
            case 'Й': return "Y";
            case 'й': return "y";
            case 'К': return "K";
            case 'к': return "k";
            case 'Л': return "L";
            case 'л': return "l";
            case 'М': return "M";
            case 'м': return "m";
            case 'Н': return "N";
            case 'н': return "n";
            case 'О': return "O";
            case 'о': return "o";
            case 'П': return "P";
            case 'п': return "p";
            case 'Р': return "R";
            case 'р': return "r";
            case 'С': return "S";
            case 'с': return "s";
            case 'Т': return "T";
            case 'т': return "t";
            case 'У': return "U";
            case 'у': return "u";
            case 'Ф': return "F";
            case 'ф': return "f";
            case 'Х': return "KH";
            case 'х': return "kh";
            case 'Ц': return "C";
            case 'ц': return "c";
            case 'Ч': return "CH";
            case 'ч': return "ch";
            case 'Ш': return "SH";
            case 'ш': return "sh";
            case 'Щ': return "JSH";
            case 'щ': return "jsh";
            case 'Ъ': return "HH";
            case 'ъ': return "hh";
            case 'Ы': return "IH";
            case 'ы': return "ih";
            case 'Ь': return "JH";
            case 'ь': return "jh";
            case 'Э': return "EH";
            case 'э': return "eh";
            case 'Ю': return "JU";
            case 'ю': return "ju";
            case 'Я': return "JA";
            case 'я': return "ja";
            default: return String.valueOf(ch);
        }

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
