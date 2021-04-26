package com.coupons.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coupons.api.model.Coupon;
import com.coupons.api.repository.CouponRepository;

@RestController
public class CouponController {

	
	@Autowired
	private CouponRepository repository;
	
	@Autowired
	private MongoOperations mongoOperations;
	
	@GetMapping("/searchcoupon/{key}")
	@CrossOrigin(origins= "*")
	public List<Coupon> searchProduct(@PathVariable String key)
	{
		Query query =new Query();
		query.addCriteria(Criteria.where("from").regex(key));
		
		List<Coupon> coupon = mongoOperations.find(query, Coupon.class);
		return coupon;
		
	}

}
