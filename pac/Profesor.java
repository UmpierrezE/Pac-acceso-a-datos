package pac;

public class Profesor {
    //Atributos
    private Long id;
    private String nombre;
    private String sexo;

    //Constructor
    public Profesor(){
    }

    //Constructor con par�metros
    public Profesor (Long id, String nombre, String sexo){
        this.id=id;
        this.nombre=nombre;
        this.sexo=sexo;
    }

    //Getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //ToString
    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
