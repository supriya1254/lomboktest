package com.lombok.builderPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {

    private String OS;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;
}
