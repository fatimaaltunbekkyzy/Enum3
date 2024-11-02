public enum TransportType {
    CAR(0.1),    //  (CAR)  Автоунаанын бир километринин баасы $0,1.
    BUS(0.05),   //  (BUS)  Автобустун бир километринин баасы $0,05
    TRUCK(0.02); //  (TRUCK.) Трак үчүн бир километрдин баасы $0,02
    private final double tollPrise;

    TransportType(double tollPrise) {
        this.tollPrise = tollPrise;
    }

    public  double calculateTravelCost(double distance){
        return tollPrise * distance;
    }
}
