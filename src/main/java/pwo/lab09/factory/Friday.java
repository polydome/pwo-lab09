package pwo.lab09.factory;

public class Friday implements MessageFactory {


    @Override

    public String createIntroMessage() {

        return "Piątek weekendu początek";

    }

    @Override

    public String createMainMessage() {

        return "Kiedy weekend";

    }

    @Override

    public String createClosingMessage() {

        return "Wreszcie weekend";
    }
}
