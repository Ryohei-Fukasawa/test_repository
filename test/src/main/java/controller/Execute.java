package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import model.TestPointModel;

@Slf4j
public class Execute {

	public static void main(String[] args) {
		//      偶数プログラム
		//		TestService testService = new TestService();
		//		testService.execute();

		//		パス解決
		//		File file = new File("C:\\TEMP\\お試しデータ.csv");
		//		String str = file.getAbsolutePath();
		//		System.out.println("pass : " + str);

		String line;
		List<TestPointModel> list = new ArrayList<TestPointModel>();

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("C:\\TEMP\\お試しデータ.csv")));) {
			while ((line = br.readLine()) != null) {
				var csvDate = line.split(",");
				//log.debug("csv datta is" + csvDate);
				TestPointModel tpm = new TestPointModel();
				//System.out.print(csvDate[1].getClass());
				//				String i = csvDate[1];
				//				tpm.setNationalLanguage(Integer.parseInt(i));

				tpm.setNationalLanguage(Integer.parseInt(csvDate[0]));
				tpm.setMath(Integer.parseInt(csvDate[1]));
				tpm.setSociety(Integer.parseInt(csvDate[2]));
				tpm.setScience(Integer.parseInt(csvDate[3]));
				tpm.setEnglish(Integer.parseInt(csvDate[4]));
				list.add(tpm);
			}
			list.forEach(e -> System.out.println(e.toString()));

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
