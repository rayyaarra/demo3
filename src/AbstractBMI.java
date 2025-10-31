public abstract class AbstractBMI {
    public double berat;

    public AbstractBMI(double berat) {
        this.berat = berat;
    }

    public abstract String kategoriBMI();
}
