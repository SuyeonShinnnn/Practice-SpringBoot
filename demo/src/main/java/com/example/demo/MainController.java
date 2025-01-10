package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page){

        // addAttribute(키, 뷰에 전달할 값);
        // 컨트롤러가 뷰로 전송할 데이터 추가
        page.addAttribute("username", "Katy");
        page.addAttribute("color", "red");

        return "home.html";
    }
}
