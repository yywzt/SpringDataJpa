package com.example;

import com.example.entity.PetGameRepositoryVo;
import com.example.entity.PetGameRepositoryVo2;
import com.example.entity.TestVo;
import com.example.repository.PetGameRepositoryRepository;
import com.example.repository.TestRepository;
import com.example.repository.UserInfRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleApplicationTests {

	@Autowired
	private TestRepository testRepository;

	@Autowired
	private PetGameRepositoryRepository petGameRepositoryRepository;

	@Test
	public void contextLoads() {
		/*List<TestVo> testVos = testRepository.findbyType();
		testVos.forEach(testVo -> {
			System.out.println("name: " + testVo.getName() + "code: " + testVo.getCode() + "descs: " + testVo.getDescs());
		});
		System.out.println(testVos);

		testVos = testRepository.findbyType2();
		testVos.forEach(testVo -> {
			System.out.println("name: " + testVo.getName() + "code: " + testVo.getCode() + "descs: " + testVo.getDescs());
		});
		System.out.println(testVos);

		String channelId = "AA1090";
		Long uid = Long.valueOf("854533803434188800");
		List<PetGameRepositoryVo> byType = petGameRepositoryRepository.findAllRepositoryByChannelIdAndUid(channelId, 1L, uid);
		byType.forEach(petGameRepositoryVo -> {
			System.out.println("desc: " + petGameRepositoryVo.getGoodsDesc() + "goodsCode: " + petGameRepositoryVo.getGoodsCode() + "goodNumber: " + petGameRepositoryVo.getShopGoodNumber());
		});
		System.out.println(byType);*/

		List<PetGameRepositoryVo2> some = petGameRepositoryRepository.findSome();
		some.forEach(petGameRepositoryVo -> {
			System.out.println("fullName: " + petGameRepositoryVo.getFullName());
			System.out.println("channelId: " + petGameRepositoryVo.getChannelId());
			System.out.println("shopGoodNumber: " + petGameRepositoryVo.getShopGoodNumber());
			System.out.println("createDate: " + petGameRepositoryVo.getCreateDate());
		});
		System.out.println(some);
	}

}
