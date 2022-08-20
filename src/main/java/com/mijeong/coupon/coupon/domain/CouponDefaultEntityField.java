package com.mijeong.coupon.coupon.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@MappedSuperclass
@Entity
public class CouponDefaultEntityField {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
}
