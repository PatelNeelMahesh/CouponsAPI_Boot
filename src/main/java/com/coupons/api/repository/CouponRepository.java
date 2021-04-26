package com.coupons.api.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.coupons.api.model.Coupon;
public interface CouponRepository extends MongoRepository<Coupon,String> {

	
	
	}
