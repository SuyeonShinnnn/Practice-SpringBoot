# Practice-SpringBoot

---
### 스프링 웹 개발 기초

- **Annotation**
    - **@GetMapping**   
        HTTP Get method
    - **@ResponseBody**   
  객체를 json 기반 HTTP Body로 반환
    - **@Controller**   
  해당 클래스가 웹 애플리케이션의 컨트롤러임을 나타냄
    - **@RequestParam**


    @GetMapping("get-name")
    @ResponseBody
    public String requestParam(
            @RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);

        return hello;
    }

👉 ~/get-name?name=myname  
&emsp;&emsp;name: myname과 같은 json 형식으로 반환

---

### 회원 관리 예제 - 백엔드 개발

- **Annotation**
  - **@AfterEach**   
  각 테스트가 종료될 때마다 해당 어노테이션이 있는 함수 실행
  - **@BeforeEach**    
  각 테스트 실행 전에 호출   


- **Optional 클래스**
  - 값이 null이어도 NullPointException이 발생하지 않도록 함  
   

- **테스트 코드(Assertions)**
  - **assertEquals**   
    👉 assertEquals(expected, actual, message)    
    👉 assertEquals(expected, actual, delta, message)
      - expected값과 actual값 비교   
      - delta값보다 작은 차이는 같은 값으로 간주
      - 값이 다르면 화면에 message가 출력
  - **assertThat**   
  👉 assertThat(result).isEqualTo(message);
    - result와 message 비교