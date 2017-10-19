import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declaramos variables
		int calorias,suma=0,contador=0,mayorCalorias=0;
		double media;
		
		Scanner teclado=new Scanner(System.in);
		
		do{
			System.out.println("Introduce las calorias de la comida ingerida:");
			calorias=teclado.nextInt();
			suma=suma+calorias;
			
			if (calorias!=0) //Uso un if porque sino me cuenta también la vez que el usuario pone 0
			{
				contador++;
			}
			
			if (calorias>=mayorCalorias) //Contabilizar el mayor número de calorias
			{
				mayorCalorias=calorias;
			}
		}
		while(calorias!=0);
		
		//Mostramos la suma
		System.out.println("Total de calorias ingeridas: "+suma);
		
		//calculamos la media de calorias por ingesta
		media=(double)suma/contador;
		System.out.println("La media de las calorias por ingesta es :" +media);
		
		//Mostramos el número de calorias mayor que se contabilizó
		System.out.println("El número mayor de calorías que se contabilizó fue: "+mayorCalorias);
		
	}

}
