
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hmt-05
 */
@RestController
public class fallbackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod() {
        return "Department service might be down or taking too long. Try again.";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod() {
        return "Department service might be down or taking too long. Try again.";
    }
}
