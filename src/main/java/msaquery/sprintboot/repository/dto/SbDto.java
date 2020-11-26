package msaquery.sprintboot.repository.dto;

import java.time.LocalDateTime;
import lombok.Data;

//@Data
public class SbDto {
	private String isin_code;
	public String getIsin_code() {
		return isin_code;
	}
	public void setIsin_code(String isin_code) {
		this.isin_code = isin_code;
	}
	public String getShrt_code() {
		return shrt_code;
	}
	public void setShrt_code(String shrt_code) {
		this.shrt_code = shrt_code;
	}
	public String getMarketperiod_cls() {
		return marketperiod_cls;
	}
	public void setMarketperiod_cls(String marketperiod_cls) {
		this.marketperiod_cls = marketperiod_cls;
	}
	public String getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(String seq_no) {
		this.seq_no = seq_no;
	}
	public String getEnter_date() {
		return enter_date;
	}
	public void setEnter_date(String enter_date) {
		this.enter_date = enter_date;
	}
	public String getKor_name() {
		return kor_name;
	}
	public void setKor_name(String kor_name) {
		this.kor_name = kor_name;
	}
	public String getEng_name() {
		return eng_name;
	}
	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}
	private String shrt_code;
	private String marketperiod_cls;
	private String seq_no;
	private String enter_date;
	private String kor_name;
	private String eng_name;
	
//	private String large_cls;
//	private String middle_cls;
//	private String small_cls;
//	private String industry_code;
//	private String kospi200_cls;
//	private String kospi100_cls;
//	private String kospi50_cls;
//	private String kospiit_kosdaqit50_cls;
//	private String total_market_cls;
//	private String kosdi_exec_cls;
//	private String list_cls;
//	private int    list_num;
//	private String stock_cls;
//	private String settle_ymd;
//	private int face_value;
//	private String face_value_cls;
//	private int hst_trdprc_1;
//	private int hst_acvol_1;
//	private int hst_turnover;
//	private int    base_prc;
//	private float  uplimit;
//	private int    lolimit;
//	private int    daeyoung_prc;
//	private String stop_cls;
//	private String manage_cls;
//	private String control_cls;
//	private String lock_cls;
//	private String disclosure_cls;
//	private int    paper_prc;
}
