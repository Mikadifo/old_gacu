package clases;

public class Usuario {
    
    //atributos
    private String nombreUsuario;
    private String cedulaUsuario;
    private String ciudadUsuario;
    private String contrasenaUsuario;
    //fin atributos
    
    //constructores
    public Usuario() {
    }

    public Usuario(String nombreUsuario, String cedulaUsuario, String ciudadUsuario, String contrasenaUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.ciudadUsuario = ciudadUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
    }
    //fin constructores
    
    //getters&setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getCiudadUsuario() {
        return ciudadUsuario;
    }

    public void setCiudadUsuario(String ciudadUsuario) {
        this.ciudadUsuario = ciudadUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }
    //fin getters&setters
    
    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", cedulaUsuario=" + cedulaUsuario + ", ciudadUsuario=" + ciudadUsuario + ", contrasenaUsuario=" + contrasenaUsuario + '}';
    }
    
}
