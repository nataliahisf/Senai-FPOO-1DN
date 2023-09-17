public class MyClass {
    public static void main(String args[]) {
// 1 Pé = 12 Polegadas
// 1 Jarda = 3 Pés
// 1 Milha = 1.760 Jarda

    double pe = 1;
    double peEntrada = 10;

    double polegadas = pe * 12;
    double jarda = peEntrada / (pe * 3);
    double milha = peEntrada / (1760 / (pe * 3));

        System.out.println("Pol. " + polegadas);
        System.out.println("Jardas " + jarda);
        System.out.println("Milhas " + milha);
        }
    }