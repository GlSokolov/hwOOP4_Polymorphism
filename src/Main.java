import java.sql.Driver;

public class Main {
    public static void space() {
        System.out.println("===============================================================");
    }
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar("Лада", "Гранта", 1.6, PassengerCar.BodyType.HATCHBACK);
        PassengerCar alteeza = new PassengerCar("Тайота", "Альтеза", 2.0, PassengerCar.BodyType.SEDAN);
        PassengerCar chaser = new PassengerCar("Тайота", "Чайзер", 2.5, PassengerCar.BodyType.SEDAN);
        PassengerCar sera = new PassengerCar("Тайота", "Сера", 1.5, PassengerCar.BodyType.COUPE);

        FreightCar kamaz = new FreightCar("КАМаз", "356", 4.0, FreightCar.BodyType.N1);
        FreightCar volvo = new FreightCar("Вольво", "123", 4.5, FreightCar.BodyType.N1);
        FreightCar mercedes = new FreightCar("Мерседес", "2346", 5.0, FreightCar.BodyType.N1);
        FreightCar man = new FreightCar("МАН", "26485", 6.0, FreightCar.BodyType.N2);

        Bus ikarus = new Bus("Икарус", "55", 2.0, Bus.BodyType.MEDIUM);
        Bus GAZel = new Bus("Газель", "Next", 1.6, Bus.BodyType.SMALL);
        Bus PAZ = new Bus("Паз", "32053", 2.5, Bus.BodyType.MEDIUM);
        Bus fiat = new Bus("Фиат", "228", 2.0, Bus.BodyType.SMALL);

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

        sera.PrintType();
        ikarus.PrintType();
        kamaz.PrintType();

        space();

        ChooseDriver<PassengerCar> driverB = new ChooseDriver<>("Глеб", true, 3, "B");
        driverB.getDriverInfo(sera);
        driverB.getDriverInfo(chaser);

        ChooseDriver<FreightCar> driverC = new ChooseDriver<>("Никита", true, 4, "C");
        driverC.getDriverInfo(man);

        ChooseDriver<Bus> driverD = new ChooseDriver<>("Рустам", true, 5, "D");
        driverD.getDriverInfo(fiat);

        ChooseDriver<Car> driverBCD = new ChooseDriver<>("Судья", true, 6, "BCD");
        driverBCD.getDriverInfo(sera);
        driverBCD.getDriverInfo(man);
        driverBCD.getDriverInfo(fiat);

space();
// Домашка на тему "Исключения":
        fiat.GetDiagnosed(driverB);
    }
}