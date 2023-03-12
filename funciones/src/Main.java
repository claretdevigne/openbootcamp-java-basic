/**
 * Crea una función que reciba un precio y lo devuelva con el IVA incluído
 */
public class Main {
  public static void main(String[] args) {
    double price = getPrice(100);
    System.out.println(String.format("%.2f", price));
  }

  private static double getPrice(double price) {
    double iva = 1.14;
    return price * iva;
  }
}