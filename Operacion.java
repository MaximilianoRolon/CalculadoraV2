import java.util.Scanner;
public class Operacion {
Scanner teclado=new Scanner(System.in);
protected int a,b,resultado,division,multiplicacion;
	public void cargar(){
		System.out.print("ingrese un numero");
		a=teclado.nextInt();
		System.out.print("ingrese otro numero");
		b=teclado.nextInt();
	}
	public void mostrar(){
		System.out.print("el resultado es:\n");
		System.out.print(resultado+"\n");
	}
}
