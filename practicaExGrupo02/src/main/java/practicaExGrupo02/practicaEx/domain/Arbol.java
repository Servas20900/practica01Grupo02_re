package practicaExGrupo02.practicaEx.domain;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "arbol")
@AllArgsConstructor
@NoArgsConstructor //Estos generan los constructores
public class Arbol implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")

    private Long idArbol;
    private String nombre;
    private String flor;
    private Integer dureza;
    private Integer altura;
    private String rutaImagen;
    //Estos son los requerimientos para crear un objeto
    

}
