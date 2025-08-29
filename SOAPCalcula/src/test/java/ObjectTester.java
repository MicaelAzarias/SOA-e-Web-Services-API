import br.com.fiap3espa.service.Subtraction;
import br.com.fiap3espa.service.Sum;
import br.com.fiap3espa.service.Multiplication;
import br.com.fiap3espa.service.Division;

public class ObjectTester {
    public static void main(String[] args){
    Sum soma = new Sum();
    System.out.println(soma.showMessage(9, 27));
    System.out.println(soma.showName());
    System.out.println(soma.calculate(9, 24));
    System.out.println(soma.showSymbol());


    Subtraction sub = new Subtraction();
    System.out.println(sub.showMessage(9, 27));
    System.out.println(sub.showName());
    System.out.println(sub.calculate(9, 24));
    System.out.println(sub.showSymbol());

    Multiplication mult = new Multiplication();
    System.out.println(mult.showMessage(9, 27));
    System.out.println(mult.showName());
    System.out.println(mult.calculate(9, 24));
    System.out.println(mult.showSymbol());


    Division div = new Division();
    System.out.println(div.showMessage(9, 27));
    System.out.println(div.showName());
    System.out.println(div.calculate(9, 24));
    System.out.println(div.showSymbol());

    }
}
