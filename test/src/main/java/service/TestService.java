package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.TestModel;

@Service
public class TestService {

	List<TestModel> testModelList = new ArrayList();

	public void execute() {

		for (int i = 0; i < 10; i++) {
			TestModel model = new TestModel();
			model.setKey("key" + i);
			model.setIndex(i);
			testModelList.add(model);
		}
		testModelList.stream().filter(e -> e.getIndex() % 2 == 0)
				.forEach(e -> e.setKey("偶数"));

		for (var a : testModelList) {
			System.out.println(a.getIndex() + " " + a.getKey());
		}

		// 結果表示
		System.out.println(testModelList);
		System.out.println(testModelList);
	}
}
