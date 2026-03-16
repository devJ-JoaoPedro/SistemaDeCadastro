package dev.jpeu.cadSys.Jobs;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("jobs")
public class jobsController {

    @PostMapping("/addJob")
    public String addJob() {
        return "Job added";
    }

    @PutMapping("/modifyjob")
    public String modifyJob() {
        return "Job modified";
    }

    @DeleteMapping("deleteJob")
    public String deleteJob() {
        return "Job deleted";
    }

    @GetMapping("/showJobs")
    public String showJobs() {
        return "Jobs listed";
    }

}
