package com.vetnova.reportes.controller;

import com.vetnova.reportes.model.Reporte;
import com.vetnova.reportes.service.ReporteService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    private final ReporteService service;
    
    public ReporteController(ReporteService service) { 
        this.service = service; 
    }

    @PostMapping
    public ResponseEntity<Reporte> crearReporte(@Valid @RequestBody Reporte reporte) {
        return ResponseEntity.status(201).body(service.guardarReporte(reporte));
    }

    @GetMapping
    public ResponseEntity<List<Reporte>> obtenerTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }
}