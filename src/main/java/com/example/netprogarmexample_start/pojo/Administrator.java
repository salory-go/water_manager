package com.example.netprogarmexample_start.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrator {
    private Integer id;
    private String username;
    private String password;
}
