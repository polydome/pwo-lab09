package pwo.lab09.factory;

public class Sunday implements MessageFactory {


    @Override

    public String createIntroMessage() {

        return "Spokojny, wyjątkowy dzień";

    }

    @Override

    public String createMainMessage() {

        return "Niedzielny obiad z rodziną";

    }

    @Override

    public String createClosingMessage() {

        return "Ostatnie chwile wolności";
    }
}
