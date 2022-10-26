package pwo.lab09.factory;

public class Saturday implements MessageFactory {


    @Override

    public String createIntroMessage() {

        return "Sobota imieniny kota";

    }

    @Override

    public String createMainMessage() {

        return "Idziemy na ryby";

    }

    @Override

    public String createClosingMessage() {

        return "To był dobry wolny dzień";
    }
}
