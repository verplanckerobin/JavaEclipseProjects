package domein;

public class Complex
{
    private double real, imaginair;

    public Complex()
    {
        this(0,0);
    }

    public Complex(double real)
    {
        this(real,0);
    }

    public Complex(double real, double imaginair)
    {
        this.real = real;
        this.imaginair = imaginair;
    }

    public double getReal()
    {
        return real;
    }

    public double getImaginair()
    {
        return imaginair;
    }
    
    public Complex telOp(Complex c2)
    {
        return new Complex(this.real + c2.real, this.imaginair + c2.imaginair);
    }
    
    public Complex trekAf(Complex c2)
    {
        return new Complex(this.real - c2.real, this.imaginair - c2.imaginair);
    }
    
    @Override
    public String toString()
    {
        return String.format("(%.2f;%.2f)", this.real, this.imaginair);
    }
}
