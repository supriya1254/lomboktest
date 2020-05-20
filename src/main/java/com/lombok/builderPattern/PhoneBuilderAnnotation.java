package com.lombok.builderPattern;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class PhoneBuilderAnnotation {
    private String OS;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

}
