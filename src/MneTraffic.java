public class MneTraffic implements CentralTraffic, EuropeTraffic {
    @Override
    public void redLight() {
        System.out.println("Stop!");
    }

    @Override
    public void yellowLight() {
        System.out.println("Wait!");
    }

    @Override
    public void greenLight() {
        System.out.println("Go!");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up!");
    }

    @Override
    public void trainSymbol() {
        System.out.println("Train is coming!");
    }

    @Override
    public void esclamationSign() {
        System.out.println("Warning - !!!");
    }

    public static void main(String[] args) {
        CentralTraffic ct = new MneTraffic();
        ct.greenLight();
        ct.redLight();
        ct.yellowLight();
        ct.speedUp();
        System.out.println(max_speed);
        EuropeTraffic ep = new MneTraffic();
        ep.esclamationSign();
        ep.trainSymbol();

    }
}
