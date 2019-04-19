package com.example;

import com.example.dto.PetGameRepositoryDto;
import com.example.entity.PetGameRepository;
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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
		List<TestVo> testVos = testRepository.findbyType();
		testVos.forEach(testVo -> {
			System.out.println("name: " + testVo.getName() + "code: " + testVo.getCode() + "descs: " + testVo.getDescs());
		});
		System.out.println(testVos);

		testVos = testRepository.findbyType2();
		testVos.forEach(testVo -> {
			System.out.println("name: " + testVo.getName() + "code: " + testVo.getCode() + "descs: " + testVo.getDescs());
		});
		System.out.println(testVos);

		System.out.println("---------------findAllRepositoryByChannelIdAndUid-----------------");
		String channelId = "AA1090";
		Long uid = Long.valueOf("854533803434188800");
		List<PetGameRepositoryVo> byType = petGameRepositoryRepository.findAllRepositoryByChannelIdAndUid(channelId, 1, uid);
		byType.forEach(petGameRepositoryVo -> {
			System.out.println("desc: " + petGameRepositoryVo.getGoodsDesc() + "goodsCode: " + petGameRepositoryVo.getGoodsCode() + "goodNumber: " + petGameRepositoryVo.getShopGoodNumber());
		});
		System.out.println(byType);

		System.out.println("---------------findSome-----------------");
		List<PetGameRepositoryVo2> some = petGameRepositoryRepository.findSome();
		some.forEach(petGameRepositoryVo -> {
			System.out.println("fullName: " + petGameRepositoryVo.getFullName());
			System.out.println("channelId: " + petGameRepositoryVo.getChannelId());
			System.out.println("shopGoodNumber: " + petGameRepositoryVo.getShopGoodNumber());
			System.out.println("createDate: " + petGameRepositoryVo.getCreateDate());
		});
		System.out.println(some);

		System.out.println("---------------findSome2-----------------");
		List<PetGameRepositoryDto> some2 = petGameRepositoryRepository.findSome2();
		some2.forEach(petGameRepositoryVo -> {
			System.out.println("channelId: " + petGameRepositoryVo.getChannelId());
			System.out.println("shopGoodNumber: " + petGameRepositoryVo.getShopGoodNumber());
			System.out.println("createDate: " + petGameRepositoryVo.getCreateDate());
		});
		System.out.println(some2);

		System.out.println("---------------findInnerSome-----------------");
		some = petGameRepositoryRepository.findInnerSome();
		some.forEach(petGameRepositoryVo -> {
			System.out.println("channelId: " + petGameRepositoryVo.getChannelId());
			System.out.println("shopGoodNumber: " + petGameRepositoryVo.getShopGoodNumber());
			System.out.println("createDate: " + petGameRepositoryVo.getCreateDate());
		});
		System.out.println(some);

		System.out.println("---------------findInnerSome2-----------------");
		some2 = petGameRepositoryRepository.findInnerSome2();
		some2.forEach(petGameRepositoryVo -> {
			System.out.println("channelId: " + petGameRepositoryVo.getChannelId());
			System.out.println("shopGoodNumber: " + petGameRepositoryVo.getShopGoodNumber());
			System.out.println("createDate: " + petGameRepositoryVo.getCreateDate());
		});
		System.out.println(some2);
	}

	@Test
	public void test1(){
		System.out.println("---------------findAllRepositoryByChannelIdAndUid-----------------");
		String channelId = "AA1090";
		Long uid = Long.valueOf("854533803434188800");
		List<PetGameRepositoryVo> byType = petGameRepositoryRepository.findAllRepositoryByChannelIdAndUid2(channelId, 1, uid);
		byType.forEach(petGameRepositoryVo -> {
			System.out.println("desc: " + petGameRepositoryVo.getGoodsDesc() + "goodsCode: " + petGameRepositoryVo.getGoodsCode() + "goodNumber: " + petGameRepositoryVo.getShopGoodNumber());
		});
		System.out.println(byType);
	}
	@Test
	public void test1Page(){
		System.out.println("---------------findAllRepositoryByChannelIdAndUid-----------------");
		String channelId = "AA1090";
		Long uid = Long.valueOf("854533803434188800");
		PageRequest pageRequest = new PageRequest(0,8);
		Page<PetGameRepositoryVo> byType = petGameRepositoryRepository.findAllRepositoryByChannelIdAndUid2Page(channelId, 1, uid,pageRequest);
		System.out.println(byType.getNumber());
		System.out.println(byType.getTotalPages());
		System.out.println(byType.getTotalElements());
		System.out.println(byType.getSize());
		System.out.println(byType.getContent());
		System.out.println(byType.getContent().size());
	}

	@Test
	public void test2(){
		PetGameRepository petGameRepository = new PetGameRepository();
		PetGameRepository one = petGameRepositoryRepository.getOne(1L);
		one.setShopGoodNumber(one.getShopGoodNumber() + 1);
		petGameRepositoryRepository.save(one);
		System.out.println(petGameRepository);
	}

}
