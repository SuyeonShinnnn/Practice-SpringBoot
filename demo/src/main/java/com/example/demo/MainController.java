package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

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

    // ?에서 요청 매개변수 쿼리 시작
    // 키=값
    // 키-값 TKddms &로 분리
    // 예시 -> ~/?username=Katy&color=purple
    @RequestMapping("/")
    public String second(
            // required = false로 지정하면 비필수값으로 지정 가능
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String color,
            Model page){

        page.addAttribute("username", username);
        page.addAttribute("color", color);

        return "home.html";
    }

    // 경로 변수
    // 예시 -> /home/purple
    @RequestMapping("/home/{color}")
    public String homeColor(
            @PathVariable String color, Model page
    ){
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color);

        return "home.html";
    }
}
