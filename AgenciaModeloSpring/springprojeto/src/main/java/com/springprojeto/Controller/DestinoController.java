package com.springprojeto.Controller;

import com.springprojeto.model.Destino;
import com.springprojeto.repositories.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class DestinoController {
    @Autowired
    private DestinoRepository destinoRepository;

    @GetMapping("/destinos")
    public String listarDestinos(Model model) {
        List<Destino> destinos = destinoRepository.findAll();
        model.addAttribute("destinos", destinos);
        return "listarDestinos";
    }

    @GetMapping("/destinos/form")
    public String exibirFormulario(Model model) {
        model.addAttribute("destino", new Destino());
        return "formDestino";
    }

    @PostMapping("/destinos/salvar")
    public String salvarDestino(Destino destino) {
        destinoRepository.save(destino);
        return "redirect:/destinos";
    }

    @GetMapping("/destinos/editar/{id}")
    public String editarDestino(@PathVariable Long id, Model model) {
        Optional<Destino> destinoOptional = destinoRepository.findById(id);
        if (destinoOptional.isPresent()) {
            model.addAttribute("destino", destinoOptional.get());
            return "editarDestino";
        } else {
            return "redirect:/destinos";
        }
    }

    @PostMapping("/destinos/atualizar")
    public String atualizarDestino(Destino destino) {
        destinoRepository.save(destino);
        return "redirect:/destinos";
    }

    @GetMapping("/destinos/deletar/{id}")
    public String deletarDestino(@PathVariable Long id) {
        destinoRepository.deleteById(id);
        return "redirect:/destinos";
    }
}
