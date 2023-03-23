package com.example.clientes.infraestructure.adapter;

import com.example.clientes.domain.entities.Cliente;
import com.example.clientes.infraestructure.mapper.ClienteMapper;
import com.example.clientes.infraestructure.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ClienteSaveAdapterTest {

  @InjectMocks
  private ClienteSaveAdapter clienteSaveAdapter;
  @Mock
  private ClienteRepository clienteRepository;
  @Mock
  private ClienteMapper clienteMapper;

  @Test
  void saveCliente() {
    Cliente cliente = Cliente.builder().id("123").tipoId("CC")
        .nombre("Jario").apellido("Herrera").estado(Boolean.TRUE).build();

    clienteSaveAdapter.saveCliente(cliente);
    Mockito.verify(clienteRepository, Mockito.times(1)).save(clienteMapper.toClienteDto(cliente));
  }
}