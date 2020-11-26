package msaquery.sprintboot.repository.dto;

//import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ScDto {
	private String isin_code;
	private String trade_time;
	private int    trdprc_1;
	private String netchng_cls;
	private int    pctchng_1;
	private int    acvol_1;
	private int    turnover;
	private int    fill_size;
	private int    open_prc;
	private int    high_1;
	private int    low_1;
	private String open_time;
	private String high_time;
	private String low_time;
	private int    addavg_prc;
	private float  vol_rate;
	private int    ask_exec_sum;
	private int    bid_exec_sum;
	private float exec_rate;
	private String exec_askbid_cls;
	private String high_1_time;
}
