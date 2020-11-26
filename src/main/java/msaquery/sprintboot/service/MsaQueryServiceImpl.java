package msaquery.sprintboot.service;

import msaquery.sprintboot.repository.dto.SbDto;
import msaquery.sprintboot.repository.dto.ScDto;
import msaquery.sprintboot.mapper.MsaQueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsaQueryServiceImpl implements MsaQueryService{

	@Autowired
	private MsaQueryMapper msaQueryMapper;
	
	@Override
	public List<SbDto> selectSbList() throws Exception {
		System.out.println("Impl");
		return msaQueryMapper.selectSbList();
	}
	
	public List<ScDto> selectScList() throws Exception {
		return msaQueryMapper.selectScList();
	}
}
