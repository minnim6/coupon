package com.mijeong.coupon.coupon.domain;

import lombok.Getter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Entity
public class CouponInformation extends CouponDefaultEntityField {
    private String couponName;
    private int discountAmount;
    private LocalDate crateAt;
    private int minimumPossibleAmount;
    private Long madePersonId;
    private int issuanceCount;
    private LocalDate validityDate;
    private CouponType couponType;
}
