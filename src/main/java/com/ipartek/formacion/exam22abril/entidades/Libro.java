package com.ipartek.formacion.exam22abril.entidades;

import java.math.BigDecimal;
import java.util.Objects;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Libro {
	@Min(0)
	private Long id;
	
	@NotNull
	@Size(min = 2, max = 150)
	private String nombre;
	
    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer=5, fraction=2, message = "máximo 2 decimales")
    private BigDecimal precio;
	
    @Min(value = 0, message = "El descuento debe ser mayor o igual a 0")
    @Max(value = 100, message = "El descuento debe ser menor o igual a 100")
    private Integer descuento;
    
	@URL
	private String urlFoto;
	
	@NotNull
	private String autor;
    

	public Libro(@Min(0) Long id, @NotNull @Size(min = 2, max = 150) String nombre,
			@NotNull @DecimalMin(value = "0.0", inclusive = false) @Digits(integer = 5, fraction = 2, message = "máximo 2 decimales") BigDecimal precio,
			@Min(value = 0, message = "El descuento debe ser mayor o igual a 0") @Max(value = 100, message = "El descuento debe ser menor o igual a 100") Integer descuento,
			@URL String urlFoto, @NotNull String autor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descuento = descuento;
		this.urlFoto = urlFoto;
		this.autor = autor;
	}

	public Libro() {
	}

	public Libro(String nombre, BigDecimal precio) {
		this(null, nombre, precio, null);
	}
	
	public Libro(String nombre, BigDecimal precio, Integer descuento) {
		this(null, nombre, precio, descuento);
	}
	
	public Libro(Long id, String nombre, BigDecimal precio, Integer descuento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descuento = descuento;
	}


	public Libro(@NotNull @Size(min = 2, max = 150) String nombre,
			@NotNull @DecimalMin(value = "0.0", inclusive = false) @Digits(integer = 5, fraction = 2, message = "máximo 2 decimales") BigDecimal precio,
			@Min(value = 0, message = "El descuento debe ser mayor o igual a 0") @Max(value = 100, message = "El descuento debe ser menor o igual a 100") Integer descuento,
			@URL String urlFoto, @NotNull String autor) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descuento = descuento;
		this.urlFoto = urlFoto;
		this.autor = autor;
	}

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

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setUrlFoto(Integer descuento) {
		this.descuento = descuento;
	}
	
	public String getUrlFoto() {
		return urlFoto;
	}
	
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
			this.autor = autor;
	}
	
	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, descuento, id, nombre, precio, urlFoto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(descuento, other.descuento)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(precio, other.precio) && Objects.equals(urlFoto, other.urlFoto);
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descuento=" + descuento
				+ ", urlFoto=" + urlFoto + ", autor=" + autor + "]";
	}
}
