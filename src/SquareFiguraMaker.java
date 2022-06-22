// Concrete creator
class SquareFiguraMaker implements LaserCutter {
    public Figura makeFigura () {
        return new Square();
    }
}
