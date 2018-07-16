package com.zhuhaoran.util;

import java.util.Random;

public class questionRandomUtil {

	//id是范围
	public int[] getRandom(int id){
		
		int i = 0;
		int[] questionNum = {-1,-1,-1,-1};
		while(i<4){
			Random random = new Random();
			int no = random.nextInt(id);
			System.out.println(no);
			boolean flag = true;
			for(int j = 0 ; j <4 ; j++){
				if(no == questionNum[j]){
					flag = false;
					break;
				}
			}
			if(flag){
				questionNum[i] = no;
				i++;
			}
		}
		return questionNum;
	}
}
