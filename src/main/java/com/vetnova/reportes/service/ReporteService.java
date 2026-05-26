package com.vetnova.reportes.service;

import com.vetnova.reportes.model.Reporte;
import com.vetnova.reportes.repository.ReporteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReporteService {
    
    private static final Logger logger = LoggerFactory.getLogger(ReporteService.class);
    private final ReporteRepository repository;
    
    public ReporteService(ReporteRepository repository) { 
        this.repository = repository; 
    }

    public Reporte guardarReporte(Reporte reporte) {
        logger.info("LOG: Guardando reporte con descripción: {}", reporte.getDescripcion());
        return repository.save(reporte);
    }

    public List<Reporte> listarTodos() {
        logger.info("LOG: Consultando lista completa de reportes.");
        return repository.findAll();
    }

    public void eliminarReporte(Long id) {
        logger.info("LOG: Eliminando reporte con ID: {}", id);
        repository.deleteById(id);
    }
}