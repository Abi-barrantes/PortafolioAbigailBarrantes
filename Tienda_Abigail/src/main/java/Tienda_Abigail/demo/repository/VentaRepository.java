package Tienda_Abigail.demo.repository;

import Tienda_Abigail.demo.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Integer>{
    
}
