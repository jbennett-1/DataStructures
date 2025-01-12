public class CTAImplementation {

    private static final String ALL_STATIONS_CSV =
            "https://raw.githubusercontent.com/lgreco/DataStructures/master/data/stations.csv";
    private static final String RED_LINE_SOUTHBOUND_TXT =
            "https://raw.githubusercontent.com/lgreco/DataStructures/master/data/RedLineSouthBound.txt";
    private static final String BROWN_LINE_SOUTHBOUND_TXT =
            "https://raw.githubusercontent.com/lgreco/DataStructures/master/data/BrownLineSouthBound.txt";
    private static final String YELLOW_LINE_SOUTHBOUND_TXT =
            "https://raw.githubusercontent.com/lgreco/DataStructures/master/data/YellowLineSouthBound.txt";


    /** Driver code */
    public static void main(String[] args) {
        CTATrainRoute redSB = new CTATrainRoute();
        CTATrainRoute brownSB = new CTATrainRoute();
        CTATrainRoute yellowSB = new CTATrainRoute();
        redSB = redSB.buildRoute(RED_LINE_SOUTHBOUND_TXT, ALL_STATIONS_CSV);
        brownSB = brownSB.buildRoute(BROWN_LINE_SOUTHBOUND_TXT, ALL_STATIONS_CSV);
        yellowSB = yellowSB.buildRoute(YELLOW_LINE_SOUTHBOUND_TXT, ALL_STATIONS_CSV);
        //System.out.println(yellowSB.removeStation("Oakton-Skokie"));
        //System.out.println(yellowSB.removeStation("Dempster-Skokie"));
        //System.out.println(yellowSB.removeStation("Howard"));
        System.out.println(brownSB);
        //System.out.println(redSB.intersects(brownSB));
    }
}  //class CTAImplementation