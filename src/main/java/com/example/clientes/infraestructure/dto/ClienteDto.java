package com.example.clientes.infraestructure.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "clientes")
public class ClienteDto {

  @Id
  private String id;
  @Column(name = "tipo_id")
  private String tipoId;
  private String nombre;
  private String apellido;
  private Boolean estado;
}
