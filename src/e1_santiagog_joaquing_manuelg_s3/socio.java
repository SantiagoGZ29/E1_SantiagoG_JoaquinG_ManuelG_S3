
package e1_santiagog_joaquing_manuelg_s3;
import java.util.Scanner;
//Atributos de la clase socio
public class socio {
    private static int contadorNroSocio = 123456787;
    private int nroSocio;
    private String rut;
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private String correo;
    private String domicilio;
    private String region;
    private String ciudad;
    private String comuna;
    private int telefono;
    private cuentaSocio cuenta;

//constructor vacio
public socio(){  
    this.nroSocio = ++contadorNroSocio;
}

//Constructor de la clase socio
public socio(int nroSocio, String rut, String nombre, String apellidoPat, String apellidoMat, String correo, String domicilio, String region, String ciudad, String comuna, int telefono) {
    this.nroSocio = nroSocio;
    this.rut = rut;
    this.nombre = nombre;
    this.apellidoPat = apellidoPat;
    this.apellidoMat = apellidoMat;
    this.correo = correo;
    this.domicilio = domicilio;
    this.region = region;
    this.ciudad = ciudad;
    this.comuna = comuna;
    this.telefono = telefono;
    }
    //Metodos get de la clase socio
    public int getNroSocio() {
        return nroSocio;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getRegion() {
        return region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public int getTelefono() {
        return telefono;
    }
       
    //Metodos set de la clase socio
    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //Metodo para registrar un socio
    public void registrarSocio(){
        Scanner sc = new Scanner(System.in);
        
        // Asignar número de socio automáticamente
        this.nroSocio = ++contadorNroSocio;
        System.out.println("Número de socio asignado: " + this.nroSocio);

        // Ingresar datos del socio
        System.out.println("Ingrese el rut del socio: ");
        this.rut = sc.next();
        //Validacion del rut
        while (this.rut.length()< 11 || this.rut.length() >12) {
            System.out.println("El rut ingresado no es válido, por favor ingrese un rut válido: ");
            this.rut = sc.next();
        }

        sc.nextLine(); 
        System.out.println("Ingrese el nombre del socio: ");
        this.nombre = sc.next();
        sc.nextLine(); 
        System.out.println("Ingrese el apellido paterno del socio: ");
        this.apellidoPat = sc.next();
        sc.nextLine(); 
        System.out.println("Ingrese el apellido materno del socio: ");
        this.apellidoMat = sc.next();
        sc.nextLine(); 
        System.out.println("Ingrese el correo del socio: ");
        this.correo = sc.next();
        sc.nextLine(); 
        System.out.println("Ingrese el domicilio del socio: ");
        this.domicilio = sc.next();
        sc.nextLine(); 
        System.out.println("Ingrese la región del socio: ");
        this.region = sc.next();
        sc.nextLine(); 
        System.out.println("Ingrese la ciudad del socio: ");
        this.ciudad = sc.next();
        sc.nextLine(); 
        System.out.println("Ingrese la comuna del socio: ");
        this.comuna = sc.next();
        sc.nextLine(); 
        System.out.println("Ingrese el teléfono del socio: ");
        this.telefono = sc.nextInt();        
        sc.nextLine(); 
        System.out.println("Socio registrado con éxito.");

        this.cuenta = new cuentaSocio();
        cuenta.setNroSocio(this.nroSocio);
        cuenta.setValorCuota(80000);
        cuenta.setCantidadAportada(0);
        }

    //Metodo para mostrar los datos del socio
    public void mostrarDatosSocio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de socio: ");
        int nroSocio = sc.nextInt();
        sc.nextLine();
        if (nroSocio == this.nroSocio) {
            System.out.println("Número de socio: " + this.nroSocio);
            System.out.println("Rut: " + this.rut);
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Apellido Paterno: " + this.apellidoPat);
            System.out.println("Apellido Materno: " + this.apellidoMat);
            System.out.println("Correo: " + this.correo);
            System.out.println("Domicilio: " + this.domicilio);
            System.out.println("Región: " + this.region);
            System.out.println("Ciudad: " + this.ciudad);
            System.out.println("Comuna: " + this.comuna);
            System.out.println("Valor cuota: " + this.cuenta.getValorCuota());
            System.out.println("Cantidad aportada: " + this.cuenta.getCantidadAportada());
        } else {
            System.out.println("El número de socio ingresado no corresponde a ningún socio registrado.");
        }
    }


    
}