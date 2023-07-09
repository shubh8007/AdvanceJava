package com.app.entitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter

@AllArgsConstructor

public enum ReservationType {
AC(1200),NONAC(900),SLEEPER(600),ORDINARY(500);

private double rate;
}
