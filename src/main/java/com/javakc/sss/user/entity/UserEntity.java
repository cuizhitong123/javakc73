package com.javakc.sss.user.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="sss_user")
public class UserEntity {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
    private String userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_age")
    private String userAge;

    @Column(name="user_birthday")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date userBirthday;

    @Column(name="user_address")
    private String userAddress;


}
