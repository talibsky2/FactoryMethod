public class Test {
    public static void main(String[] args) {
        LaserCutter circle = new CircleFiguraMaker();
        LaserCutter square = new SquareFiguraMaker();
        Figura figura = circle.makeFigura();
        Figura figura2 = square.makeFigura();
        figura.useLaserCutter();
        figura.paintFigura();
        figura2.useLaserCutter();
        figura2.paintFigura();
    }
}
