package com.example.javaspringbootcovid.Controllers;

import com.example.javaspringbootcovid.Models.LocationStats;
import com.example.javaspringbootcovid.Services.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CovidService covidService;

    @GetMapping("/")
    public  String home(Model model){
        List<LocationStats> locationStatsList = covidService.getAllstats();
        int totalcase = locationStatsList.stream().mapToInt(stat -> stat.getLatestTotalcase()).sum();
        int totaclNewcase = locationStatsList.stream().mapToInt(stat -> stat.getDiffFromPrevday()).sum();
        model.addAttribute("LocationStat",covidService.getAllstats());
        model.addAttribute("totalnewcase",totaclNewcase);
        model.addAttribute("totalcase",totalcase);
        return "home";
    }
}
