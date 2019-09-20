import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class main {

	public static void main(String[] args) {
		Persona p = new Persona();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un nombre:");
		p.setNombre(entrada.nextLine());
		System.out.println("Introduce apellidos:");
		p.setApellidos(entrada.nextLine());
		System.out.println("Introduce edad:");
		p.setEdad(entrada.nextInt());
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		entrada.close();
	}

}
