public class MainFormas {
// Programa principal
    public static void main(String[] args) {
        FormaGeometrica forma = new FormaGeometrica();

        // Testando área do quadrado
        double areaQuadrado = forma.calcularArea(5);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        // Testando área do retângulo
        double areaRetangulo = forma.calcularArea(4, 6);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        // Testando área do trapézio
        double areaTrapezio = forma.calcularArea(8, 5, 4);
        System.out.println("Área do Trapézio: " + areaTrapezio);
    }
}