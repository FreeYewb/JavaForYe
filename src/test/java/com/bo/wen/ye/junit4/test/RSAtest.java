package com.bo.wen.ye.junit4.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class RSAtest {
	
	
	public static void main(String[] args) {
//		JdbcTemplate jdbcTemplate = null;
//		String sql = "select * from ttcs_acccheck_info where asset_side = '" + "A060001002" + "' and trade_type='0'";
//		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
//		System.out.println(list);
		Properties properties = new Properties();
		
		String basePath = properties.getProperty("wangyi.savePath");
		String openDate = "yyyy-MM-dd";
		String oo = openDate.replaceAll("-", "");
		System.out.println(basePath);
		System.out.println(oo);
		String string = properties.toString(properties.addDay(new Date(), -1), "yyyyMMdd");
		System.out.println(string);
		
		StringBuffer sb = new StringBuffer();
		String basePagePath = sb.toString();
		System.out.println(basePagePath + " ====");
	
		
		System.out.println(StringUtils.isNotBlank(""));//�ж�ĳ�ַ����Ƿ�Ϊ���ҳ��Ȳ�Ϊ0�Ҳ��ɿհ׷�(whitespace)����
		
		String string2 ="*.tar.gz,*.md5,ac_summary_trans_02.txt,bill_loan_detail.txt,istmnt_loan_detail.txt,bill_repay_detail.txt,istmnt_repay_detail.txt,bill_exempt_detail.txt,istmnt_exempt_detail.txt,bill_daily_init_info.txt,istmnt_daily_init_info.txt,bill_int_calc.txt,istmnt_status_transfer_detail.txt,check_cnt.txt,trans_detail.txt";
		String[] fileFullNameList = string2.split(",");
		
		for (String s : fileFullNameList) {
			System.out.println(fileFullNameList.toString());
		}
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long star = System.currentTimeMillis();//���صĵ�ǰʱ�����1970/01/01 08:00:00�ĺ�����
		System.out.println(format.format(star));//����ǰʱ���ʽת��Ϊָ����ʽ
		
		Date date=new Date();//���ϵͳ��ǰ��ʱ��
		System.out.println(format.format(date));//����ǰʱ���ʽת��Ϊָ����ʽ
		String downloadMode = "";
		String downloadMode1 = "sftp1";
		if (StringUtils.isEmpty(downloadMode) || "sftp".equals(downloadMode1)) {
			
			System.out.println("ok");
		}
		System.out.println(StringUtils.isEmpty(downloadMode));
		
		String source = "abcd";
		if(source.contains("a")){
		                
		System.out.println("��");
		          }else{
		               System.out.println("��");
		          }
	
		String str = "Hello World !";
		System.out.println(str.contains("S"));
		System.out.println(str.contains("world"));
		System.out.println(str.contains("World"));
		System.out.println(str.contains("ell"));
		System.out.println(str.contains("ddd"));

	}
}
