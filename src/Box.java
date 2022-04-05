public class Box {
    //attributes (state)
    private double length;
    private double width;
    private double height;

    //פעולה בונה (constructor)
    public Box(double length,
               double width,
               double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //methods (behavior)


    public void setHeight(double height) {
        if (height > 20)
            this.height = 20;
        else
            this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.height * this.length * this.width;
    }


    public String toString() {
        return  "width:"+this.width+
                " height:"+this.height+
                " length:"+this.length;
    }
}
