
public class Principal {
    
     public static void main(String[] args) {
         Libro libro1 = new Libro("EL PLAN MAESTRO", "Javier Sierra", 4, 6);
        libro1.imprimpir();
         
       System.out.println(libro1);
       System.out.println("Préstamo libro1: " + libro1.Disponible());
       System.out.println(libro1);
       System.out.println("Devolución libro1: " + libro1.Devolucion());
       System.out.println(libro1);
         
      
   }
}