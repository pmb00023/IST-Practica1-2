package pack2;

public class Usuario {
	public String email = "";
    public String nombre = "";
    public String apellidos = "";

    //CONSTRUCTOR

    public Usuario(String email, String nombre,String apellidos) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //GETTERS
    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }

}
