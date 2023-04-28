public class Ejecutable {
    Turnos turn = new Turnos (1,"Guada","Gomez", "19:00", "28/04/2023", "500");
    System.out.println(turn.toString());
    Turnos turn1 = new Turnos();
    System.out.println(turn1.toString());
    Scanner scnNro = new Scanner (System.in);
    Scanner scnCad = new Sacnner(System.in);
    System.out.println("Ingrese el codigo del turno")
    int cod = scnNro.nextInt();
    System.out.println("ingrese el nombre de la persona del turno")
    String nom= scnCad.nextLine();
    System.out.println("ingrese el apellido de la persona del turno")
    String apellido= scnCad.nextLine();
    System.out.println("ingrese la hora del turno")
    int hora = scnNro.nextInt();
    System.out.println("ingrese la fecha del turno")
    String fecha = scnCad.nextLine();
    System.out.println("ingrese el precio del turno")
    Double precio = scnNro.nextInt();

    turn1.setCod(cod);
        turn1.setNombre(nom);
        turn.getApellido(apellido);
        turn1.getHora(hora);
        turn1.getFecha(fecha);
        turn1.getPrecio(precio);
        System.out.println(turn1.toString());
}
