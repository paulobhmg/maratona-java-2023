package com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.interfaces;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.employee.Employee;

public interface ICordenation {
    boolean contract(Employee employee);
    boolean drop(Employee employee);
}
