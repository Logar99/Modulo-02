package model;

import jakarta.persistence.*;

public class cliente {
    private Long id;
    private String nombre;
    private String correoContacto;
    private int numeroEmpleados;
    private String direccion;

    public Object getId() {
        return null;
    }
}

@Entity
@Table(name = "Cliente")
public class Cliente

    @Id
    private java.lang.Long id;
    private java.lang.Long Long;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        Long = id;
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @Column(name = "correo_contacto", length = 30)
    private String correoContacto;

    @Column(name = "numero_empleados")
    private int numeroEmpleados;}
