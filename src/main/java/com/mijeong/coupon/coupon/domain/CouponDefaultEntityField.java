package com.mijeong.coupon.coupon.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@MappedSuperclass
public abstract class CouponDefaultEntityField {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
}
