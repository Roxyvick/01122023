import java.util.*;

public class trycatch3 {
    public static void main(String[] args) {
        try{ 
        Scanner scnIdade = new Scanner(System.in);
        System.out.println("Digite sua idade");
        short idade = scnIdade.nextShort();

        if (idade >= 18) {
            System.out.println("Parabéns! Você é maior de idade.");
        } else {
            System.out.println("Xii! Você é menor de idade.");
        }
    } catch (Exception e) {
        System.out.println("Ops! Ocorreu o erro " + e);
    }

    }
}
