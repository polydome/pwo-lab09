package pwo.lab09.composite;

public class Lid extends WaterSystem {
    @Override
    public void fill() {
        System.out.println("Zdejmuje pokrywe");
        super.fill();
    }

    @Override
    public void afterFill() {
        super.afterFill();
        System.out.println("Zakladam pokrywe");
    }
}
