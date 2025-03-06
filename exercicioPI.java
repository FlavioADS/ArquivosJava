
package projeto_1;
import java.util.Scanner;
public class exercicioPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double si, st, au, tx, aut;
        si = 1000;
        tx = 1.5/100;
        st = si;
        aut = 0;
        int ano;
        
        for(ano = 2007; ano <= 2024; ano++){
        au = tx * st;
        tx = tx * 2;
        aut = aut + au;
        st = si + aut;
        
            System.out.printf(ano + " Salário atual do flávio é R$%.2f\n", st);
    }
    }
}
//Código de acumulação e variavel aque adiciona 1.5% ao ano
