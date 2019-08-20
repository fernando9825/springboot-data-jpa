package com.fernando9825.springbootdatajpa.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.fernando9825.springbootdatajpa.models.entity.Cliente;


public interface IClienteDao extends CrudRepository<Cliente, Long>{

	
}
