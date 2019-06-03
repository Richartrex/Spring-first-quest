package whoisdoctor.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>" +
				"<li><a href='/Doctor/1'>Doctor 1</a></li>" +
				"<li><a href='/Doctor/2'>Doctor 2</a></li>" +
				"<li><a href='/Doctor/3'>Doctor 5</a></li>" +
				"<li><a href='/Doctor/4'>Doctor 9</a></li>" +
				"</ul>";
	}

	@RequestMapping("/Doctor/1")
	@ResponseBody
	public String FirstDoctor() {
		return "William Hartnell";
	}

	@RequestMapping("/Doctor/2")
	@ResponseBody
	public String ThirdDoctor() {
		return "Jon Pertwee";
	}

	@RequestMapping("/Doctor/3")
	@ResponseBody
	public String FifthDoctor() {
		return "Peter Davison";
	}

	@RequestMapping("/Doctor/4")
	@ResponseBody
	public String NinthDoctor() {
		return "Christopher Eccleston";
	}

}
