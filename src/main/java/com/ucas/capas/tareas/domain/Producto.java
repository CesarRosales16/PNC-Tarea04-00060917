package com.ucas.capas.tareas.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	@Size(min = 12, max = 12, message = "El codigo debe tener una longitud de 12.")
	@Pattern(regexp = "[0-9]{12}", message = "El codigo debe estar formado solo por digitos.")
	String codigo;

	@Size(min = 1, max = 100, message = "El nombre del producto debe tener una longitud entre 1 y 100 caracteres.")
	String nombre;

	@Size(min = 1, max = 100, message = "La marca debe tener una longitud entre 1 y 100 caracteres.")
	String marca;

	@Size(min = 1, max = 500, message = "La descripcion debe tener una longitud entre 1 y 500 caracteres.")
	String descripcion;

	@Pattern(regexp = "\\d+", message = "El stock debe ser un número sin decimales")
	String existencias;

	@Pattern(regexp = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", message = "La fecha debe seer en formato dd/mm/aaaa")
	String fechaIngreso;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
}
