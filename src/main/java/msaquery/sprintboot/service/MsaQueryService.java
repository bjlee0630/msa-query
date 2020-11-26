package msaquery.sprintboot.service;

import msaquery.sprintboot.repository.dto.SbDto;
import msaquery.sprintboot.repository.dto.ScDto;
import java.util.List;

public interface MsaQueryService {
	List<SbDto> selectSbList() throws Exception;
	List<ScDto> selectScList() throws Exception;
}
