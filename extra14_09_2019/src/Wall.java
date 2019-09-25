public class Wall {

    double width;
    double heigth;
    double area;

    public static void main(String[] args) {

        Wall wall = new Wall(4, 5);
        System.out.println("Area =" + wall.getArea());
        wall.setHeigth(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Heigth = " + wall.getHeight());
        System.out.println("Area =" + wall.getArea());
    }

    public Wall() {

    }

    public Wall(double heigth, double width) {
        if (heigth <= 0 || width <= 0) {
            this.heigth = 0;
            this.width = 0;
        } else {
            this.heigth = heigth;
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return heigth;
    }

    public void setWidth(double width) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }

    public void setHeigth(double heigth) {
        if (heigth < 0)
            this.heigth = 0;
        else
            this.heigth = heigth;
    }

    public double getArea() {
        return area = heigth * width;
    }
}
