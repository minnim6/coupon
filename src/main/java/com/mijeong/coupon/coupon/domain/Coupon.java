package com.mijeong.coupon.coupon.domain;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Entity
public class Coupon extends CouponDefaultEntityField {
    private Long usedUserId;
    @ManyToOne
    private CouponInformation couponInformation;
    private String couponCode;
    private LocalDate usedDate;
    private LocalDate registrationDate;
    private Boolean usedStatus;

}
