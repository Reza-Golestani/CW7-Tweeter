package mavenCW7.example.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString

public class Tweet {

    int id;
    String text;
    User user;
    LocalDateTime createdAt;

}
