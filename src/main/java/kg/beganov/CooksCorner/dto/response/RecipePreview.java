package kg.beganov.CooksCorner.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
public class RecipePreview {
    Long id;
    String imagePath;
    String name;
    String author;
    Long likes;
    Long saves;
}
