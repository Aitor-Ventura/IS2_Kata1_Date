import java.util.Date;

public class Kata1 {
    public static void main(String[] args) throws Exception {
        Person aitor = new Person("Aitor Ventura Delgado", new Date(100, 7, 14));
        System.out.println("La edad de Aitor es " + aitor.getAge());
        System.out.println("El nombre completo de Aitor es " + aitor.getName());
    }
}
