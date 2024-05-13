package com.example.sortingtest.controller;
import com.example.sortingtest.repository.SortHatRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class SortHatController {
    // It's optional to use repository or not
  //  private SortHatRepository sortHatRepository;

    @GetMapping(value="/sortHat")
    public String sortHat(){
        return "index";
    }
}
