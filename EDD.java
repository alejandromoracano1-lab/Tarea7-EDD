import java.util.Scanner;

public class EDD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de la Hermandad (ej: Macarena, Cachorro): ");
        // Leemos la entrada y la pasamos a minúsculas para evitar problemas
        String hermandad = scanner.nextLine().toLowerCase().trim();

        System.out.print("\nResultado: ");
        
        // Comparamos el nombre introducido
        switch (hermandad) {
            case "paz":
            case "la paz":
            case "hiniesta":
            case "la hiniesta":
            case "estrella":
            case "la estrella":
                System.out.println("Procesiona el Domingo de Ramos.");
                break;
                
            case "san gonzalo":
            case "santa marta":
            case "museo":
            case "el museo":
                System.out.println("Procesiona el Lunes Santo.");
                break;
                
            case "san benito":
            case "los estudiantes":
            case "el cerro":
                System.out.println("Procesiona el Martes Santo.");
                break;
                
            case "san bernardo":
            case "el baratillo":
            case "la sed":
            case "nervion":
                System.out.println("Procesiona el Miércoles Santo.");
                break;
                
            case "pasion":
            case "las cigarreras":
            case "montesion":
                System.out.println("Procesiona el Jueves Santo.");
                break;
                
            case "macarena":
            case "la macarena":
            case "gran poder":
            case "el gran poder":
            case "esperanza de triana":
            case "los gitanos":
                System.out.println("Procesiona en La Madrugá.");
                break;
                
            case "cachorro":
            case "el cachorro":
            case "la o":
                System.out.println("Procesiona el Viernes Santo.");
                break;
                
            case "los servitas":
            case "la trinidad":
            case "santo entierro":
                System.out.println("Procesiona el Sábado Santo.");
                break;
                
            case "la resurreccion":
            case "resurreccion":
                System.out.println("Procesiona el Domingo de Resurrección.");
                break;
                
            default:
                System.out.println("Hermandad no encontrada. Intenta escribirla sin acentos.");
                break;
        }

        scanner.close();
    }
}


