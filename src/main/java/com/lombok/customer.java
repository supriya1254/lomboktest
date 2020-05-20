package com.lombok;

import lombok.*;
import java.util.Date;

// Code with Lombok annotations:
@Data
public class customer {

    private Long cutomerId;
    private String firstName;
    private String lastname;
    private Date dob;
    private String phoneNo;
    private double[] cached;
    // Code required for getter and setter method, not needed to write.

}
