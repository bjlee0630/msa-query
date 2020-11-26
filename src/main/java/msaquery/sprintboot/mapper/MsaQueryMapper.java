package msaquery.sprintboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import msaquery.sprintboot.repository.dto.SbDto;
import msaquery.sprintboot.repository.dto.ScDto;

@Mapper
public interface MsaQueryMapper {
	List<SbDto> selectSbList() throws Exception;
	List<ScDto> selectScList() throws Exception;
}
