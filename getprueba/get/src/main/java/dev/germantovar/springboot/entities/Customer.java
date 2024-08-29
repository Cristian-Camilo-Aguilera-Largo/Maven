package dev.germantovar.springboot.entities;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
@Entity//Se utiliza para marcar una clase como una entidad que se mapeara a una tabla en una base de datos
@Table(name = "productos")//Se uriliza para especificar la tabla de la base de datos con la que se mapeara una entidad
@Setter//Se utiliza para generar automaticamente metodos setter para las propiedades de una clase
@Getter//Se utiliza para generar automaticamente metodos getter para las propiedades de una clase
@ToString//Se utiliza para generar automaticamente el metodo toString() en una clase
@EqualsAndHashCode//Se utiliza para generar automaticamente los metodos equals() y hashCode() para una clase
public class Customer {
    @Id/*Sirve para indicar que un campo de una clase es la clave primaria de la entidad, es decir que lo que
    este marcado con @id sera el identificador unico de cada instancia de la entidad en la base de datos*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)/* Esto sirve para que cada vez que se inserta una nueva fila en la tabla
                                                          la base de datos asigna automaticamente un valor unico a la clave primaria*/
private Long id;
private String nombre;
private String descripcion;
private String tipo;
private String serial;
private String fecha;
private String peso;
private String alto;
private String ancho;
private String largo;
private String precio;
private String imagen;
}
