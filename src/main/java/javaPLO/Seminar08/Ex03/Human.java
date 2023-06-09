package javaPLO.Seminar08.Ex03;

public class Human {

    private Transport lastTransport;

    public void drive(Transport transport) {
        if (lastTransport == null) {
            transport.start();
            lastTransport = transport;
        } else {
            System.out.println(" уже еду");
        }
    }

    public void stop() {
        if (lastTransport != null) {
            lastTransport.stop();
            lastTransport = null;
        } else {
            System.out.println(" стою");
        }
    }
}
