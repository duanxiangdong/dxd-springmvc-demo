package com.duan.test.utils;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//import com.alibaba.fastjson.JSONObject;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class ZxingTest {
	public static void main(String[] args) {
		String filePath = "F://zxingtest";
		String fileName = UUID.randomUUID().toString().trim().replaceAll("-", "")+".png";
		System.out.println("fileName:"+fileName);
//		JSONObject json = new JSONObject();
//		json.put("URl", "weixin://wxpay/bizpayurl?pr=IrEEGn3");
		String content = "weixin://wxpay/bizpayurl?pr=PhbOSOi";// 内容
		int width = 400; // 图像宽度
        int height = 400; // 图像高度
        String format = "png";// 图像类型
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        try {// 生成矩阵 
			 BitMatrix bitMatrix = new MultiFormatWriter().encode(content,  BarcodeFormat.QR_CODE, width, height, hints);
			 Path path = FileSystems.getDefault().getPath(filePath, fileName); 
		     MatrixToImageWriter.writeToPath(bitMatrix, format, path);// 输出图像
		     System.out.println("输出成功");
        } catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
}