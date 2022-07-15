package excercises;

import java.util.Scanner;

public class second {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese un valor y devolveremos su valor + IVA includo (+21% del valor del producto)");
        System.out.println("ingresa un precio");
        String value= in.nextLine();
        //pasando string a numero
        Integer price=Integer.parseInt(value);
        priceWithIva(price);
    }
    public static void priceWithIva(Integer price){
        double iva=(price*21)/100;
        double conIva=price+iva;
        System.out.println("el valor final es "+conIva);
    }
}
