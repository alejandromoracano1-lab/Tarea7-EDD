import java.util.Scanner;

public class main {
    public static void mainDia(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== SEMANA SANTA DE SEVILLA ======");
        System.out.print("Introduce un día (ej: Lunes Santo, Martes Santo, Miércoles Santo, Jueves Santo, La Madrugá Viernes Santo, Sabado Santo.): ");
        String dia = scanner.nextLine().toLowerCase(); 

        System.out.println("\nHermandades que procesionan:");

        
        if (dia.equals("domingo de ramos")) {
            System.out.println("- La Borriquita\n- Jesús Despojado\n- La Paz\n- La Cena\n- La Hiniesta\n- San Roque\n- La Estrella\n- La Amargura\n- El Amor");
        } 
        else if (dia.equals("lunes santo")) {
            System.out.println("- San Pablo\n- La Redención\n- Santa Genoveva\n- Santa Marta\n- San Gonzalo\n- Vera Cruz\n- Las Penas\n- Las Aguas\n- El Museo");
        } 
        else if (dia.equals("martes santo")) {
            System.out.println("- El Cerro\n- Los Javieres\n- San Esteban\n- Los Estudiantes\n- San Benito\n- Santa Cruz\n- La Candelaria\n- El Dulce Nombre");
        } 
        else if (dia.equals("miércoles santo")) {
            System.out.println("- Carmen Doloroso\n- La Sed\n- San Bernardo\n- El Buen Fin\n- La Lanzada\n- El Baratillo\n- Cristo de Burgos\n- Las Siete Palabras\n- Los Panaderos");
        } 
        else if (dia.equals("jueves santo")) {
            System.out.println("- Los Negritos\n- La Exaltación\n- Las Cigarreras\n- Montesión\n- La Quinta Angustia\n- El Valle\n- Pasión");
        } 
        else if (dia.equals("la madrugá")) {
            System.out.println("- El Silencio\n- El Gran Poder\n- La Macarena\n- El Calvario\n- La Esperanza de Triana\n- Los Gitanos");
        } 
        else if (dia.equals("viernes santo")) {
            System.out.println("- La Carretería\n- Soledad de San Buenaventura\n- El Cachorro\n- La O\n- San Isidoro\n- Montserrat\n- Sagrada Mortaja");
        } 
        else if (dia.equals("sábado santo")) {
            System.out.println("- El Sol\n- Los Servitas\n- La Trinidad\n- El Santo Entierro\n- Soledad de San Lorenzo");
        } 
        else if (dia.equals("domingo de resurrección")) {
            System.out.println("- El Resucitado");
        } 
        else {
            System.out.println("Día no válido. Recuerda incluir las tildes (ej: 'Miércoles Santo' o 'La Madrugá').");
        }

        scanner.close();
    }
}