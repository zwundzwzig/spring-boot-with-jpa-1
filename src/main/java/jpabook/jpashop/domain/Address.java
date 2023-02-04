package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Address {

  @Id
  @GeneratedValue
  @Column(name = "address_id")
  private Long id;
  private String city;
  private String street;
  private String zipcode;

}
