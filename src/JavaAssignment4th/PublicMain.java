package JavaAssignment4th;

public class PublicMain {
    public void Emplyee(){
        System.out.println("Method called from Own package");
    }
    public static void main(String[] args) {
        JavaAssignment4newP.PublicModifier obj1 = new JavaAssignment4newP.PublicModifier();         // Creating an object of PublicModifier class from Class41
        obj1.publicMethod();

        PublicMain emp = new PublicMain();
        emp.Emplyee();

    }
}
