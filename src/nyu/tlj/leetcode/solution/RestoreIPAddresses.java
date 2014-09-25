package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

import nyu.tlj.leetcode.common.OutputUtil;

public class RestoreIPAddresses {

	public static void main(String[] args) {
		RestoreIPAddresses r = new RestoreIPAddresses();
		
//		String aString = "0000";
//		
//		aString.startsWith("0");
		r.restoreIpAddresses("010010");
	}

	public List<String> restoreIpAddresses(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		List<String> path = new ArrayList<String>();
		restoreIpAddressesHelper(res,path,s,0);
		
		path = assembelResult(res);
		return path;

	}
	
	private List<String> assembelResult(List<List<String>> res) {
		List<String> result = new ArrayList<String>();
		List<String> tmpreslt = new ArrayList<String>();
		StringBuilder tmpres = new StringBuilder();
		
		for (int i = 0; i < res.size(); i++) {
			tmpreslt = res.get(i);
			tmpres = new StringBuilder();
			for (int j = 0; j < tmpreslt.size(); j++) {
				tmpres.append( tmpreslt.get(j) ).append(".");
			}
			String ipString = tmpres.toString().substring(0, tmpres.length()-1);
			result.add(ipString);
			
		}
		
		
		
		return result;
		
	}
	
	public void restoreIpAddressesHelper(List<List<String>> res,List<String> path,String srcIp,int pos) {
		
		if(path.size() == 4 && pos != srcIp.length()) {
			
			return;
		}else if(path.size() == 4 && pos == srcIp.length()) {
//			System.out.println(pos);
//			OutputUtil.outputOneArraylist(path);
			res.add( new ArrayList<String>(path)  );
		}
		String temIp = null;
		for (int i = pos+1; i <= srcIp.length() && (i-pos) <= 3; i++) {
			temIp =  srcIp.substring(pos, i) ;
			if(temIp.length()>1 && temIp.startsWith("0")) {
				return;
			}
			if( Integer.parseInt(temIp ) > 255 ) {
				return;
			}
			
			
			path.add( srcIp.substring(pos, i) );
			restoreIpAddressesHelper(res,path,srcIp,i);
			path.remove(path.size()-1);
			
		}
		
		
		

	}
}
