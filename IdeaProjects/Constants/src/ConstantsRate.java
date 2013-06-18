/**
 * Created with IntelliJ IDEA.
 * User: Anthony
 * Date: 13-06-18
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConstantsRate {
    // Conversion is from left unit to right unit
    public int FahrenheitCelcius(int f) {
        int c = f - 32 * 5 / 9;
        return c;

    }
    public double lbkg(double lb) {
        double kg = lb * 0.45359;
        return kg;
    }
}
