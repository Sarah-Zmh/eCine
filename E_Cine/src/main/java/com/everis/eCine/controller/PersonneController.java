package com.everis.eCine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.everis.eCine.model.Personne;
import com.everis.eCine.service.PersonneService;

@Controller
@RequestMapping("personnes")
public class PersonneController {
	private PersonneService personneService;
	@Autowired
    public void setCustomerService(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping
    public String index() {
        return "redirect:/personnes/1";
    }

    @GetMapping(value = "/{pageNumber}")
    public String list(@PathVariable Integer pageNumber, Model model) {
        Page<Personne> page = personneService.getList(pageNumber);

        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("list", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);

        return "personnes/list";

    }

    @GetMapping("/add")
    public String add(Model model) {

        model.addAttribute("personnes", new Personne());
        return "personnes/form";

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {

        model.addAttribute("personnes", personneService.get(id));
        return "personnes/form";

    }

    @PostMapping(value = "/save")
    public String save(Personne personne, final RedirectAttributes ra) {

        Personne save = personneService.save(personne);
        ra.addFlashAttribute("successFlash", "Cliente foi salvo com sucesso.");
        return "redirect:/personnes";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        personneService.delete(id);
        return "redirect:/personnes";

    }
}
