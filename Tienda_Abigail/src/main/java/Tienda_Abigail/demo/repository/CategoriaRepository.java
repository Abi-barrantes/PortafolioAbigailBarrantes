/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda_Abigail.demo.repository;
import Tienda_Abigail.demo.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author abita
 */

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    public List<Categoria> findByActivoTrue();
    
}