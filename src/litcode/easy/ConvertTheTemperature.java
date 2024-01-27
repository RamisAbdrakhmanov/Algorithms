package litcode.easy;

public class ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        double[] temperature = new double[2];
        temperature[0] = celsius + 273.15000;
        temperature[1] = celsius * 1.8 + 32.00000;
        return temperature;
    }
}
