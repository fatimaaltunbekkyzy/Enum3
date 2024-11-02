//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double distance = 1000;// Мисалы: 1000 км
        for (TransportType type : TransportType.values()) {
            double cost = type.calculateTravelCost(distance);
            System.out.printf("%s үчүн %f км аралыкка баа: $%.2f%n", type, distance, cost);
        }

/*TransportType деген enum туз. Ичине ар кандай типтеги унааларды жаз. Мисалы: CAR, BUS, TRUCK.

Enum-дын ичинде бир  метод болсун:
public  double calculateTravelCost(double distance);
Бул метод транспорттун ар бир түрү үчүн өзүнүн жол баасын эсептеп чыгышы керек.

(CAR)  Автоунаанын бир километринин баасы $0,1.
(BUS)  Автобустун бир километринин баасы $0,05
(TRUCK.) Трак үчүн бир километрдин баасы $0,02 */
    }
}