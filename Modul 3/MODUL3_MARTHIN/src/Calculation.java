public class Calculation implements Runnable {
    public double radius;
    public double side;
    public double area;
    public double phi = 3.14;

    public void setSquare (double side) throws IllegalArgumentException {
        if (side < 1) {
            throw new IllegalArgumentException("Side must be greater than 1");
        }
        this.side = side;
        this.area = side * side;
    }
    
    public static double getSquare () {
        return this.area;
    }

    public void setCircle (double radius) throws IllegalArgumentException {
        if (radius < 1) {
            throw new IllegalArgumentException ("Radius must be greater than 1");
        }
        this.radius = radius;
        this.area = phi * radius * radius;
    }

    public static double getCircle () {
        return this.area;
    }

    public void setTrapezoid (double a, double b, double t) throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
            throw new IllegalArgumentException ("illegal exception");
        }
        this.area = ((a + b) * t) / 2;
    }

    public static double getTrapezoid () {
        return this.area;
    }

    @Override
    public void run () {
        System.out.println ("====Program Will Start In====");
        for (int i = 3; i > 0; i--) {
            try {
                System.out.println (i);
                Thread.sleep (1000);
            } catch (InterruptedException e) {
                System.out.println ("Error: " + e.getMessage ());
            }
        }
        System.out.println ("Program has started");
    }
}
