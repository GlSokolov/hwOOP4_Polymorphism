import java.sql.Driver;

public class Main {
    public static void space() {
        System.out.println("===============================================================");
    }
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar("Лада", "Гранта", 1.6);
        PassengerCar alteeza = new PassengerCar("Тайота", "Альтеза", 2.0);
        PassengerCar chaser = new PassengerCar("Тайота", "Чайзер", 2.5);
        PassengerCar sera = new PassengerCar("Тайота", "Сера", 1.5);

        FreightCar kamaz = new FreightCar("КАМаз", "356", 4.0);
        FreightCar volvo = new FreightCar("Вольво", "123", 4.5);
        FreightCar mercedes = new FreightCar("Мерседес", "2346", 5.0);
        FreightCar man = new FreightCar("МАН", "26485", 6.0);

        Bus ikarus = new Bus("Икарус", "55", 2.0);
        Bus GAZel = new Bus("Газель", "Next", 1.6);
        Bus PAZ = new Bus("Паз", "32053", 2.5);
        Bus fiat = new Bus("Фиат", "228", 2.0);

        System.out.println(lada);
        System.out.println(alteeza);
        System.out.println(chaser);
        System.out.println(sera);
        space();
        System.out.println(kamaz);
        System.out.println(volvo);
        System.out.println(mercedes);
        System.out.println(man);
        space();
        System.out.println(ikarus);
        System.out.println(GAZel);
        System.out.println(PAZ);
        System.out.println(fiat);

        sera.StartMove();
        sera.EndMove();
        sera.maxSpeed(180);
        sera.pitStop();
        sera.bestLapTime(11.5);

        space();

        ChooseDriver<PassengerCar> driverB = new ChooseDriver<>("Глеб", true, 3);
        driverB.getDriverInfo(sera);
        driverB.getDriverInfo(chaser);

        ChooseDriver<FreightCar> driverC = new ChooseDriver<>("Никита", true, 4);
        driverC.getDriverInfo(man);

        ChooseDriver<Bus> driverD = new ChooseDriver<>("Рустам", true, 5);
        driverD.getDriverInfo(fiat);

        ChooseDriver<Car> driverBCD = new ChooseDriver<>("Судья", true, 6);
        driverBCD.getDriverInfo(sera);
        driverBCD.getDriverInfo(man);
        driverBCD.getDriverInfo(fiat);

    }
}