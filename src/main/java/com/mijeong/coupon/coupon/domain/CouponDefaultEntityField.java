package com.mijeong.coupon.coupon.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass
@Entity
public class CouponDefaultEntityField {
    @Id
    private Long id;
}
