package excepciones;
// Excepción gestionada durante la ejecución de un programa.
public class ExcepcionesDivPorCeroGest {
    /*
    public int divide(int a, int b) {
        return a / b;
    }
    */ //no se usa este método

    static void main(String[] args) {
        int a, b;
        a = 5; b = 2;
        /*
        try {
            System.out.println(a + " / " + b + " = " + a / b);
        } catch (ArithmeticException e) {
            System.err.println("Error al dividir: " + a + " / " + b);
        }
        try {
            b = 0; System.out.println(a + " / " + b + " = " + a / b);
        } catch (ArithmeticException e) {
            System.err.println("Error al dividir: " + a + " / " + b);
        }
        try {
            b = 3; System.out.println(a + " / " + b + " = " + a / b);
        } catch (ArithmeticException e) {
            System.err.println("Error al dividir: " + a + " / " + b);
        } */


        try {   //al juntar las tres divisiones, el código de try se corta en cuanto salta un error por lo que la última no se ejecuta
            System.out.println(a + "/" + b + "=" + a / b);
            b = 0; System.out.println(a + "/" + b + "=" + a / b);
            b = 3; System.out.println(a + "/" + b + "=" + a / b);
        } catch (ArithmeticException e) {
            System.err.println("Error al dividir: " + a + "/" + b);
        }
    }
}
