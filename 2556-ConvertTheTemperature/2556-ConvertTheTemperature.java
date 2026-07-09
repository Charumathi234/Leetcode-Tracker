// Last updated: 7/9/2026, 3:05:53 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius+273.15;
        double fahrenheit = celsius*1.80+32.00;
        return new double[] {kelvin,fahrenheit};
     
    }
}