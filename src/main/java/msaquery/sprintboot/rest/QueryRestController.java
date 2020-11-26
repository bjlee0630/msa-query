package msaquery.sprintboot.rest;

import java.util.List;

import msaquery.sprintboot.repository.dto.SbDto;
import msaquery.sprintboot.repository.dto.ScDto;
import msaquery.sprintboot.service.MsaQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryRestController {

	@Autowired
	private MsaQueryService msaQueryService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		return "Hello world!";
	}
	
	@RequestMapping(value="/{imageName}/{shrtCode}", method=RequestMethod.GET)
	public List<SbDto> selectSbList(@PathVariable("imageName") String imageName, @PathVariable("shrtCode") String shrtCode) throws Exception{
		List<SbDto> list = msaQueryService.selectSbList();
		System.out.println(list);
		return list;
	}
}
