package mavenCW7.example.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

public class Tweet {

    int id;
    String text;
    User user;
    LocalDateTime createdAt;
    int likeCount;

}
