package com.cod.market.qustion.entity;

import com.cod.market.base.BaseEntity;
import com.cod.market.member.entity.Member;
import com.cod.market.product.entity.Product;
import jakarta.persistence.Entity;

@Entity
public class Question extends BaseEntity {
    private String title;
    private String body;

    private Member member;
    private Product product;
}