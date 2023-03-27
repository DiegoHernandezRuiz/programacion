package practica1;
import practica1.dtos.SesionDeUsuario;

/**
 *
 * @author Diego
 */
public class TestEncapsulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testLogin();
        //testHackeo();
}
public static void testLogin() {
SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
sesionDeUsuario.setUsuario("sofia");
sesionDeUsuario.setPassword("abcdef"); // aqui fue donde puede salir mal el codigo debido a la contraseña.
sesionDeUsuario.doLogin();
if(sesionDeUsuario.isLoggedIn()) {
System.out.println("Bienvenido "+sesionDeUsuario.getUsuario());
}else {
System.out.println("Su usuario o contraseña están equivocados");
}
//sesionDeUsuario.setPassword("abcdef");
//sesionDeUsuario.doLogin();
//if(sesionDeUsuario.isLoggedIn()) {
//System.out.println("Bienvenido "+sesionDeUsuario.getUsuario());
//}else {
//System.out.println("Su usuario o contraseña estan equivocados");
}
}
//public static void testHackeo() {
//SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
//sesionDeUsuario.getPassword();
//sesionDeUsuario.setLoggedIn(true);
// Esta parte nos marcaba error ya que al querer traer o al querer 
//hacer el login del usuario en este caso sofia no se podia ya que
//la contraseña estaba mal ademas el test hackeo no se puede 
//ya que es demasiado dificil desencriptar el MD5
//}
        // TODO code application logic here
    