package com.vetnova.reportes.service;

import com.vetnova.reportes.model.Reporte;
import com.vetnova.reportes.repository.ReporteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReporteService {
    
    private final ReporteRepository repository;
    
    public ReporteService(ReporteRepository repository) { 
        this.repository = repository; 
    }

    public Reporte guardarReporte(Reporte reporte) {
        return repository.save(reporte);
    }

    public List<Reporte> listarTodos() {
        return repository.findAll();
    }
}