package com.mijeong.coupon.coupon.domain;

import jdk.jfr.Timestamp;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Table(name = "coupon_information")
@AttributeOverride(name = "id", column = @Column(name = "coupon_information_id"))
@Entity
public class CouponInformation extends CouponDefaultEntityField {

    @Column(name = "coupon_name")
    private String couponName;

    @Column(name = "discount_amount")
    private int discountAmount;

    @Column(name = "crate_at")
    @CreationTimestamp
    private LocalDate crateAt;

    @Column(name = "minimum_possible_amount")
    private int minimumPossibleAmount;

    @Column(name = "made_person_id")
    private Long madePersonId;

    @Column(name = "issuance_count")
    private int issuanceCount;

    @Column(name = "validity_date")
    @Timestamp
    private LocalDate validityDate;

    @Column(name = "after_used_validity_date")
    @Timestamp
    private LocalDate  afterUsedValidityDate;

    @Column(name = "coupon_type")
    @Enumerated(EnumType.STRING)
    private CouponType couponType;
}
