package com.mijeong.coupon.coupon.domain;
import jdk.jfr.Timestamp;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Table(name = "coupon")
@Entity
public class Coupon extends CouponDefaultEntityField {

    @Column(name = "used_user_id")
    private Long usedUserId;

    @Column(name = "coupon_information_id")
    @ManyToOne
    private CouponInformation couponInformation;

    @Column(name = "coupon_code")
    private String couponCode;

    @Column(name = "used_date")
    @Timestamp
    private LocalDate usedDate;

    @Column(name = "registration_date")
    @Timestamp
    private LocalDate registrationDate;

    @Column(name = "used_status")
    private Boolean usedStatus;

}
