public class RealNumber{
    private double value;

    public RealNumber(double v) {
      value = v;
    }

    public double add(RealNumber other) {
      return getValue(this.value) + getValue(other);
    }
}
