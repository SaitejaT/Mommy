package mommy;

public class Mommy {
    private final String input;

    public Mommy(String input) {

        this.input = input;
    }

    public String handleMommy() {
        if(isContinous(input)){
            return "mommy";
        }
        return ifVowel();
    }

    private boolean isContinous(String input) {
        if (input.contains("AE")){
            return true;
        }
        return false;
    }

    private String ifVowel() {
        char charArray[] = input.toCharArray();
        String output = "";

        for (char alphabet : charArray) {
            if (alphabet == 'A')
                output += "mommy";
            else
                output += alphabet;
        }
        return output;
    }
}
