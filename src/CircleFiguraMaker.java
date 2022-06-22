// Concrete creator
class CircleFiguraMaker implements LaserCutter {
    public Figura makeFigura () {
        return new Circle();
    }
}
