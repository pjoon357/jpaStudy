package jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Delivery extends BaseEntity{
    @Id
    private Long id;

    private String city;
    private String street;
    private String zipcode;
    private DeliveryStatus status;
}
