package se.mickethai.whatever;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class User {
    private String name;
    private int age;

}