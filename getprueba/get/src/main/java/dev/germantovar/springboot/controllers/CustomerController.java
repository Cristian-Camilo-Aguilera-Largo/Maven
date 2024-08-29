package dev.germantovar.springboot.controllers;
import dev.germantovar.springboot.entities.Customer;

import dev.germantovar.springboot.repository.CustomerRepository;

import dev.germantovar.springboot.services.ICustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
//Esta anotacion tiene como funcionalidad crear servicios web RESTful, combina las anotaciones @Controller y @ResponseBody.
//Esto permite  que los metodos dentro de la clase devuelvan directamente datos en formato JSON o XML
public class CustomerController {

    @Autowired//Esta anotacion se utiliza para habilitar la inyeccion automatica de dependencias.Esto significa que se encarga
              //de proporcionar automaticamente las instancias necesarias de las dependencias cuando se crea un bean
    private ICustomerService service;


    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("tipificacion1")/*Se utiliza para mapear solicitudes HTTTP GET a metodos especificos del controlador*/
    public List<Customer> getAll() {
        return service.getAll();
    }

}
