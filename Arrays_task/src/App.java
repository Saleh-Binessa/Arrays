public class App {
    public static void main(String[] args) throws Exception {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        String[] Names = {"Saleh","Ahmad","Yousef","Othman","Fahad","Nasser"};
        
        int[] WeatherTemp = new int[5];
        WeatherTemp[0] = 35;
        WeatherTemp[1] = 38;
        WeatherTemp[2] = 39;
        WeatherTemp[3] = 29;
        WeatherTemp[4] = 19;
        
        WeatherTemp[2] = 15;

        for(int wetherTemp : WeatherTemp)
        {
            System.out.println(wetherTemp + "C");
        }
        /*for(String name : Names)
        {
            System.out.println(name);
        }*/
    }
}
